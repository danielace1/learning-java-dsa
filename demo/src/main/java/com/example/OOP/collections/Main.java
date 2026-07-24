package com.example.OOP.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        List<Integer> list2 = new LinkedList<>();

        List<Integer> vector = new Vector<>();
        vector.add(45);
        vector.add(5);
        vector.add(15);
        vector.add(56);

        System.err.println(vector);

    }
}
