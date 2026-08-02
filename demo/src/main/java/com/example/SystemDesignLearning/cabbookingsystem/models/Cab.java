package com.example.SystemDesignLearning.cabbookingsystem.models;

import com.example.SystemDesignLearning.cabbookingsystem.enums.CarType;

public class Cab {
    private int cabId;
    private String cabNum;
    private CarType carType;
    private boolean status;

    public Cab(int cabId, String cabNum, CarType carType) {
        this.cabId = cabId;
        this.cabNum = cabNum;
        this.carType = carType;
        this.status = true;
    }

    public int getCabId() {
        return cabId;
    }

    public String getCabNum() {
        return cabNum;
    }

    public CarType getCarType() {
        return carType;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

}
