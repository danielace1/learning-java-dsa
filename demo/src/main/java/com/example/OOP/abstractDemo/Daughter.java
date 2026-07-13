package com.example.OOP.abstractDemo;

public class Daughter extends Parent {

    public Daughter(int age) {
        super(age);
    }

    @Override
    void career() {
        System.out.println("Im shiloh");
    }

    @Override
    void partner() {
        System.out.println("Im shiloh" + "Im 20 years old");
    }

}
