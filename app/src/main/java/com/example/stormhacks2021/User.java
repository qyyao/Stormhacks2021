package com.example.stormhacks2021;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.Random;

public class User implements Parcelable {

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

    protected User(Parcel in) {
        firstName = in.readString();
        lastName = in.readString();
        ID_num = in.readInt();
    }

    public static final Creator<User> CREATOR = new Creator<User>() {
        @Override
        public User createFromParcel(Parcel in) {
            return new User(in);
        }

        @Override
        public User[] newArray(int size) {
            return new User[size];
        }
    };

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

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(firstName);
        dest.writeString(lastName);
        dest.writeInt(ID_num);
    }
}
