package com.example.SystemDesignLearning.labBookingSystem.models;

public class Lab {
    private int labId;
    private String labName;
    private double perDayCharge;

    public Lab(int id, String name, double charge) {
        this.labId = id;
        this.labName = name;
        this.perDayCharge = charge;
    }

    public int getLabId() {
        return labId;
    }

    public String getLabName() {
        return labName;
    }

    public double getPerDayCharge() {
        return perDayCharge;
    }

}
