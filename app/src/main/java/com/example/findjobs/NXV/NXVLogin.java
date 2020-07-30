package com.example.findjobs.NXV;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.findjobs.DAO.JobSeekerDAO;
import com.example.findjobs.DTO.JobSeekerDTO;
import com.example.findjobs.Database.CreateDatabase;
import com.example.findjobs.R;

public class NXVLogin extends AppCompatActivity implements View.OnClickListener{
    static SQLiteDatabase database;

    //   int idperson = -1;
    Button btndangnhapnxv;
    EditText usernamenxv,passnxv;
    TextView txtquemknxv,txtdangkynxv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_nxvlogin);
        btndangnhapnxv=findViewById(R.id.btndangnhapnxv);
        usernamenxv=findViewById(R.id.usernamenxv);
        passnxv=findViewById(R.id.passnxv);
        txtquemknxv=findViewById(R.id.txtquemknxv);
        txtdangkynxv=findViewById(R.id.txtdangkynxv);

        JobSeekerDAO jobSeekerDAO = new JobSeekerDAO(this);
        btndangnhapnxv.setOnClickListener(this);
        txtdangkynxv.setOnClickListener(this);
    }


    public void btndangnhap(){
        String sTenDangNhap = usernamenxv.getText().toString();
        String sMatKhau = passnxv.getText().toString();
        boolean kiemtra = JobSeekerDAO.Kiemtradangnhap(sTenDangNhap, sMatKhau);

        if(kiemtra){
            Intent iTrangchu = new Intent(NXVLogin.this,NXVIndex.class);
            startActivity(iTrangchu);

        }else{
            Toast.makeText(NXVLogin.this,"Đăng nhập thất bại !",Toast.LENGTH_SHORT).show();
        }
    }

    public void Dangky(){
        Intent idangky = new Intent(NXVLogin.this, NXVDangKy.class);
        startActivity(idangky);
    }
    @Override
    public void onClick(View v) {
        int id = v.getId();
        switch (id){
            case R.id.btndangnhapnxv:
                btndangnhap();
                ;break;

            case R.id.txtdangkynxv:
                Dangky();
                ;break;
        }

    }
}
