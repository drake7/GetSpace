package com.example.renters;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import com.example.renters.CustomerStartUpScreen;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //reaching to startup Screen
        Intent i = new Intent(getApplicationContext(), CustomerStartUpScreen.class);
        startActivity(i);
    }
}