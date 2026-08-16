package com.example.problems.leetcode.arrays_and_hashing;


public class Problem1672 {
    public static void main(String[] args) {

    }

    static int maximumWealth(int[][] accounts) {
        int max = Integer.MIN_VALUE;
        for (int[] account2 : accounts) {
            int sum = 0;
            for (int element : account2) {
                sum += element;
            }

            if (sum > max) {
                max = sum;
            }
        }

        return max;
    }

}
