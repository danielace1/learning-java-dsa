package com.example.problems.set4;

public class OddNumbersRange {
    public static void main(String[] args) {
        int s = 2;
        int e = 15;
        // 3,5,7,9,11,13

        for (int i = s; i < e; i++) {
            if (i % 2 != 0) {
                System.out.println("Odd numbers: " + i);
            }
        }

    }
}
