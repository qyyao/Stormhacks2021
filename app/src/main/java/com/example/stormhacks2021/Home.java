package com.example.stormhacks2021;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.example.stormhacks2021.homepage.ContactActivity;
import com.example.stormhacks2021.homepage.HelpActivity;
import com.example.stormhacks2021.homepage.MedicationActivity;

public class Home extends AppCompatActivity {

    private AppManager appManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //TO DO: SET THAT IF USER HAS NO PROFILE, SHOW REGISTRATION PAGE
        //Boolean isFirstRun = //CHECK IF PROFILE EXISTS
        appManager = AppManager.getInstance();
        if (appManager.isFirstRun()) {
          //show sign up activity
              startActivity(new Intent(Home.this, RegistrationPage.class));
        }

        setUpHelpBtn();
        setUpMedicationBtn();
        setUpContactBtn();
        setUp911Btn();
        setUpSettingsBtn();

    }

    @Override
    public void onBackPressed() {
        System.out.println("ON BACK PRESSED");
        Intent intent = new Intent(Home.this, RegistrationPage.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(intent);
    }

    @Override
    protected void onStart() {
        super.onStart();
        printSeniors();
    }

    private void printSeniors() {
        System.out.println("printing senior");
        appManager.printSeniorsInformation();
    }


    private void setUpSettingsBtn() {
//        ImageButton SettingsBtn = findViewById(R.id.home_settings_imgbtn);
//        SettingsBtn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                startActivity(new Intent(Home.this, SettingsActivity.class));
//            }
//        });
    }

    private void setUp911Btn() {
        // TODO: 2021-02-20 SET UP ALERT
    }

    private void setUpContactBtn() {
        Button ContactBtn = findViewById(R.id.home_contact_family_btn);
        ContactBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Home.this, ContactActivity.class));
            }
        });
    }

    private void setUpMedicationBtn() {
        Button MedicationBtn = findViewById(R.id.home_medication_btn);
        MedicationBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Home.this, MedicationActivity.class));
            }
        });
    }

    private void setUpHelpBtn() {
        Button helpBtn = findViewById(R.id.home_help_btn);
        helpBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Home.this, HelpActivity.class));
            }
        });
    }
}