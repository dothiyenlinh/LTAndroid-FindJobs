package com.example.findjobs.NTD;

import android.app.AlertDialog;
import android.content.DialogInterface;
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

        txtquenmk = (TextView) findViewById(R.id.txtquemkntd);
        txttaotk= (TextView) findViewById(R.id.txtdangkyntd);
        btndangnhap=(Button) findViewById(R.id.logintd);
        edtusername=findViewById(R.id.usernametd);
        edtpass=findViewById(R.id.passwordtd);
    }

    @Override
    protected void onStart() {
        super.onStart();
        txtquenmk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openForgotPasswordActivity();
            }
        });

        txttaotk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openRegisterActivity();
            }
        });
        btndangnhap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String us,ps;
                us=edtusername.getText().toString();
                ps=edtpass.getText().toString();
                if(us.equals("Luot")&&ps.equals("123123")){
                    openIndexNTD();
                }
                else {
                    Alert("Sai thông tin tài khoản");
                }
            }
        });
    }

    @Override
    protected void onStop() {
        super.onStop();
    }
    private void openIndexNTD(){
        Intent intent=new Intent(NTDLogin.this,NTDIndex.class);
        startActivity(intent);
    }
    public void Alert(String message)
    {
        AlertDialog alertDialog = new AlertDialog.Builder(NTDLogin.this).create();
        alertDialog.setTitle("Thông báo");
        alertDialog.setMessage(message);
        alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "OK",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                });
        alertDialog.show();
    }
    private void openRegisterActivity(){
        Intent intent=new Intent(NTDLogin.this, NTDDangKy.class);
        startActivity(intent);
    }
    private void openForgotPasswordActivity(){
        Intent intent=new Intent(NTDLogin.this, NTDQuenMK.class);
        startActivity(intent);
    }
}