package com.responsi.ngobrolkuy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {

    private EditText etUser,etPass;
    private Button buttonLogin, buttonNoAkun;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        etUser =findViewById(R.id.etusername);
        etPass = findViewById(R.id.etpass);
        buttonLogin = findViewById(R.id.btnLogin);
        buttonNoAkun = findViewById(R.id.btnNoAkun);

        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindah_1 = new Intent(LoginActivity.this, HomeActivity.class);
                startActivity(pindah_1);
            }
        });

        buttonNoAkun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindah_2 = new Intent(LoginActivity.this, RegisterActivity.class);
                startActivity(pindah_2);
            }
        });
    }


}