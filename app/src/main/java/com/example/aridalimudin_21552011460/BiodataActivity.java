package com.example.aridalimudin_21552011460;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class BiodataActivity extends AppCompatActivity implements View.OnClickListener {

    ImageView ig, fb, tiktok;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_biodata);

        ig = (ImageView) findViewById(R.id.ig);
        ig.setOnClickListener(this);
        fb = (ImageView) findViewById(R.id.fb);
        fb.setOnClickListener(this);
        tiktok = (ImageView) findViewById(R.id.tiktok);
        tiktok.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.ig:
                Intent ig = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/ar22id_"));
                startActivity(ig);
                break;
            case R.id.fb:
                Intent fb = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/profile.php?id=100070457084364&mibextid=ZbWKwl"));
                startActivity(fb);
                break;
            case R.id.tiktok:
                Intent tiktok = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.tiktok.com/@aridal22"));
                startActivity(tiktok);
                break;
            default:
                break;
        }
    }
}