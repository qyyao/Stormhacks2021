package com.example.stormhacks2021;

//---Documentation---//
//Two constructors exist so that the care-giver/nurse/professional can type the frequency in
// terms of how many times a day as an int (1,2,3,4,5) or as a string (qd,bid,tid,qid)

public class Medication { // for medication reminder

    // Not yet implemented into the constructors for user input
    enum MedicationTypes {
        DEFAULT,
        PILL,
        LIQUID,
        EYE,
        NEEDLE,
        IV,
        TOPICAL,
        INHALER,
        PATCH_IMPLANT,
    }

    String Name;
    Medication.MedicationTypes type = MedicationTypes.DEFAULT;
    boolean DNC;
    boolean withFood;
    boolean PRN; // this stands for 'as needed'
    boolean SelfAdministered;
    boolean HelpAdminister;
    int frequency;



    //The basic settings set a medication type, if not specified, to self-administered as needed
    Medication() {
        //DNC = do not crush
        boolean DNC = false;
        boolean withFood = false;
        boolean PRN = true;
        boolean SelfAdministered = true;
        boolean HelpAdministered = false;
        int frequency = -1;
        String frequencyJargon;
    }

    Medication(String theName, boolean isDNC, boolean isWithFood, boolean isPRN, boolean isSelfAdministered,
               boolean isHelpAdministered, int theFrequency){
        Name = theName;
        DNC = isDNC;
        withFood = isWithFood;
        PRN = isPRN;
        SelfAdministered = isSelfAdministered;
        HelpAdminister = isHelpAdministered;
        frequency = theFrequency;
    }

    Medication(String theName, boolean isDNC, boolean isWithFood, boolean isPRN, boolean isSelfAdministered,
               boolean isHelpAdministered, String theFrequency){
        Name = theName;
        DNC = isDNC;
        withFood = isWithFood;
        PRN = isPRN;
        SelfAdministered = isSelfAdministered;
        HelpAdminister = isHelpAdministered;

        if (theFrequency.equals("qd") || theFrequency.equals("QD")
                || theFrequency.equals("Q.D") || theFrequency.equals("q.d")) {
            frequency = 1;
        }

        if (theFrequency.equals("bid") || theFrequency.equals("BID")
                || theFrequency.equals("B.I.D") || theFrequency.equals("b.i.d")) {
            frequency = 2;
        }

        if (theFrequency.equals("tid") || theFrequency.equals("TID")
                || theFrequency.equals("T.I.D") || theFrequency.equals("t.i.d")) {
            frequency = 3;
        }

        if (theFrequency.equals("qid") || theFrequency.equals("QID")
                || theFrequency.equals("Q.I.D") || theFrequency.equals("q.i.d")) {
            frequency = 4;
        }


    }

    //----------Getters & Setters-----------//
    public boolean isDNC() {
        return DNC;
    }

    public void setDNC(boolean DNC) {
        this.DNC = DNC;
    }

    public boolean isWithFood() {
        return withFood;
    }

    public void setWithFood(boolean withFood) {
        this.withFood = withFood;
    }

    public boolean isPRN() {
        return PRN;
    }

    public void setPRN(boolean PRN) {
        this.PRN = PRN;
    }

    public boolean isSelfAdministered() {
        return SelfAdministered;
    }

    public void setSelfAdministered(boolean selfAdministered) {
        SelfAdministered = selfAdministered;
    }

    public boolean isHelpAdminister() {
        return HelpAdminister;
    }

    public void setHelpAdminister(boolean helpAdminister) {
        HelpAdminister = helpAdminister;
    }

    public int getFrequency() {
        return frequency;
    }

    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }
}
