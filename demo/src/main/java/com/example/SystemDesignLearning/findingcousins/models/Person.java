package com.example.SystemDesignLearning.findingcousins.models;

public class Person {
    private int personId;
    private String name;
    private String gender;
    private int fatherId;
    private int motherId;

    public Person(int personId, String name, String gender, int fatherId, int motherId) {
        this.personId = personId;
        this.name = name;
        this.gender = gender;
        this.fatherId = fatherId;
        this.motherId = motherId;
    }

    @Override
    public String toString() {
        return "Person ID : " + personId +
                ", Name : " + name +
                ", Gender : " + gender;
    }

    public int getPersonId() {
        return personId;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public int getFatherId() {
        return fatherId;
    }

    public int getMotherId() {
        return motherId;
    }

}
