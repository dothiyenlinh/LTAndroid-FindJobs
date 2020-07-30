package com.example.findjobs;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.findjobs.NTD.NTDLogin;
import com.example.findjobs.NXV.NXVLogin;
import com.example.findjobs.Database.CreateDatabase;

public class Choose extends AppCompatActivity {
    Button btndangnhaptd, btndangnhapxv;
    static SQLiteDatabase database;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose);

//        CreateDatabase createDatabaser = new CreateDatabase(Choose.this);
//        createDatabaser.onCreate(database);

        btndangnhaptd = (Button) findViewById(R.id.btnchondntd);
        btndangnhapxv = (Button) findViewById(R.id.btnchondnxv1);
        System.out.println(1);
        btndangnhapxv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openLoginNguoiXinViec();
            }
        });
        btndangnhaptd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openLoginNhaTuyenDung();
            }
        });
    }
    private void openLoginNhaTuyenDung(){
        Intent intent =new Intent(Choose.this, NTDLogin.class);
        startActivity(intent);
    }
    private void openLoginNguoiXinViec(){
        Intent intent =new Intent(Choose.this, NXVLogin.class);
        startActivity(intent);
    }
}