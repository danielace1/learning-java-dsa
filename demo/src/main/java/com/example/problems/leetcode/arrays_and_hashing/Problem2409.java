package com.example.problems.leetcode.arrays_and_hashing;

// https://leetcode.com/problems/count-days-spent-together
public class Problem2409 {
    class Solution {
        public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {

            int[] days = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

            int start = Math.max(convert(arriveAlice, days), convert(arriveBob, days));
            int end = Math.min(convert(leaveAlice, days), convert(leaveBob, days));

            return Math.max(0, end - start + 1);
        }

        private int convert(String date, int[] days) {
            String[] parts = date.split("-");

            int month = Integer.parseInt(parts[0]);
            int day = Integer.parseInt(parts[1]);

            int total = day;

            for (int i = 0; i < month - 1; i++) {
                total += days[i];
            }

            return total;
        }
    }
}