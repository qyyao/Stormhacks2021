package com.example.stormhacks2021;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SeniorProfilePage extends AppCompatActivity {

    private AppManager appManager;
    public static final String EXTRA_SENIOR_PROFILE = "selected_senior_position";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_senior_profile_page);

        appManager = AppManager.getInstance();

        String seniorName = "invalid profile";

        Intent intent = getIntent();
        int patientPosition = intent.getIntExtra(getResources().getString(R.string.SENIOR_PROFILE_POSITION), -1);

        if (patientPosition != -1){
            seniorName = appManager.getSeniors().get(patientPosition).getFirstName() + " " + appManager.getSeniors().get(patientPosition).getLastName();
        }

        TextView name = findViewById(R.id.senior_profile_name_textview);
        name.setText(seniorName);
    }
}