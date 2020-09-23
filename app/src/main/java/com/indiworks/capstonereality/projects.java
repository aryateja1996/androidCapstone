package com.indiworks.capstonereality;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class projects extends AppCompatActivity {
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_projects);
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);

            textView=(TextView)findViewById(R.id.kandi);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(projects.this,kandi.class);
                startActivity(intent);
            }
        });
        textView=(TextView)findViewById(R.id.mohinabad);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(projects.this,mohinabad.class);
                startActivity(intent);
            }
        });
        textView=(TextView)findViewById(R.id.ssfarm);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(projects.this,farms.class);
                startActivity(intent);
            }
        });
        textView=(TextView)findViewById(R.id.shadnagar);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(projects.this,bheemaram.class);
                startActivity(intent);
            }
        });


        bottomNavigationView.setSelectedItemId(R.id.projects);

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

                        return true;
                    case R.id.contact:
                        startActivity(new Intent(getApplicationContext()
                                ,contact.class));
                        overridePendingTransition(0,0);
                        return true;
                }
                return false;
            }
        });
    }
}
