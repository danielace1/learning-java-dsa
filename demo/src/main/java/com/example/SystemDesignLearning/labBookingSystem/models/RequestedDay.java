package com.example.SystemDesignLearning.labBookingSystem.models;

import java.time.LocalDate;

public class RequestedDay {
    private int requestedDayId;
    private BookingRequest bookingRequest;
    private LocalDate requestedDate;

    public RequestedDay(int requestedDayId, BookingRequest bookingRequest, LocalDate requestedDate) {
        this.requestedDayId = requestedDayId;
        this.bookingRequest = bookingRequest;
        this.requestedDate = requestedDate;
    }

    public int getRequestedDayId() {
        return requestedDayId;
    }

    public BookingRequest getBookingRequest() {
        return bookingRequest;
    }

    public LocalDate getRequestedDate() {
        return requestedDate;
    }

}
