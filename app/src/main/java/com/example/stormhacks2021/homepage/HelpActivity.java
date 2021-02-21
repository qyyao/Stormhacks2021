package com.example.stormhacks2021.homepage;
import com.example.stormhacks2021.AppManager;
import com.example.stormhacks2021.R;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HelpActivity extends AppCompatActivity {

    AppManager appManager ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help);

        appManager = AppManager.getInstance();

        setUpButtons();
    }

    private void setUpButtons() {
        Button hungryButton = findViewById(R.id.help_hungry_btn);
        Button thirstyButton = findViewById(R.id.help_thirsty_btn);
        Button lonelyButton = findViewById(R.id.help_lonely_btn);
        Button injuredButton = findViewById(R.id.help_injury_btn);

        hungryButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                appManager.getCurrentSenior().notifyCareGiver(appManager.getCurrentSenior().getFirstName() + " is hungry");
            }
        });

        thirstyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                appManager.getCurrentSenior().notifyCareGiver(appManager.getCurrentSenior().getFirstName() + " is thirsty");

            }
        });

        lonelyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                appManager.getCurrentSenior().notifyCareGiver(appManager.getCurrentSenior().getFirstName() + " is lonely");
            }
        });

        injuredButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                appManager.getCurrentSenior().notifyCareGiver(appManager.getCurrentSenior().getFirstName() + " is injured");
            }
        });

    }
}