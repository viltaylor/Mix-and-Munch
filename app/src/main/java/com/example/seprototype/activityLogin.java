package com.example.seprototype;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

public class activityLogin extends AppCompatActivity {

    Button btn;
    ImageButton signbtn;
    EditText usntf, pwtf;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        btn = (Button) findViewById(R.id.signInButton);
        usntf = findViewById(R.id.usernameTf);
        pwtf = findViewById(R.id.passwordTf);
        signbtn = (ImageButton) findViewById(R.id.gapunyaakun);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!usntf.getText().toString().isEmpty() && !pwtf.getText().toString().isEmpty()){
                    Intent intent = new Intent(activityLogin.this,activityHome.class);
                    startActivity(intent);
                }else{
                    Toast.makeText(activityLogin.this, "Login Failed", Toast.LENGTH_LONG).show();
                }
            }
        });

        signbtn.setOnClickListener(v -> {
            Intent intent = new Intent(activityLogin.this,ActivityRegister.class);
            startActivity(intent);
        });
    }
}