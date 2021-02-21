package com.example.stormhacks2021;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.List;

public class SeniorsListPage extends AppCompatActivity {
    private AppManager appManager;

    private List<Senior> seniorsList;
    private RecyclerView seniorRecyclerView;
    private SeniorRecyclerAdapter.SeniorRecyclerViewClickListener listener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_patients_page);
        seniorRecyclerView = findViewById(R.id.seniors_recycler_view);

        appManager = AppManager.getInstance();
        seniorsList = appManager.getSeniors();
        setAdapter();
    }

    @Override
    protected void onStart() {
        super.onStart();
        setAdapter();
    }

    @Override
    protected void onResume() {
        super.onResume();
        setAdapter();
    }

    private void setAdapter(){
        setOnClickListener();
        SeniorRecyclerAdapter seniorRecyclerAdapter = new SeniorRecyclerAdapter(seniorsList, listener);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        seniorRecyclerView.setLayoutManager(layoutManager);
        seniorRecyclerView.setItemAnimator(new DefaultItemAnimator());
        seniorRecyclerView.setAdapter(seniorRecyclerAdapter);
    }

    private void setOnClickListener() {
        listener = new SeniorRecyclerAdapter.SeniorRecyclerViewClickListener(){
            @Override
            public void onClick(View v, int position) {
                Intent intent = new Intent(getApplicationContext(), ProfilePage.class);
                intent.putExtra(getResources().getString(R.string.SENIOR_PROFILE_POSITION), position);
                startActivity(intent);
            }
        };
    }
}