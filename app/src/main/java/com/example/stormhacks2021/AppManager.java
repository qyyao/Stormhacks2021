package com.example.stormhacks2021;

import java.util.ArrayList;
import java.util.List;

public class AppManager {

    private List<Senior> seniors;
    private static AppManager instance;
    private Senior currentSenior;
    private static CareGiver mainCareGiver;
    private boolean isFirstRun;

    private AppManager(){
        seniors = new ArrayList<>();

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
