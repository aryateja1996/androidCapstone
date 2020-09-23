package com.indiworks.capstonereality;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import com.bumptech.glide.Glide;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class kandi extends AppCompatActivity {
    private ImageView imageView;
   public ImageView img1;
    public ImageView img2;
    public ImageView img3;
    public ImageView img4;
    String url1;
    String url2;
    String url3;
    String url4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kandi);
    imageView= (ImageView)findViewById(R.id.back);
        img1 = (ImageView)findViewById(R.id.img1);
        img2 = (ImageView)findViewById(R.id.img2);
        img3 = (ImageView)findViewById(R.id.img3);
        img4 = (ImageView)findViewById(R.id.img4);
        url1 = "https://s3.ap-south-1.amazonaws.com/capstonereality.com/assets/db_images/kandi/IMG-20200605-WA0002.jpg";
        url2 = "https://s3.ap-south-1.amazonaws.com/capstonereality.com/assets/db_images/kandi/IMG-20200605-WA0003.jpg";
        url3 = "https://s3.ap-south-1.amazonaws.com/capstonereality.com/assets/db_images/kandi/IMG-20200605-WA0004.jpg";
        url4 = "https://s3.ap-south-1.amazonaws.com/capstonereality.com/assets/db_images/kandi/IMG-20200605-WA0005.jpg";
    imageView.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(kandi.this,projects.class);
            startActivity(intent);
        }
    });

        Glide.with(getApplicationContext()).load(Uri.parse(url1)).into(img1);
        Glide.with(getApplicationContext()).load(Uri.parse(url2)).into(img2);
        Glide.with(getApplicationContext()).load(Uri.parse(url3)).into(img3);
        Glide.with(getApplicationContext()).load(Uri.parse(url4)).into(img4);

    }
}