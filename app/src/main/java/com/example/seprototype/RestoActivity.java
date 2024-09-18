package com.example.seprototype;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

public class RestoActivity extends AppCompatActivity {

    ImageView pik;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resto);

        pik = (ImageView) findViewById(R.id.pik);
        pik.setOnClickListener(v -> {
            Intent intent = new Intent(RestoActivity.this,McdActivity.class);
            startActivity(intent);
        });
    }
}