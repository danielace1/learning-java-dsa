package com.example.OOP;

public class StaticExample {
    static int a = 4;
    static int b;

    // will only run once, when class loaded for 1st time
    static {
        System.out.println("I'm in static block");
        b = a * 5;
    }

    public static void main(String[] args) {
        StaticExample obj = new StaticExample();
        System.out.println(StaticExample.a + " " + StaticExample.b);

        StaticExample.b += 3;
        System.out.println(StaticExample.a + " " + StaticExample.b);

        StaticExample obj2 = new StaticExample();
        System.out.println(StaticExample.a + " " + StaticExample.b);

    }
}
