package com.example.seprototype;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;

public class CategoryActivity extends AppCompatActivity {

    ImageButton balik, minum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);

        balik = (ImageButton) findViewById(R.id.balik);
        balik.setOnClickListener(v->{
            Intent intent = new Intent(CategoryActivity.this,activityHome.class);
            startActivity(intent);
        });

        minum = (ImageButton) findViewById(R.id.minum);
        minum.setOnClickListener(v -> {
            Intent intent = new Intent(CategoryActivity.this,drinkActivity.class);
            startActivity(intent);
        });
    }
}