package com.example.problems;

public class LongestConsecutiveSum {
    public static void main(String[] args) {
        int[] arr = { 7, 7, 3, 3, 3, 7, 7, 7 };
        // 7, 7, 3, 3, 3, 7, 7, 7 -> 3 9
        // 5,5,1,1,1,4,4,4,4,2 -> 4 16

        int maxCount = 1;
        int maxSum = arr[0];

        int count = 1;
        int sum = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) {
                count++;
                sum += arr[i];
            } else {
                // comparing
                if (count > maxCount) {
                    maxCount = count;
                    maxSum = sum;
                }

                count = 1;
                sum = arr[i];
            }

            // no number diff after it
            if (count > maxCount) {
                maxCount = count;
                maxSum = sum;
            }

        }

        System.out.println(maxCount + " " + maxSum);

    }
}
