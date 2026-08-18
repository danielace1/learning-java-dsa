package com.example.problems.leetcode.misc;

// https://leetcode.com/problems/stone-game-ix
public class Problem2029 {
    // alice and bob stone game
    class Solution {
        public boolean stoneGameIX(int[] stones) {
            int count0 = 0;
            int count1 = 0;
            int count2 = 0;

            for (int stone : stones) {
                int r = stone % 3;

                if (r == 0) {
                    count0++;
                } else if (r == 1) {
                    count1++;
                } else {
                    count2++;
                }
            }

            if (count0 % 2 == 0) {
                return count1 > 0 && count2 > 0;
            }

            return Math.abs(count1 - count2) > 2;

        }
    }
}