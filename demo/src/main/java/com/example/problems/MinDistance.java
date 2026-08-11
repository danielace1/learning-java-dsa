package com.example.problems;

public class MinDistance {
    public static void main(String[] args) {
        // int[] arr = { 7, 1, 3, 4, 1, 7 };
        int[] arr = { 1, 2, 3, 1, 4, 5 };

        // int[] arr = { 1, 2, 3, 4, 10 };

        int n = 5;

        int min = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] == arr[i]) {
                    min = Math.min(min, j - i);
                }
            }
        }

        if (min == Integer.MAX_VALUE) {
            System.out.println("-1");
        } else {
            System.out.println(min);
        }

        pairSocks();

    }

    private static void pairSocks() {
        int[] arr = { 10, 20, 20, 10, 10, 30, 50, 10, 20 };
        boolean[] paired = new boolean[arr.length];

        // 10 -> 4 = 2 pairs
        // 20 -> 3 = 1 pair
        // op : 3

        int pairs = 0;

        for (int i = 0; i < arr.length; i++) {
            if (paired[i]) {
                continue;
            }

            for (int j = i + 1; j < arr.length; j++) {

                if (!paired[j] && arr[i] == arr[j]) {
                    pairs++;
                    paired[i] = true;
                    paired[j] = true;
                    break;
                }
            }
        }
        System.out.println(pairs);
    }
}
