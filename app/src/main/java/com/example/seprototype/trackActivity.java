package com.example.seprototype;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;

public class trackActivity extends AppCompatActivity {

    ImageButton balik;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_track);

        balik = (ImageButton) findViewById(R.id.balik);
        balik.setOnClickListener(v -> {
            Intent intent = new Intent(trackActivity.this,activityHome.class);
            startActivity(intent);
        });
    }
}