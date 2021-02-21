package com.example.stormhacks2021;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class ProfilePage extends AppCompatActivity {

    private AppManager appManager;
    private RecyclerView medicineRecyclerView;
    private Senior senior;
    ListView list ;


    private ArrayAdapter<String> notificationsAdapter;
    int patientPosition;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_senior_profile_page);
        medicineRecyclerView = findViewById(R.id.medication_recycler_view);

        appManager = AppManager.getInstance();

        Intent intent = getIntent();
        patientPosition = intent.getIntExtra(getResources().getString(R.string.SENIOR_PROFILE_POSITION), -1);

        senior = appManager.getSeniors().get(patientPosition);
        list = findViewById(R.id.senior_profile_notif_list);

        TextView name = findViewById(R.id.senior_profile_name_txt);
        String seniorName = senior.getFirstName() + " " + senior.getLastName();
        name.setText(seniorName);

        TextView age = findViewById(R.id.senior_profile_age_text);
        String seniorAge = Integer.toString(senior.getAge());
        age.setText(seniorAge);

       ImageView image = (ImageView)findViewById(R.id.circle_img);
       image.setImageResource(senior.getProfilePicture());

        if (senior.getMedicationTracker() != null) {
            setAdapter();
        }

        notificationsAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, appManager.getSeniors().get(patientPosition).getCareGiverNotifications());

        onClickDelete();
    }

    @Override
    protected void onResume() {
        super.onResume();
        populateNotificationsList();
        notificationsAdapter.notifyDataSetChanged();
    }

    private void onClickDelete() {
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                appManager.getSeniors().get(patientPosition).getCareGiverNotifications().remove(position);
                notificationsAdapter.notifyDataSetChanged();
            }
        });
    }

    private void setAdapter() {
        ProfileMedicationRecyclerAdapter medicineRecyclerAdapter = new ProfileMedicationRecyclerAdapter(senior.getMedicationTracker());
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        medicineRecyclerView.setLayoutManager(layoutManager);
        medicineRecyclerView.setItemAnimator(new DefaultItemAnimator());
        medicineRecyclerView.setAdapter(medicineRecyclerAdapter);
    }

    private void populateNotificationsList() {
        list.setAdapter(notificationsAdapter);
    }



}