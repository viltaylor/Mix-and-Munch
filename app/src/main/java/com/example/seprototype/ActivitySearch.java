package com.example.seprototype;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.ImageView;

public class ActivitySearch extends AppCompatActivity {
    ImageButton balek;
    ImageView cari, huhu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        balek = (ImageButton) findViewById(R.id.balik);
        balek.setOnClickListener(v -> {
            Intent intent = new Intent(ActivitySearch.this,activityHome.class);
            startActivity(intent);
        });

        cari = (ImageView) findViewById(R.id.cari);
        cari.setOnClickListener(v -> {
            Intent intent = new Intent(ActivitySearch.this,RestoActivity.class);
            startActivity(intent);
        });

        huhu = (ImageView) findViewById(R.id.explore);
        huhu.setOnClickListener(v -> {
            Intent intent = new Intent(ActivitySearch.this,drinkActivity.class);
            startActivity(intent);
        });

    }
}