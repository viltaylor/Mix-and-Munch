package com.example.seprototype;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

public class ActivityRegister extends AppCompatActivity {

    Button btnregis;
    ImageButton imgbtn;

    EditText nametf, phonetf, emailtf, pwtf;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        btnregis = (Button) findViewById(R.id.signupbtn);
        nametf = findViewById(R.id.nameTf);
        phonetf = findViewById(R.id.telpTf);
        emailtf = findViewById(R.id.emailTf);
        pwtf = findViewById(R.id.pwTf);

        btnregis.setOnClickListener(v -> {
            if(!nametf.getText().toString().isEmpty() && !phonetf.getText().toString().isEmpty() &&
                    !emailtf.getText().toString().isEmpty() && !pwtf.getText().toString().isEmpty()){
                Intent intent = new Intent(ActivityRegister.this,activityLogin.class);
                startActivity(intent);
            }else{
                Toast.makeText(ActivityRegister.this, "Register Failed", Toast.LENGTH_LONG).show();
            }
        });

        imgbtn = (ImageButton) findViewById(R.id.punyaakun);
        imgbtn.setOnClickListener(v -> {
            Intent intent = new Intent(ActivityRegister.this,activityLogin.class);
            startActivity(intent);
        });
    }
}