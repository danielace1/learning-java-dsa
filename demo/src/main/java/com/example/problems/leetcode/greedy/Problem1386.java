package com.example.problems.leetcode.greedy;

import java.util.Arrays;

// https://leetcode.com/problems/cinema-seat-allocation
public class Problem1386 {
    class Solution {
        public int maxNumberOfFamilies(int n, int[][] reservedSeats) {

            Arrays.sort(reservedSeats, (a, b) -> {
                if (a[0] != b[0]) {
                    return a[0] - b[0];
                }
                return a[1] - b[1];
            });

            int ans = 0;
            int i = 0;

            while (i < reservedSeats.length) {
                int row = reservedSeats[i][0];

                boolean left = true;
                boolean middle = true;
                boolean right = true;

                while (i < reservedSeats.length && reservedSeats[i][0] == row) {
                    int seat = reservedSeats[i][1];

                    if (seat >= 2 && seat <= 5) {
                        left = false;
                    }
                    if (seat >= 4 && seat <= 7) {
                        middle = false;
                    }
                    if (seat >= 6 && seat <= 9) {
                        right = false;
                    }

                    i++;
                }

                if (left && right) {
                    ans += 2;
                } else if (left || middle || right) {
                    ans += 1;
                }
            }

            int reservedRows = 0;
            int lastRow = -1;

            for (int[] seat : reservedSeats) {
                if (seat[0] != lastRow) {
                    reservedRows++;
                    lastRow = seat[0];
                }
            }
            ans += (n - reservedRows) * 2;

            return ans;

        }
    }
}
