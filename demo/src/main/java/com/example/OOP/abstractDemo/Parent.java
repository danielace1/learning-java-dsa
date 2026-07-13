package com.example.OOP.abstractDemo;

abstract public class Parent {

    int age;

    public Parent(int age) {
        this.age = age;
    }

    static void hello() {
        System.out.println("hey");
    }

    void normal() {
        System.out.println("Normal method");
    }

    abstract void career();

    abstract void partner();

}
