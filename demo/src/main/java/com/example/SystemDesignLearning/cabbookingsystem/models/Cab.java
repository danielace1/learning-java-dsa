package com.example.SystemDesignLearning.cabbookingsystem.models;

import com.example.SystemDesignLearning.cabbookingsystem.enums.CarType;

public class Cab {
    private int cabId;
    private String cabNum;
    private CarType cabType;
    private boolean status;

    public Cab(int cabId, String cabNum, CarType cabType) {
        this.cabId = cabId;
        this.cabNum = cabNum;
        this.cabType = cabType;
        this.status = true;
    }

    public int getCabId() {
        return cabId;
    }

    public String getCabNum() {
        return cabNum;
    }

    public CarType getCabType() {
        return cabType;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

}
