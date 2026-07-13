package com.example.OOP.abstractDemo;

public class Son extends Parent {

    public Son(int age) {
        super(age);
    }

    @Override
    void career() {
        System.out.println("Im a doctor");
    }

    @Override
    void partner() {
        System.out.println("I m sudharsan." + "Im 21 years old");
    }

}
