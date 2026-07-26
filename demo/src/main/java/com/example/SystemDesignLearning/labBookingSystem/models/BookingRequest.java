package com.example.SystemDesignLearning.labBookingSystem.models;

public class BookingRequest {
    private int requestId;
    private Student student;
    private Lab lab;

    public BookingRequest(int requestId, Student student, Lab lab) {
        this.requestId = requestId;
        this.student = student;
        this.lab = lab;
    }

    public int getRequestId() {
        return requestId;
    }

    public Student getStudent() {
        return student;
    }

    public Lab getLab() {
        return lab;
    }

}
