package com.responsi.ngobrolkuy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class RegisterActivity extends AppCompatActivity {

    private EditText Username, Email, Password, ConfPass;
    private Button Register, AdaAkun;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        Username = findViewById(R.id.etusernamereg);
        Email = findViewById(R.id.etemailreg);
        Password = findViewById(R.id.etpassreg);
        ConfPass = findViewById(R.id.etconfirmpassreg);
        Register = findViewById(R.id.btnRegister);
        AdaAkun = findViewById(R.id.btnAdaAkun);

        Register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindah_3 = new Intent(RegisterActivity.this, ProfilePicActivity.class);
                startActivity(pindah_3);
            }
        });
        AdaAkun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindah_4 = new Intent(RegisterActivity.this, LoginActivity.class);
                startActivity(pindah_4);
            }
        });
    }
}