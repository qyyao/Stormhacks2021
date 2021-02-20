package com.example.stormhacks2021;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //TO DO: SET THAT IF USER HAS NO PROFILE, SHOW REGISTRATION PAGE
//        Boolean isFirstRun = //CHECK IF PROFILE EXISTS
//
//        if (isFirstRun) {
//            //show sign up activity
//              startActivity(new Intent(MainActivity.this, RegistrationPage.class));
//        }
    }
}