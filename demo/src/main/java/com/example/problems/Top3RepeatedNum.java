package com.example.problems;

import java.util.Arrays;
import java.util.HashMap;

public class Top3RepeatedNum {
    public static void main(String[] args) {
        int[] arr = { 3, 4, 2, 3, 16, 3, 15, 16, 15, 15, 16, 2, 3, 6, 2, 3 };
        // [1,1,2,2,2,2,4,5,5,5,10,12]
        // op: 3, 16, 15, 2

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // System.out.println(map);

        // for (int key : map.keySet()) {
        // System.out.println(key + "->" + map.get(key));
        // }

        int first = -1, second = -1, third = -1;
        // int first = -1, second = -1;
        int f1 = 0, f2 = 0, f3 = 0;
        // int f1 = 0, f2 = 0;

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
                // }
            } else if (freq > f3) {
                f3 = freq;
                third = key;
            }
        }

        // array hashing
        int max = 16;
        int[] freq1 = new int[max + 1];

        for (int n : arr) {
            freq1[n]++;
        }

        int f11 = -1, f22 = -1;

        for (int i = 0; i < freq1.length; i++) {
            if (f11 == -1 || freq1[i] > freq1[f11]) {
                f22 = f11;
                f11 = i;
            } else if (f22 == -1 || freq1[i] > freq1[f22]) {
                f22 = i;
            }
        }

        System.out.println(f11 + " " + f22);

        System.out.println(first + ", " + second + ", " + third);
        // System.out.println(first + ", " + second);

    }
}
