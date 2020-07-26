package com.example.findjobs.NTD;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.findjobs.R;

public class NTDLogin extends AppCompatActivity {
    Button btndangnhap;
    EditText edtusername, edtpass;
    TextView txtquenmk, txttaotk;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ntdlogin);

        txtquenmk = (TextView) findViewById(R.id.txtquemknxv);
        txttaotk= (TextView) findViewById(R.id.txtdangkynxv);
        btndangnhap=(Button) findViewById(R.id.btndangnhapnxv);

        txtquenmk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getBaseContext(), NTDQuenMK.class);
                startActivity(i);
            }
        });

        txttaotk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(getBaseContext(), NTDDangKy.class);
                startActivity(i1);
            }
        });
    }
}