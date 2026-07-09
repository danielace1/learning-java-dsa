package com.example.OOP.polymorphism;

public class Main {
    public static void main(String[] args) {
        Shapes shapes = new Shapes();
        Square square = new Square();
        Shapes circle = new Circle();

        // type is parent class and obj is child class --> overriding else not
        // cannot override - final methods

        // shapes.area();
        // circle.area();
        square.area();
    }
}
