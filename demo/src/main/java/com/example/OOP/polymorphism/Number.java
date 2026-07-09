package com.example.OOP.polymorphism;

public class Number {

    // converts to double when calling like (2,3)
    double sum(double a, int b) {
        return a + b;
    }

    double sum(int a, int b) {
        return a + b;
    }

    int sum(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        Number obj = new Number();

        obj.sum(2, 3); // compile time polymorphism
        obj.sum(1, 3, 4);
    }
}
