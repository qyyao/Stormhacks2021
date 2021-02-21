package com.example.stormhacks2021;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SeniorRegistrationPage extends AppCompatActivity {

    AppManager appManager;
    EditText age;
    EditText lastName;
    EditText firstName;
    private boolean isValidText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_senior_registration_page);

        appManager = AppManager.getInstance();

        firstName = findViewById(R.id.registration_senior_first_name_text);
        lastName = findViewById(R.id.registration_senior_last_name_text);
        age = findViewById(R.id.registration_senior_age_txt);
        
        Button submit = findViewById(R.id.registration_senior_submit_btn);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                isValidText = validateText();
                if(isValidText){
                    String firstNameString = firstName.getText().toString();
                    String lastNameString = lastName.getText().toString();
                    String ageString = age.getText().toString();
                    Senior senior = new Senior(firstNameString, lastNameString);
                    senior.setAge(Integer.valueOf(ageString));
                    appManager.setCurrentSenior(senior);
                    appManager.getSeniors().add(senior);
                    appManager.setFirstRun(false);
                    startActivity(new Intent(SeniorRegistrationPage.this, Home.class));
                }
            }
        });
    }

    private boolean validateText() {

        String firstNameString = firstName.getText().toString();
        String lastNameString = lastName.getText().toString();
        String ageString = age.getText().toString();
        boolean canContinue = true;

        if(firstNameString.length() == 0){
            firstName.setError("Enter first name");
            canContinue = false;
        }
        if(lastNameString.length() == 0){
            lastName.setError("Enter last name");
            canContinue = false;
        }
        if(ageString.length() == 0){
            age.setError("Enter age");
            canContinue = false;
        }

        return canContinue;
    }

}