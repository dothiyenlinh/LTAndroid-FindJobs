package com.example.findjobs.NTD;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.findjobs.R;

public class NTDTrangCaNhan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ntdtrang_ca_nhan);
    }

    public static class NTDLogin extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_ntdlogin);
        }
    }
}
