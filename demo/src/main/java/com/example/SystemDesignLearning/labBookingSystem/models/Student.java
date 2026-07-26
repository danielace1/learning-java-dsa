package com.example.SystemDesignLearning.labBookingSystem.models;

public class Student {
    private int studentId;
    private String studentName;

    public Student(int id, String name) {
        this.studentId = id;
        this.studentName = name;
    }

    public int getStudentId() {
        return studentId;
    }

    public String getStudentName() {
        return studentName;
    }

}
