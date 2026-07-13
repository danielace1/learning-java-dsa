package com.example.OOP.Interfaces;

public class Car implements Engine, Brake, Media {

    int a = 30;

    @Override
    public void brake() {
        System.out.println("Brake like a normal car");
    }

    @Override
    public void start() {
        System.out.println("start like a normal car");

    }

    @Override
    public void stop() {
        System.out.println("stop like a normal car");

    }

    @Override
    public void acc() {
        System.out.println("acc like a normal car");

    }

}
