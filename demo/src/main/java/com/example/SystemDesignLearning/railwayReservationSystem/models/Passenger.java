package com.example.SystemDesignLearning.railwayReservationSystem.models;

public class Passenger {
    private String passengerId;
    private String name;
    private int age;
    private String gender;

    private Ticket ticket;

    public Passenger(String id, String name, int age, String gender, Ticket ticket) {
        this.passengerId = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.ticket = ticket;
    }

    @Override
    public String toString() {
        return "TicketId: " + ticket.getTicketId() + ", Name: " + name + ", Age: " + age + ", Gender: " + gender
                + ", Berth: " + ticket.getDisplayBerth();
    }

    public String getPassengerId() {
        return passengerId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public Ticket getTicket() {
        return ticket;
    }

}
