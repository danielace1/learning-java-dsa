package com.example.SystemDesignLearning.taxiBookingSystem;

public class Customer {
    private int customerId;
    private char pickup;
    private char drop;
    private int picktime;

    Customer(int id, char pickup, char drop, int ptime) {
        this.customerId = id;
        this.pickup = pickup;
        this.drop = drop;
        this.picktime = ptime;
    }

    // encapsulation
    public int getCustomerId() {
        return customerId;
    }

    public char getPickup() {
        return pickup;
    }

    public char getDrop() {
        return drop;
    }

    public int getPickTime() {
        return picktime;
    }

}
