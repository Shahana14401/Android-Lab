package com.example.lab;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Set;

public class sharedPref extends AppCompatActivity {
    private String Shared_pref_name="my_pref";
    SharedPreferences sharedPreferences;
    String Shared_name="name";
    String Shared_age="age";
    EditText nm,ag;
    Button bt;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shared_pref);
        nm=findViewById(R.id.nme);
        ag=findViewById(R.id.ag);
        bt=findViewById(R.id.btn);

        sharedPreferences=getSharedPreferences(Shared_pref_name, Context.MODE_PRIVATE);
        String name=sharedPreferences.getString(Shared_name,null);
        String age=sharedPreferences.getString(Shared_age,null);
        if(age!=null || name!=null){
            nm.setText(name);
            ag.setText(age);
        }
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String getName=nm.getText().toString();
                String getAge=ag.getText().toString();
                SharedPreferences.Editor editor=sharedPreferences.edit();
                editor.putString(Shared_name,getName);
                editor.putString(Shared_age,getAge);
                editor.apply();

                Intent i=new Intent(sharedPref.this,Home.class);
                startActivity(i);

                Toast.makeText(sharedPref.this,"Login Successful",Toast.LENGTH_SHORT).show();


            }
        });


    }
}