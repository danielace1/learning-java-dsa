package com.example.OOP.abstractDemo;

public class Main {
    public static void main(String[] args) {
        Son son = new Son(30);
        son.career();

        Daughter daughter = new Daughter(20);
        daughter.career();

        // Parent mom = new Parent(); // cannot create obj of abstract class
    }
}
