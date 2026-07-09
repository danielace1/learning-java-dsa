package com.example.OOP.polymorphism;

public class Circle extends Shapes {

    // override the parent area() method
    @Override
    void area() {
        System.out.println("circle");
    }
}
