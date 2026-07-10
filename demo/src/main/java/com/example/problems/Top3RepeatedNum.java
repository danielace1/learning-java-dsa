package com.example.problems;

import java.util.Arrays;
import java.util.HashMap;

public class Top3RepeatedNum {
    public static void main(String[] args) {
        int[] arr = { 3, 4, 2, 3, 16, 3, 15, 16, 15, 15, 16, 2, 3, 6, 2, 3 };
        // op: 3, 16, 15

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // System.out.println(map);

        // for (int key : map.keySet()) {
        // System.out.println(key + "->" + map.get(key));
        // }

        int first = -1, second = -1, third = -1;
        int f1 = 0, f2 = 0, f3 = 0;

        for (int key : map.keySet()) {
            int freq = map.get(key);

            if (freq > f1) {
                f3 = f2;
                third = second;

                f2 = f1;
                second = first;

                f1 = freq;
                first = key;
            } else if (freq > f2) {
                f3 = f2;
                third = second;

                f2 = freq;
                second = key;
            } else if (freq > f3) {
                f3 = freq;
                third = key;
            }
        }

        System.out.println(first + ", " + second + ", " + third);

    }
}
