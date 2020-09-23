package com.indiworks.capstonereality;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class farms extends AppCompatActivity {
    private ImageView imageView;
    ImageView  img1;
    ImageView  img2;
    ImageView  img3;
    ImageView  img4;
    ImageView  img5;
    ImageView  img6;
    ImageView  img7;
    ImageView  img8;
    ImageView  img9;
    ImageView  img10;
    ImageView  img11;
    ImageView  img12;

    String url1;
    String url2;
    String url3;
    String url4;
    String url5;
    String url6;
    String url7;
    String url8;
    String url9;
    String url10;
    String url11;
    String url12;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_farms);
        imageView= (ImageView)findViewById(R.id.back);
        img1 = (ImageView)findViewById(R.id.img1);
        img2 = (ImageView)findViewById(R.id.img2);
        img3 = (ImageView)findViewById(R.id.img3);
        img4 = (ImageView)findViewById(R.id.img4);
        img5 = (ImageView)findViewById(R.id.img5);
        img6 = (ImageView)findViewById(R.id.img6);
        img7 = (ImageView)findViewById(R.id.img7);
        img8 = (ImageView)findViewById(R.id.img8);
        img9 = (ImageView)findViewById(R.id.img9);
        img10 = (ImageView)findViewById(R.id.img10);
        img11 = (ImageView)findViewById(R.id.img11);
        img12 = (ImageView)findViewById(R.id.img12);
        url1	 = 	"https://s3.ap-south-1.amazonaws.com/capstonereality.com/assets/db_images/ssfarms/IMG-20200701-WA0002.jpg"	;
        url2	= 	"https://s3.ap-south-1.amazonaws.com/capstonereality.com/assets/db_images/ssfarms/IMG-20200701-WA0003.jpg"	;
        url3	 = 	"https://s3.ap-south-1.amazonaws.com/capstonereality.com/assets/db_images/ssfarms/IMG-20200701-WA0004.jpg"	;
        url4	 = 	"https://s3.ap-south-1.amazonaws.com/capstonereality.com/assets/db_images/ssfarms/IMG-20200701-WA0005.jpg"	;
        url5	 = 	"https://s3.ap-south-1.amazonaws.com/capstonereality.com/assets/db_images/ssfarms/IMG-20200701-WA0006.jpg"	;
        url6	 = 	"https://s3.ap-south-1.amazonaws.com/capstonereality.com/assets/db_images/ssfarms/IMG-20200701-WA0007.jpg"	;
        url7	 = 	"https://s3.ap-south-1.amazonaws.com/capstonereality.com/assets/db_images/ssfarms/IMG-20200701-WA0008.jpg"	;
        url8	 = 	"https://s3.ap-south-1.amazonaws.com/capstonereality.com/assets/db_images/ssfarms/IMG-20200701-WA0009.jpg"	;
        url9	 = 	"https://s3.ap-south-1.amazonaws.com/capstonereality.com/assets/db_images/ssfarms/IMG-20200701-WA0010.jpg"	;
        url10	 = 	"https://s3.ap-south-1.amazonaws.com/capstonereality.com/assets/db_images/ssfarms/IMG-20200701-WA0011.jpg"	;
        url11	 = 	"https://s3.ap-south-1.amazonaws.com/capstonereality.com/assets/db_images/ssfarms/IMG-20200701-WA0012.jpg"	;
        url12	 = 	"https://s3.ap-south-1.amazonaws.com/capstonereality.com/assets/db_images/ssfarms/IMG-20200701-WA0013.jpg"	;

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(farms.this,projects.class);
                startActivity(intent);
            }
        });
        Glide.with(getApplicationContext()).load(Uri.parse(	url1)).into(img1);
        Glide.with(getApplicationContext()).load(Uri.parse(	url2)).into(img2);
        Glide.with(getApplicationContext()).load(Uri.parse(	url3)).into(img3);
        Glide.with(getApplicationContext()).load(Uri.parse(	url4)).into(img4);
        Glide.with(getApplicationContext()).load(Uri.parse(	url5)).into(img5);
        Glide.with(getApplicationContext()).load(Uri.parse(	url6)).into(img6);
        Glide.with(getApplicationContext()).load(Uri.parse(	url7)).into(img7);
        Glide.with(getApplicationContext()).load(Uri.parse(	url8)).into(img8);
        Glide.with(getApplicationContext()).load(Uri.parse(	url9)).into(img9);
        Glide.with(getApplicationContext()).load(Uri.parse(	url10)).into(img10);
        Glide.with(getApplicationContext()).load(Uri.parse(	url11)).into(img11);
        Glide.with(getApplicationContext()).load(Uri.parse(	url12)).into(img12);
    }
}