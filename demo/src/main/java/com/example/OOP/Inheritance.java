package com.example.OOP;

public class Inheritance {

    double l;
    double h;
    double w;

    // Box
    Inheritance() {
        this.l = -1;
        this.h = -1;
        this.w = -1;
    }

    // cube
    Inheritance(double side) {
        this.w = side;
        this.l = side;
        this.h = side;
    }

    public Inheritance(double l, double h, double w) {
        this.l = l;
        this.h = h;
        this.w = w;
    }

    Inheritance(Inheritance old) {
        this.h = old.h;
        this.l = old.l;
        this.w = old.w;
    }

    public void information() {
        System.out.println("Running the box");
    }

    public static void main(String[] args) {

    }

}
