package com.example.stormhacks2021;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ProfilePage extends AppCompatActivity {

    private AppManager appManager;
    private RecyclerView medicineRecyclerView;
    private Senior senior;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_senior_profile_page);
        medicineRecyclerView = findViewById(R.id.medication_recycler_view);

        appManager = AppManager.getInstance();

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

        if (senior.getMedicationTracker() != null) {
            setAdapter();
        }
    }

    private void setAdapter() {
        ProfileMedicationRecyclerAdapter medicineRecyclerAdapter = new ProfileMedicationRecyclerAdapter(senior.getMedicationTracker());
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        medicineRecyclerView.setLayoutManager(layoutManager);
        medicineRecyclerView.setItemAnimator(new DefaultItemAnimator());
        medicineRecyclerView.setAdapter(medicineRecyclerAdapter);
    }
}