package com.example.stormhacks2021.homepage;

import androidx.appcompat.app.AppCompatActivity;

import com.example.stormhacks2021.AppManager;
import com.example.stormhacks2021.R;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MedicationActivity extends AppCompatActivity {

    AppManager appManager ;
    ArrayList<CheckBox> meds;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medication);

        appManager = AppManager.getInstance();

        CheckBox med1 = findViewById(R.id.med1);
        CheckBox med2 = findViewById(R.id.med2);
        CheckBox med3 = findViewById(R.id.med3);
        CheckBox med4 = findViewById(R.id.med4);
        CheckBox med5 = findViewById(R.id.med5);
        List<CheckBox> medsList = Arrays.asList(med1,med2,med3,med4,med5);
        meds = new ArrayList<CheckBox>();
        meds.addAll(medsList);

        populateCheckBoxes();

        Button submitBtn = findViewById(R.id.medication_submit_btn);
        submitBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v) {
                for(int i = 0 ; i < appManager.getCurrentSenior().getMedicationTracker().size() ; i++){
                    boolean isChecked = meds.get(i).isChecked() ;
                    if(isChecked) {
                        appManager.getCurrentSenior().getMedicationTracker().get(i).setIfTaken(isChecked);
                    }
                }
                finish();
            }
        });

    }

    private void populateCheckBoxes() {
        for(int i = 0 ; i < appManager.getCurrentSenior().getMedicationTracker().size() ; i++){
            meds.get(i).setText(appManager.getCurrentSenior().getMedicationTracker().get(i).getName());
            if(appManager.getCurrentSenior().getMedicationTracker().get(i).getIfTaken()){
                meds.get(i).setEnabled(false);
            }
        }
    }


}