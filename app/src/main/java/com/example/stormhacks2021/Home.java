package com.example.stormhacks2021;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class Home extends AppCompatActivity {

    private AppManager appManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //TO DO: SET THAT IF USER HAS NO PROFILE, SHOW REGISTRATION PAGE
//        Boolean isFirstRun = //CHECK IF PROFILE EXISTS
//
//        if (isFirstRun) {
//            //show sign up activity
              startActivity(new Intent(Home.this, RegistrationPage.class));
//        }

        appManager = AppManager.getInstance();

//        CareGiver sue = new CareGiver("Sue", "Lan");
//        System.out.println(sue.getID_num());
//        Senior s1 = new Senior("Johnny", "Swan");
//        Senior s2 = new Senior("Bob", "Dylan");
//        Senior s3 = new Senior("Allie", "Johansen");
//        sue.addSenior(s1);
//        sue.addSenior(s2);
//        sue.addSenior(s3);
//        sue.printSeniorsInformation();

    }
}