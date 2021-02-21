package com.example.stormhacks2021;

import java.util.ArrayList;
import java.util.List;

public class CareGiver extends User{

    private AppManager appManager;
    List<Senior> seniors;

    public CareGiver(String firstName, String lastName) {
        super(firstName, lastName);
        appManager = AppManager.getInstance();
    }

    public List<Senior> getSeniors() {
        return seniors;
    }

    public void setSeniors(List<Senior> seniors) {
        this.seniors = seniors;
    }

    public void addSenior(Senior senior){
        seniors.add(senior);
    }

}
