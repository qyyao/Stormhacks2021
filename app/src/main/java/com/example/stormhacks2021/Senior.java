package com.example.stormhacks2021;

import java.util.ArrayList;
import java.util.List;

public class Senior extends User {

    int medicationCounter;
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

    public int getMedicationCounter() {
        return medicationCounter;
    }

    public void setMedicationCounter(int medicationCounter) {
        this.medicationCounter = medicationCounter;
    }

    public boolean isTookMedication() {
        return tookMedication;
    }

    public void setTookMedication(boolean tookMedication) {
        this.tookMedication = tookMedication;
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
