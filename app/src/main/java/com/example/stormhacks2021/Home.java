package com.example.stormhacks2021;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.stormhacks2021.homepage.ContactActivity;
import com.example.stormhacks2021.homepage.HelpActivity;
import com.example.stormhacks2021.homepage.MedicationActivity;

import java.util.Calendar;
import java.util.Date;

public class Home extends AppCompatActivity {

    private AppManager appManager;
    private int hour;
    private String greeting;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //TO DO: SET THAT IF USER HAS NO PROFILE, SHOW REGISTRATION PAGE
        //Boolean isFirstRun = //CHECK IF PROFILE EXISTS
        appManager = AppManager.getInstance();
        appManager.addMedicationsList();

        if (appManager.isFirstRun()) {
          //show sign up activity
              startActivity(new Intent(Home.this, RegistrationPage.class));
        }

        TextView greetingText = findViewById(R.id.home_greeting_txt);

        Calendar rightNow = Calendar.getInstance();
        hour = rightNow.get(Calendar.HOUR_OF_DAY);

        if (hour > 0 && hour <= 6){
            greeting = "Good Night";
        }

        if (hour > 6 && hour <= 12){
            greeting = "Good Morning";
        }

        if (hour > 12 && hour <= 18){
            greeting = "Good Afternoon";
        }

        if (hour > 18){
            greeting = "Good Evening";
        }

        if(appManager.getCurrentSenior() != null){
            greeting = greeting + " " + appManager.getCurrentSenior().getFirstName();
        }
        greetingText.setText(greeting);


        setUpHelpBtn();
        setUpMedicationBtn();
        setUpContactBtn();
        setUp911Btn();
        setUpSettingsBtn();
        if(appManager.getCurrentSenior() != null){
            updateNotificationsBox();
        }

    }
    @Override
    protected void onResume() {
        super.onResume();
        if(appManager.getCurrentSenior() != null){
            updateNotificationsBox();
        }
    }
    private void updateNotificationsBox() {
        TextView notifBox = findViewById(R.id.home_interface_txt);
        notifBox.setText("");
        int medicCounter = 0;
        for(int i = 0 ; i < appManager.getCurrentSenior().getMedicationTracker().size() ; i++){
            if(!appManager.getCurrentSenior().getMedicationTracker().get(i).getIfTaken()){
                medicCounter++;
            }
        }
        String notifText = "You have " + medicCounter + " medications left to take";
        String currText = "Notifications: " + "\n" + notifText;
        notifBox.setText(currText);

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
        if(appManager.getCurrentSenior() != null){
            updateNotificationsBox();
        }
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
        Button emergencyButton = findViewById(R.id.home_emergency_btn);

        emergencyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                final AlertDialog.Builder alertDialog = new AlertDialog.Builder(Home.this);
                //Notification Code Below
                NotificationCompat.Builder builder = new NotificationCompat.Builder(Home.this, "My Notification");
                builder.setContentTitle("Alert!");
                String name = appManager.getCurrentSenior().getFirstName();
                builder.setContentTitle(name + " is in an emergency!");
                builder.setSmallIcon(R.drawable.ic_launcher_background);
                builder.setAutoCancel(true);

                NotificationManagerCompat managerCompat = NotificationManagerCompat.from(Home.this);
                managerCompat.notify(1, builder.build());
                //Notification Code Finished

                alertDialog.setTitle("Help is on the way!");

                alertDialog.setPositiveButton("Okay", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        moveTaskToBack(false);
                        finish();
                    }
                });
                alertDialog.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.dismiss();
                    }
                });
                AlertDialog alertDialog1 = alertDialog.create();
                alertDialog1.show();
            }
        });
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