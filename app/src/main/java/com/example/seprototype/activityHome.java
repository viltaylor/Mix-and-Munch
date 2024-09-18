package com.example.seprototype;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

public class activityHome extends AppCompatActivity {
    ImageButton seerecom, seecate, carii, minum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        seerecom = (ImageButton) findViewById(R.id.seeRecom);
        seerecom.setOnClickListener(v -> {
            Intent intent = new Intent(activityHome.this,RecomActivity.class);
            startActivity(intent);
        });

        seecate = (ImageButton) findViewById(R.id.seeCategories);
        seecate.setOnClickListener(v -> {
            Intent intent = new Intent(activityHome.this,CategoryActivity.class);
            startActivity(intent);
        });

        carii = (ImageButton) findViewById(R.id.cari);
        carii.setOnClickListener(v -> {
            Intent intent = new Intent(activityHome.this,ActivitySearch.class);
            startActivity(intent);
        });

        minum = (ImageButton) findViewById(R.id.minum);
        minum.setOnClickListener(v -> {
            Intent intent = new Intent(activityHome.this,drinkActivity.class);
            startActivity(intent);
        });
    }
}