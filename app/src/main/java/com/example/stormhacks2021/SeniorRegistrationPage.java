package com.example.stormhacks2021;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

public class SeniorRegistrationPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_senior_registration_page);

        EditText firstName = findViewById(R.id.registration_senior_first_name_text);
        EditText lastName = findViewById(R.id.registration_senior_last_name_text);

        Senior senior = new Senior(firstName.toString(), lastName.toString());
    }
}