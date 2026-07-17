package com.systemdesign.taxibookingsystem;

public class Booking {
    private int bookingId;
    private int dropTime;
    private int amount;
    private Customer customer;

    Booking(int id, int dropTime, int amount, Customer customer) {
        this.bookingId = id;
        this.dropTime = dropTime;
        this.amount = amount;
        this.customer = customer;
    }

    public int getBookingId() {
        return bookingId;
    }

    public int getDropTime() {
        return dropTime;
    }

    public int getAmount() {
        return amount;
    }

    public Customer getCustomer() {
        return customer;
    }

    public int getCustomerId() {
        return this.customer.getCustomerId();
    }

    public int getPickupPoint() {
        return this.customer.getPickup();
    }

    public int getDropPoint() {
        return this.customer.getDrop();
    }

    public int getPickUpTime() {
        return this.customer.getPickuptime();
    }

}
