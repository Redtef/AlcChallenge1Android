package com.example.alcchanllengeone;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        initializeDisplayContent();
    }

    private void initializeDisplayContent() {
        getSupportActionBar().setTitle("ALC 4 Phase 1");
        Button aboutAlcButton = findViewById(R.id.aboutAlcButton);
        Button myProfileButton = findViewById(R.id.myProfileButton);
        aboutAlcButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, AboutAlcActivity.class);
                startActivity(intent);
            }
        });
        myProfileButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MyProfileActivity.class);
                startActivity(intent);
            }
        });
    }
}
