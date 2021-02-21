package com.example.stormhacks2021;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.media.Image;
import android.widget.ImageView;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class AppManager {

    private List<Senior> seniors;
    private static AppManager instance;
    private Senior currentSenior;
    private static CareGiver mainCareGiver;
    private List<String> careGiverNotifications;
    private boolean isFirstRun;

    private AppManager(){

        setSeniorList();

        if(instance != null){
            isFirstRun = false;
        }else{
            isFirstRun = true;
        }
    }

    private void setSeniorList() {

        seniors = new ArrayList<>();
        seniors.add(new Senior("Adam", "Apple"));
        seniors.get(0).setAge(65);
        seniors.get(0).setProfilePicture(R.drawable.pp1);

        seniors.add(new Senior("Mary", "Jane"));
        seniors.get(1).setAge(54);
        seniors.get(1).setProfilePicture(R.drawable.pp2);

        seniors.add(new Senior("Tobey", "James"));
        seniors.get(2).setAge(76);
        seniors.get(2).setProfilePicture(R.drawable.pp3);

        seniors.add(new Senior("Zack", "Jack"));
        seniors.get(3).setAge(90);
        seniors.get(3).setProfilePicture(R.drawable.pp4);

        seniors.add(new Senior("Five", "Hargreeves"));
        seniors.get(4).setAge(58);
        seniors.get(4).setProfilePicture(R.drawable.pp5);

        seniors.add(new Senior("Diego", "Alexandro"));
        seniors.get(5).setAge(67);
        seniors.get(5).setProfilePicture(R.drawable.pp6);

        seniors.add(new Senior("May", "June"));
        seniors.get(6).setAge(97);
        seniors.get(6).setProfilePicture(R.drawable.pp7);

        seniors.add(new Senior("June", "July"));
        seniors.get(7).setAge(76);
        seniors.get(7).setProfilePicture(R.drawable.pp8);

        seniors.add(new Senior("Alexandra", "Smith"));
        seniors.get(8).setAge(66);
        seniors.get(8).setProfilePicture(R.drawable.pp9);

    }

    public static AppManager getInstance(){

        if(instance == null){
           instance = new AppManager();
            mainCareGiver = new CareGiver("Jane", "Smith");
        }
        return instance;
    }

    public void addMedicationsList() {
        ArrayList<Medication> medications0 = new ArrayList<>();
        medications0.add(new Medication("Aspirin", false, false, false, false, false, 4, false ));
        medications0.add(new Medication("Sertraline", false, false, false, false, false, 4, true ));
        medications0.add(new Medication("Insulin", false, false, false, false, false, 4, false ));
        medications0.add(new Medication("Seroquel", false, false, false, false, false, 4, false ));
        medications0.add(new Medication("Nasal Drops", false, false, false, false, false, 4, false ));
        currentSenior.setMedicationTracker(medications0);
    }

    public List<Senior> getSeniors() {
        return seniors;
    }

    public void setSeniors(List<Senior> seniors) {
        this.seniors = seniors;
    }

    public Senior getCurrentSenior() {
        return currentSenior;
    }

    public void setCurrentSenior(Senior currentSenior) {
        this.currentSenior = currentSenior;
    }

    public boolean isFirstRun() {
        return isFirstRun;
    }

    public void setFirstRun(boolean firstRun) {
        isFirstRun = firstRun;
    }

    public CareGiver getMainCareGiver() {
        return mainCareGiver;
    }

    public void setMainCareGiver(CareGiver mainCareGiver) {
        this.mainCareGiver = mainCareGiver;
    }

    public void printSeniorsInformation(){
        for(int i = 0 ; i < seniors.size(); i++){
            System.out.println(
                    "Senior " + i + ": " +
                            seniors.get(i).getFirstName() +
                            " " + seniors.get(i).getLastName() +
                            " " + seniors.get(i).getID_num());
        }
    }

}
