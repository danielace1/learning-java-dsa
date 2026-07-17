package com.systemdesign.railwayreservationsystem;

public class Passenger {
    private String name;
    private int age;
    private String gender;
    private String berthPreference; // L M U

    private String allottedBerth;
    private String ticketId;

    Passenger(String name, int age, String gender, String berthPreference, String allottedBerth, String ticketId) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.berthPreference = berthPreference;

        this.allottedBerth = allottedBerth;
        this.ticketId = ticketId;
    }

    @Override
    public String toString() {

        return "Ticeket ID: " + ticketId + ", Name: " + name + ", Age: " + age + ", Gender: " + gender + ", Berth: "
                + allottedBerth;
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

    public String getBerth() {
        return berthPreference;
    }

    public String getAllottedBerth() {
        return allottedBerth;
    }

    public String getTicketId() {
        return ticketId;
    }

    public String setAllotedBerth(String b) {
        return this.allottedBerth = b;
    }

}
