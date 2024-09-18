package com.example.seprototype;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;

public class CartActivity extends AppCompatActivity {
    ImageButton addmore, place;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart);
        addmore = (ImageButton) findViewById(R.id.addmoredishes);
        addmore.setOnClickListener(v -> {
            Intent intent = new Intent(CartActivity.this,ActivitySearch.class);
            startActivity(intent);
        });

        place = (ImageButton) findViewById(R.id.placeorder);
        place.setOnClickListener(v -> {
            Intent intent = new Intent(CartActivity.this,trackActivity.class);
            startActivity(intent);
        });
    }
}