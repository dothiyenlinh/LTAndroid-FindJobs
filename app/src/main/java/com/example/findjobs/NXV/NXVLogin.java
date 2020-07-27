package com.example.findjobs.NXV;

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

public class NXVLogin extends AppCompatActivity {

    int idperson = -1;
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
    }

    @Override
    protected void onStart() {
        super.onStart();
        final String us,ps;
        us=usernamenxv.getText().toString();
        ps=passnxv.getText().toString();
        btndangnhapnxv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (us.equals("Linh")&&ps.equals("123123")){
                    Intent intent=new Intent(NXVLogin.this,NXVIndex.class);
                    startActivity(intent);
                }
                else {
                    Alert("Sai tài khoản hoặc mật khẩu");
                }

            }
        });
        txtdangkynxv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openRegisterActivity();
            }
        });
        txtquemknxv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openForgotPasswordActivity();
            }
        });
    }

    @Override
    protected void onStop() {
        super.onStop();
    }
    public void Alert(String message)
    {
        AlertDialog alertDialog = new AlertDialog.Builder(NXVLogin.this).create();
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
        Intent intent=new Intent(NXVLogin.this,NXVDangKy.class);
        startActivity(intent);
    }
    private void openForgotPasswordActivity(){
        Intent intent=new Intent(NXVLogin.this,NXVQuenMK.class);
        startActivity(intent);
    }
}
