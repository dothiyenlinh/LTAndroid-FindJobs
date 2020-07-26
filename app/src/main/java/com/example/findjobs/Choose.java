package com.example.findjobs;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.findjobs.NTD.NTDLogin;

public class Choose extends AppCompatActivity {
    Button btndangnhaptd, btndangnhapxv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose);



        btndangnhaptd = (Button) findViewById(R.id.btnchondntd);
        btndangnhapxv = (Button) findViewById(R.id.btndangnhapnxv);

        btndangnhapxv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Choose.this,NTDLogin.class);
                startActivity(i);
            }
        });
    }
}