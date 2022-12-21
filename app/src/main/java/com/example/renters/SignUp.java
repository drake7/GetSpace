package com.example.renters;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class SignUp extends AppCompatActivity {

    Button signUp,alreadyUser;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);



        signUp = findViewById(R.id.signup_signup);
        signUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(getApplicationContext(), CustomerLogin.class);
                Toast.makeText(SignUp.this, "Saving User Details.", Toast.LENGTH_LONG).show();
                startActivity(i);
            }
        });

        alreadyUser = findViewById(R.id.signup_alreadyUser);
        alreadyUser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), CustomerLogin.class);
                startActivity(i);
            }
        });

    }
}