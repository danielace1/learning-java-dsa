package com.example.problems;

public class SumMinAdjPair {
    // sum of minimum adjacent pairs
    public static void main(String[] args) {
        int[] arr = { 5, 2, 1, 4, 3 };
        // op: (5,2), (1,3) (3) = 2+1+3= 6

        int sum = 0;

        for (int i = 0; i < arr.length; i += 2) {

            if (i + 1 < arr.length) {
                int min = Math.min(arr[i], arr[i + 1]);
                sum += min;
            } else {
                sum += arr[i];
            }

        }

        System.out.println(sum);

    }
}
