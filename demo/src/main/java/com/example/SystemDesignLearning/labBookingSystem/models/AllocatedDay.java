package com.example.SystemDesignLearning.labBookingSystem.models;

import java.time.LocalDate;

public class AllocatedDay {
    private int allocatedDayId;
    private BookingRequest bookingRequest;
    private LocalDate allocatedDate;

    public AllocatedDay(int allocatedDayId, BookingRequest bookingRequest, LocalDate allocatedDate) {
        this.allocatedDayId = allocatedDayId;
        this.bookingRequest = bookingRequest;
        this.allocatedDate = allocatedDate;
    }

    public int getAllocatedDayId() {
        return allocatedDayId;
    }

    public BookingRequest getBookingRequest() {
        return bookingRequest;
    }

    public LocalDate getAllocatedDate() {
        return allocatedDate;
    }

}
