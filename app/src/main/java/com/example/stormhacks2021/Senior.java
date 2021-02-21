package com.example.stormhacks2021;

import java.util.ArrayList;
import java.util.List;

import android.graphics.drawable.Drawable;
import android.media.Image;
import android.widget.ImageView;

import java.util.HashMap;
import java.util.Map;

public class Senior extends User {

    int age;
    int profilePicture;
    Map<String, Boolean> medicationTracker;
    boolean tookMedication;
    boolean checkBloodPressure;
    boolean calledFamily;
    boolean ateBreakfast;
    boolean ateDinner;
    boolean ateLunch;
    int numNotifications;
    private List<String> careGiverNotifications;

    public Senior(String firstName, String lastName){
        super(firstName, lastName);
        careGiverNotifications = new ArrayList<>();
    }

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

    public void setMedicationTracker(Map<String, Boolean> medicationTracker){
        this.medicationTracker = medicationTracker;
    }

    public Map<String, Boolean> getMedicationTracker(){
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

    public int getNumNotifications() {
        System.out.print("GET NUM NOTIF: " + getCareGiverNotifications().size());
        numNotifications = careGiverNotifications.size();
        return numNotifications;
    }

    public void setNumNotifications(int numNotifications) {
        this.numNotifications = numNotifications;
    }

    public void notifyCareGiver(String message){
        careGiverNotifications.add(message);
    }

    public List<String> getCareGiverNotifications(){
        return careGiverNotifications;
    }

}
