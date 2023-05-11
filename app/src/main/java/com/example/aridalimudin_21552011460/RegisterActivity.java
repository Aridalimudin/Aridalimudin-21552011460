package com.example.aridalimudin_21552011460;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class RegisterActivity extends AppCompatActivity {

    Button R_btn_1;
    TextView txt_Login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        R_btn_1 = (Button) findViewById(R.id.R_btn_1);
        txt_Login = (TextView) findViewById(R.id.txt_Login);

        R_btn_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent RegisterActivity = new Intent(getApplicationContext(), LoginActivity.class);
                startActivity(RegisterActivity);
            }
        });

        txt_Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent RegisterActivity = new Intent(getApplicationContext(), LoginActivity.class);
                startActivity(RegisterActivity);
            }
        });
    }
}