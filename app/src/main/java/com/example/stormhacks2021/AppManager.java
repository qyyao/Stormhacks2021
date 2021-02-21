package com.example.stormhacks2021;

import java.util.ArrayList;
import java.util.List;

public class AppManager {

    private List<Senior> seniors;
    private static AppManager instance;

    private AppManager(){
        seniors = new ArrayList<>();
    }

    public static AppManager getInstance(){
        if(instance == null){
           instance = new AppManager();
        }
        return instance;
    }

    public List<Senior> getSeniors() {
        return seniors;
    }

    public void setSeniors(List<Senior> seniors) {
        this.seniors = seniors;
    }
}
