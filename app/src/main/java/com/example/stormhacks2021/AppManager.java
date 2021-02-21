package com.example.stormhacks2021;

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
        seniors = new ArrayList<>();

        seniors.add(new Senior("John1", "Smith1"));
        seniors.add(new Senior("John2", "Smith2"));
        seniors.add(new Senior("John3", "Smith3"));
        seniors.add(new Senior("John4", "Smith4"));
        seniors.add(new Senior("John5", "Smith5"));
        seniors.add(new Senior("John6", "Smith6"));
        seniors.add(new Senior("John7", "Smith7"));
        seniors.add(new Senior("John8", "Smith8"));
        seniors.add(new Senior("John9", "Smith9"));
        seniors.add(new Senior("John10", "Smith10"));

        if(instance != null){
            isFirstRun = false;
        }else{
            isFirstRun = true;
        }
    }

    public static AppManager getInstance(){

        if(instance == null){
           instance = new AppManager();
            mainCareGiver = new CareGiver("Jane", "Smith");
        }
        return instance;
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
