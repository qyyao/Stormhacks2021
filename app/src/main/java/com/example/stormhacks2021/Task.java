package com.example.stormhacks2021;

import java.util.Objects;
import java.util.*;

public class Task {

    //Priority rankings are by default
        //Medical (Taking Medications) set to 1
            //UNLESS PRN (as needed) then it is set to 999
        //ADLs (Activity of Daily Living) are set to 2
        //Checks (Blood Pressure) are set to 3
        //Chores (Mail, Email, Bills, Cleaning) are set to 4
    //Medical > ADL > Checks > Chores > PRN

    int priority;

    enum Tasks {
        DEFAULT,
        EATBREAKFAST,
        EATDINNER,
        TAKEPILL,
        APPLYTOPICAL,
        BLOODPRESSURE,
        EXERCISE,
    }

    Tasks current_task;
    //----------------Constructor--------------//
    Task() {
        priority = 999;
        current_task = Tasks.DEFAULT;
    }

    Task(int taskPriority, Tasks taskType) {
        priority = taskPriority;
        current_task = taskType;
    }

    //----------------Methods--------------//
    int defaultPriority() {
        int priority = 0;
        // this is for medical tasks
        if (this.current_task == Tasks.APPLYTOPICAL ||
        this.current_task == Tasks.TAKEPILL) {
            priority = 1;
        }

        else if (this.current_task == Tasks.EATBREAKFAST ||
                this.current_task == Tasks.EATDINNER) {
            priority = 2;
        }

        else if (this.current_task == Tasks.BLOODPRESSURE) {
            priority = 3;
        }

        else if (this.current_task == Tasks.EXERCISE) {
            priority = 4;
        }

        return priority;
    }

    //----------------Getters--------------//
    public int getPriority() {
        return priority;
    }

    public Tasks getCurrent_task() {
        return current_task;
    }

    //----------------Setters--------------//
    public void setPriority(int priority) {
        this.priority = priority;
    }

    public void setCurrent_task(Tasks current_task) {
        this.current_task = current_task;
    }
}