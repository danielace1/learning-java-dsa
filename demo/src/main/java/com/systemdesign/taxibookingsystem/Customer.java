package com.systemdesign.taxibookingsystem;

public class Customer {
    private int customerId;
    private char pickup;
    private char drop;
    private int pickuptime;

    Customer(int id, char pickup, char drop, int pickuptime) {
        this.customerId = id;
        this.pickup = pickup;
        this.drop = drop;
        this.pickuptime = pickuptime;
    }

    public int getCustomerId() {
        return customerId;
    }

    public char getPickup() {
        return pickup;
    }

    public char getDrop() {
        return drop;
    }

    public int getPickuptime() {
        return pickuptime;
    }

}
