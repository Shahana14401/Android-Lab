package com.example.lab;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Calculator extends AppCompatActivity {
    TextView t1,t2;
    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn0,add,sub,mul,div,per,dot,c,eq;
    float f1,f2,res;
    boolean ad,sb,ml,dv,pr;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
        t1=findViewById(R.id.htxt);
        t2=findViewById(R.id.ltxt);
        btn0=findViewById(R.id.zero);
        btn1=findViewById(R.id.one);
        btn2=findViewById(R.id.two);
        btn3=findViewById(R.id.three);
        btn4=findViewById(R.id.four);
        btn5=findViewById(R.id.five);
        btn6=findViewById(R.id.six);
        btn7=findViewById(R.id.sev);
        btn8=findViewById(R.id.eight);
        btn9=findViewById(R.id.nine);
        add=findViewById(R.id.add);
        sub=findViewById(R.id.sub);
        mul=findViewById(R.id.mul);
        div=findViewById(R.id.div);
        per=findViewById(R.id.per);
        dot=findViewById(R.id.dot);
        c=findViewById(R.id.c);
        eq=findViewById(R.id.eq);

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t2.setText(t2.getText().toString() + "0");
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t2.setText(t2.getText().toString() + "1");
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t2.setText(t2.getText().toString() + "2");
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t2.setText(t2.getText().toString() + "3");
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t2.setText(t2.getText().toString() + "4");
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t2.setText(t2.getText().toString() + "5");
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t2.setText(t2.getText().toString() + "6");
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t2.setText(t2.getText().toString() + "7");
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t2.setText(t2.getText().toString() + "8");
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t2.setText(t2.getText().toString() + "9");
            }
        });
        dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t2.setText(t2.getText().toString() + ".");
            }
        });
        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t2.setText(" ");
                t1.setText(" ");
            }
        });
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                f1=Float.parseFloat(t2.getText().toString());
                t1.setText(f1 + "+");
                t2.setText(" ");
                ad=true;
            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                f1=Float.parseFloat(t2.getText().toString());
                t1.setText(f1 + "-");
                t2.setText(" ");
                sb=true;
            }
        });
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                f1=Float.parseFloat(t2.getText().toString());
                t1.setText(f1 + "x");
                t2.setText(" ");
                ml=true;
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                f1=Float.parseFloat(t2.getText().toString());
                t1.setText(f1 + "/");
                t2.setText(" ");
                dv=true;
            }
        });
        per.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                f1=Float.parseFloat(t2.getText().toString());
                t1.setText(f1 + "%");
                t2.setText(" ");
                pr=true;
            }
        });
        eq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                f2=Float.parseFloat(t2.getText().toString());
                if(ad==true)
                {
                    res=f1+f2;
                    t1.setText(t1.getText().toString()+f2);
                    t2.setText(String.valueOf(res));
                    ad=false;
                }
                else if(sb==true)
                {
                    res=f1-f2;
                    t1.setText(t1.getText().toString()+f2);
                    t2.setText(String.valueOf(res));
                    sb=false;
                }
                else if(ml==true)
                {
                    res=f1*f2;
                    t1.setText(t1.getText().toString()+f2);
                    t2.setText(String.valueOf(res));
                    ml=false;
                }
                else if(dv==true)
                {
                    res=f1/f2;
                    t1.setText(t1.getText().toString()+f2);
                    t2.setText(String.valueOf(res));
                    dv=false;
                }
                else if(pr==true)
                {
                    res=f1%f2;
                    t1.setText(t1.getText().toString()+f2);
                    t2.setText(String.valueOf(res));
                    pr=false;
                }
            }

        });
    }
}