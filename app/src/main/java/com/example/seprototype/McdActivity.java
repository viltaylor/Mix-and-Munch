package com.example.seprototype;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;

public class McdActivity extends AppCompatActivity {

    ImageButton balik, menu1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mcd);

        balik = (ImageButton) findViewById(R.id.balik);
        balik.setOnClickListener(v -> {
            Intent intent = new Intent(McdActivity.this,RestoActivity.class);
            startActivity(intent);
        });

        menu1 = (ImageButton) findViewById(R.id.addPanas1);
        menu1.setOnClickListener(v -> {
            Intent intent = new Intent(McdActivity.this,CartActivity.class);
            startActivity(intent);
        });
    }
}