package com.example.seprototype;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;

public class RecomActivity extends AppCompatActivity {

    ImageButton balikbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recom);

        balikbtn = (ImageButton) findViewById(R.id.balik);

        balikbtn.setOnClickListener(v -> {
            Intent intent = new Intent(RecomActivity.this,activityHome.class);
            startActivity(intent);
        });
    }
}