package com.example.lab;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Home extends AppCompatActivity {
    private String Shared_pref_name="my_pref";
    SharedPreferences sharedPreferences;
    String Shared_name="name";
    String Shared_age="age";
    TextView nm,ag;
    Button btn;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        nm=findViewById(R.id.name);
        ag=findViewById(R.id.age);
        btn=findViewById(R.id.bttn);
        sharedPreferences=getSharedPreferences(Shared_pref_name, Context.MODE_PRIVATE);
        String name=sharedPreferences.getString(Shared_name,null);
        String age=sharedPreferences.getString(Shared_age,null);
        if(name!=null || age!=null){
            nm.setText("Name:"+name);
            ag.setText("Age:"+age);
        }
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences.Editor editor=sharedPreferences.edit();
                editor.clear();
                editor.commit();
                finish();
                Toast.makeText(Home.this, "Logout Successfully", Toast.LENGTH_SHORT).show();
            }
        });
    }
}