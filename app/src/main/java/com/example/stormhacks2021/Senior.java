package com.example.stormhacks2021;

import android.graphics.drawable.Drawable;
import android.media.Image;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Senior extends User {

    public Senior(String firstName, String lastName){
        super(firstName, lastName);

    }

    int age;
    int profilePicture;
    ArrayList<Medication> medicationTracker;
    boolean checkBloodPressure;
    boolean calledFamily;
    boolean ateBreakfast;
    boolean ateDinner;
    boolean ateLunch;

    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return age;
    };

    public void setProfilePicture(int profilePicture){
        this.profilePicture = profilePicture;
    }

    public int getProfilePicture(){
        return profilePicture;
    }

    public void setMedicationTracker(ArrayList<Medication> medicationTracker){
        this.medicationTracker = medicationTracker;
    }

    public ArrayList<Medication> getMedicationTracker(){
        return medicationTracker;
    }

    public boolean isCheckBloodPressure() {
        return checkBloodPressure;
    }

    public void setCheckBloodPressure(boolean checkBloodPressure) {
        this.checkBloodPressure = checkBloodPressure;
    }

    public boolean isCalledFamily() {
        return calledFamily;
    }

    public void setCalledFamily(boolean calledFamily) {
        this.calledFamily = calledFamily;
    }

    public boolean isAteBreakfast() {
        return ateBreakfast;
    }

    public void setAteBreakfast(boolean ateBreakfast) {
        this.ateBreakfast = ateBreakfast;
    }

    public boolean isAteDinner() {
        return ateDinner;
    }

    public void setAteDinner(boolean ateDinner) {
        this.ateDinner = ateDinner;
    }

    public boolean isAteLunch() {
        return ateLunch;
    }

    public void setAteLunch(boolean ateLunch) {
        this.ateLunch = ateLunch;
    }

}
