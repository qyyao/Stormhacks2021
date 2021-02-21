package com.example.stormhacks2021;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.Random;

public class User {

    String firstName;
    String lastName;
    int ID_num;

    public User(String firstName, String lastName) {
        Random random = new Random();
        int ID = random.nextInt(900) + 100;
        this.firstName = firstName;
        this.lastName = lastName;
        this.ID_num = ID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getID_num() {
        return ID_num;
    }

    public void setID_num(int ID_num) {
        this.ID_num = ID_num;
    }

}
