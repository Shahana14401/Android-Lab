package com.example.lab;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class spinner extends AppCompatActivity {
    Spinner spinner;
    TextView select;



    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner);
        spinner=findViewById(R.id.spinner);
        select=findViewById(R.id.textView);
        List<String> item = new ArrayList<>();
        item.add("item1");
        item.add("item2");
        item.add("item3");
        item.add("item4");
        ArrayAdapter<String> adapter=new ArrayAdapter<>(this, android.R.layout.simple_spinner_item,item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String selectedItem=parent.getItemAtPosition(position).toString();
                select.setText("You Selected:"+selectedItem);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                select.setText("Please Select an Item");
            }
        });



    }
}