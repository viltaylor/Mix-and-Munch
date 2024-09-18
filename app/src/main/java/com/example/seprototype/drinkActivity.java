package com.example.seprototype;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;

public class drinkActivity extends AppCompatActivity {

    ImageButton balek;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drink);

        balek = (ImageButton) findViewById(R.id.balik);

        balek.setOnClickListener(v -> {
            Intent intent = new Intent(drinkActivity.this,activityHome.class);
            startActivity(intent);
        });
    }
}