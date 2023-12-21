package com.example.lab;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Validation extends AppCompatActivity {
EditText nm,pass,phno,mail;
Button btn,hm;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_validation);
        nm=findViewById(R.id.name);
        pass=findViewById(R.id.pass);
        phno=findViewById(R.id.phone);
        mail=findViewById(R.id.email);
        btn=findViewById(R.id.button);
        hm=findViewById(R.id.btn);
        hm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Validation.this, MainActivity.class);
                startActivity(i);
            }
        });
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name=nm.getText().toString();
                String pwd=pass.getText().toString();
                if(name.isEmpty())
                {
                    nm.setError("Please fill the field");
                } else if (!(isPass(pwd))) {
                    pass.setError("Length should be greater than 8 and should contain special characters");
                } else if (!(isNum(phno.getText().toString()))) {
                    phno.setError("Length should be of 10");
                } else if (!(isMail(mail.getText().toString()))) {
                    mail.setError("Should match the pattern");
                }else
                {
                    Toast.makeText(Validation.this,"Login Successful",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
    public boolean isPass(String pwd)
    {
        String ptn=".*[$#@!%&].*";
        return pwd.length()>=8 && pwd.contains(ptn);
    }
    public boolean isNum(String ph)
    {
        return ph.length()==10;
    }
    public boolean isMail(String mail)
    {
        String pat="^[a-z0-9]+@[a-z]+(\\.[a-z]{3,})$";
        return mail.matches(pat);
    }
}