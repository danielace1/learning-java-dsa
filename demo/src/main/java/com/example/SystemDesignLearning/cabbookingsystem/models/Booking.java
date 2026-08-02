package com.example.SystemDesignLearning.cabbookingsystem.models;

public class Booking {
    private int bookingId;
    private Employee employee;
    private Cab cab;
    private String pickUp;
    private String drop;

    public Booking(int bookingId, Employee employee, Cab cab, String pickUp, String drop) {
        this.bookingId = bookingId;
        this.employee = employee;
        this.cab = cab;
        this.pickUp = pickUp;
        this.drop = drop;
    }

    public int getBookingId() {
        return bookingId;
    }

    public Employee getEmployee() {
        return employee;
    }

    public Cab getCab() {
        return cab;
    }

    public String getPickUp() {
        return pickUp;
    }

    public String getDrop() {
        return drop;
    }

}
