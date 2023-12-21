package com.example.lab;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class ImageToggle extends AppCompatActivity {
    ImageView img1,img2;
    Button btn;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_toggle);
        img1=findViewById(R.id.img1);
        img2=findViewById(R.id.img2);
        btn=findViewById(R.id.btn);
        img1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                img1.setVisibility(View.GONE);
                img2.setVisibility(View.VISIBLE);
            }
        });
        img2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                img2.setVisibility(View.GONE);
                img1.setVisibility(View.VISIBLE);
            }
        });
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(ImageToggle.this, MainActivity.class);
                startActivity(i);
            }
        });
    }
}