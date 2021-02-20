package com.example.stormhacks2021;

public class Senior extends User{

    public Senior(String firstName, String lastName){
        super(firstName, lastName);

    }

    int medicationCounter;
    boolean tookMedication;
    boolean checkBloodPressure;
    boolean calledFamily;
    boolean ateBreakfast;
    boolean ateDinner;
    boolean ateLunch;

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

}
