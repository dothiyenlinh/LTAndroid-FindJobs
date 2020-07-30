package com.example.findjobs.NXV;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.findjobs.DAO.JobSeekerDAO;
import com.example.findjobs.DTO.JobSeekerDTO;
import com.example.findjobs.R;


public class NXVDangKy extends AppCompatActivity implements View.OnClickListener {

    EditText edUsernameXV, editEmailXV, editpasswordXV, editPhoneXV;
    Button btnDangKyXV;


    JobSeekerDAO jobSeekerDAO;
    JobSeekerDTO jobSeekerDTO;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nxvdang_ky);

        edUsernameXV = (EditText) findViewById(R.id.edUsernameXV);
        editpasswordXV = (EditText) findViewById(R.id.editpasswordXV);
        editEmailXV = (EditText) findViewById(R.id.editEmailXV);
        editPhoneXV = (EditText) findViewById(R.id.editPhoneXV);
        btnDangKyXV = (Button) findViewById(R.id.btnDangKyXV);

        jobSeekerDAO = new JobSeekerDAO(this);
        btnDangKyXV.setOnClickListener(this);
    }

    public void DongYThemNhanVien() {
        String sTenDangNhap = edUsernameXV.getText().toString();
        String sMatKhau = editpasswordXV.getText().toString();
        String sEmail = editEmailXV.getText().toString();
        int sPhone = Integer.parseInt(editPhoneXV.getText().toString());

        if (sTenDangNhap == null || sTenDangNhap.equals("")) {
            Toast.makeText(NXVDangKy.this, getResources().getString(R.string.loinhaptendangnhap), Toast.LENGTH_SHORT).show();
        } else if (sMatKhau == null || sMatKhau.equals("")) {
            Toast.makeText(NXVDangKy.this, getResources().getString(R.string.loinhapmatkhau), Toast.LENGTH_SHORT).show();
        } else {
            JobSeekerDTO jobSeekerDTO = new JobSeekerDTO();
            jobSeekerDTO.setUsername(sTenDangNhap);
            jobSeekerDTO.setPassword(sMatKhau);
            jobSeekerDTO.setEmail(sEmail);
            jobSeekerDTO.setPhone(sPhone);

            long kiemtra = jobSeekerDAO.ThemNhanVien(jobSeekerDTO);
            if (kiemtra != -1) {
                Toast.makeText(NXVDangKy.this, getResources().getString(R.string.themthanhcong), Toast.LENGTH_SHORT).show();
                return;
            } else {
                Toast.makeText(NXVDangKy.this, getResources().getString(R.string.themthatbai), Toast.LENGTH_SHORT).show();
                return;
            }
        }
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        switch (id) {
            case R.id.btnDangKyXV:
                DongYThemNhanVien();
                break;
        }
    }
}