package com.example.lab;

import static android.widget.GridLayout.*;

import androidx.appcompat.app.AppCompatActivity;


import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.GridLayout;
import android.widget.GridView;
import android.widget.ImageView;


public class ImageGrid extends AppCompatActivity {
    GridView grView;
    Button btn;
    int[] imgList={R.drawable.img3,R.drawable.home,R.drawable.base};
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_grid);
        grView = findViewById(R.id.grdView);
        btn=findViewById(R.id.home);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(ImageGrid.this, MainActivity.class);
                startActivity(i);
            }
        });
        grView.setAdapter(new ImageAdapter(this, imgList));
        grView.setOnItemClickListener((parent, view, position, id) ->
                new AlertDialog.Builder(this)
                        .setTitle("You Selected")
                        .setMessage("You Selected Image :" + (position + 1))
                        .setPositiveButton("OK", ((dialog, which) -> dialog.dismiss()))
                        .create()
                        .show());
    }
    public class ImageAdapter extends android.widget.BaseAdapter
    {
        private android.content.Context mContext;
        private int[] imgList;
        public ImageAdapter(android.content.Context context,int[] images)
        {
            mContext=context;
            imgList=images;
        }

        @Override
        public int getCount()
        {
            return imgList.length;
        }


        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            ImageView imageView;
            if(convertView==null) {
                imageView = new ImageView(mContext);
                imageView.setLayoutParams(new ViewGroup.LayoutParams(200,200));
                imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            }
            else {
                imageView=(ImageView)convertView;
            }
            imageView.setImageResource(imgList[position]);
            return imageView;
        }
    }

}