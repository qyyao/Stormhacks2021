package com.example.stormhacks2021;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class SeniorProfilePage extends AppCompatActivity {

    private AppManager appManager;
    public static final String EXTRA_SENIOR_PROFILE = "selected_senior_position";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_senior_profile_page);

        appManager = AppManager.getInstance();
        Senior senior;

        Intent intent = getIntent();
        int patientPosition = intent.getIntExtra(getResources().getString(R.string.SENIOR_PROFILE_POSITION), -1);

        senior = appManager.getSeniors().get(patientPosition);

        TextView name = findViewById(R.id.senior_profile_name_textview);
        String seniorName = senior.getFirstName() + " " + senior.getLastName();
        name.setText(seniorName);

        TextView age = findViewById(R.id.senior_profile_age_text);
        String seniorAge = Integer.toString(senior.getAge());
        age.setText(seniorAge);

        ImageView image = findViewById(R.id.senior_profile_picture_image);
        image.setBackgroundResource(senior.getProfilePicture());
    }
}