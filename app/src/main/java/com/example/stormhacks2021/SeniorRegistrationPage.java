package com.example.stormhacks2021;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SeniorRegistrationPage extends AppCompatActivity {

    AppManager appManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_senior_registration_page);

        appManager = AppManager.getInstance();

        EditText firstName = findViewById(R.id.registration_senior_first_name_text);
        EditText lastName = findViewById(R.id.registration_senior_last_name_text);

        Button submit = findViewById(R.id.registration_senior_submit_btn);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Senior senior = new Senior(firstName.toString(), lastName.toString());
                appManager.setCurrentSenior(senior);
                startActivity(new Intent(SeniorRegistrationPage.this, Home.class));
            }
        });
    }
}