package com.example.OOP.cloning;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Human sd = new Human(20, "Sudharsan");
        // Human twin = new Human(sd);

        Human twin = (Human) sd.clone();
        System.out.println(twin.age + " " + twin.name);
        System.out.println(Arrays.toString(twin.arr));

        twin.arr[0] = 100;

        System.out.println(Arrays.toString(twin.arr));
        System.out.println(Arrays.toString(sd.arr));

    }
}
