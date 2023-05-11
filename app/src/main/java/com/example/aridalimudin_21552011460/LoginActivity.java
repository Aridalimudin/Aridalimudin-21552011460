package com.example.aridalimudin_21552011460;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    ImageView L_img_1;
    Button L_btn_1;
    TextView txt_register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        L_img_1 = (ImageView) findViewById(R.id.L_img_1);
        L_btn_1 = (Button) findViewById(R.id.L_btn_1);
        txt_register = (TextView) findViewById(R.id.txt_register);

        L_img_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent LoginActivity = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(LoginActivity);
            }
        });

        L_btn_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent LoginActivity = new Intent(getApplicationContext(), BiodataActivity.class);
                startActivity(LoginActivity);
            }
        });

        txt_register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent LoginActivity = new Intent(getApplicationContext(), RegisterActivity.class);
                startActivity(LoginActivity);
            }
        });
    }
}