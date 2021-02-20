package com.example.stormhacks2021;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private AppManager appManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        appManager = AppManager.getInstance();

        CareGiver sue = new CareGiver("Sue", "Lan");
        System.out.println(sue.getID_num());
        Senior s1 = new Senior("Johnny", "Swan");
        Senior s2 = new Senior("Bob", "Dylan");
        Senior s3 = new Senior("Allie", "Johansen");
        sue.addSenior(s1);
        sue.addSenior(s2);
        sue.addSenior(s3);
        sue.printSeniorsInformation();

    }
}