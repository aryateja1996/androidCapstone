package com.indiworks.capstonereality;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class contact extends AppCompatActivity {
Button button;
String num;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);

            button = findViewById(R.id.call);
            button.setOnClickListener(new View.OnClickListener() {
                @SuppressLint("MissingPermission")
                @Override
                public void onClick(View v) {
                    num = "7661904609";
                    String s = "tel:"+ num;
                    Intent intent = new Intent(Intent.ACTION_CALL);
                    intent .setData(Uri.parse(s));
                    startActivity(intent);
                }
            });


        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);

        bottomNavigationView.setSelectedItemId(R.id.contact);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.home:
                        startActivity(new Intent(getApplicationContext()
                                ,Home.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.projects:
                        startActivity(new Intent(getApplicationContext()
                                ,projects.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.contact:

                        return true;
                }
                return false;
            }
        });
    }
}
