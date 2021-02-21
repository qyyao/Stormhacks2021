package com.example.stormhacks2021;

import java.util.Objects;

public class Contact {
    String relation;
    String firstName;
    String lastName;
    String phoneNumber;
    String email;

    //----------------Constructor--------------//
    Contact() {
        relation = "Not Defined";
        firstName = "Missing";
        lastName = "Missing";
        phoneNumber = "111-111-1111";
        email = "Missing@Missing.org";
    }

    Contact(String inputRelation, String inputFirstName, String inputLastName,
            String inputPhoneNumber, String inputEmail) {
        relation = inputRelation;
        firstName = inputFirstName;
        lastName = inputLastName;
        phoneNumber = inputPhoneNumber;
        email = inputEmail;
    }

    //----------------Setters--------------//
    public void SetRelation(String newRelation) {
        relation = newRelation;
    }

    public void SetfirstName(String newfirstName) {
        firstName = newfirstName;
    }

    public void SetlastName(String newlastName) {
        lastName = newlastName;
    }

    public void SetphoneNumber(String newphoneNumber) {
        phoneNumber = newphoneNumber;
    }

    public void Setemail(String newemail) {
        phoneNumber = newemail;
    }

    //----------------Getters--------------//

    public String getrelation() {
        return relation;
    }

    public String getfirstName() {
        return firstName;
    }

    public String getlastname() {
        return lastName;
    }

    public String getphoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

}


