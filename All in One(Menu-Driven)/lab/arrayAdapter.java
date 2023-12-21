package com.example.lab;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class arrayAdapter extends AppCompatActivity {
    ListView lsView;
    String[] data={"Item 1","Item 2","Item 3"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_array_adapter2);
        lsView=findViewById(R.id.lsView);
        ArrayAdapter<String> adapter=new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,data);
        lsView.setAdapter(adapter);
        lsView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                showToast("You Selected:"+data[position]);
            }
        });
    }
    private void showToast(String data)
    {
        Toast.makeText(arrayAdapter.this,data,Toast.LENGTH_SHORT).show();
    }
}