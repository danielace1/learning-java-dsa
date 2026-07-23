package com.greedyAlgoprob;

// https://leetcode.com/problems/can-place-flowers/
public class Problem605 {
    class Solution {
        public boolean canPlaceFlowers(int[] bed, int n) {
            for (int i = 0; i < bed.length; i++) {
                boolean left = (i == 0) || bed[i - 1] == 0;
                boolean right = (i == bed.length - 1) || bed[i + 1] == 0;

                if (bed[i] == 0 && left && right) {
                    bed[i] = 1;
                    n--;

                    if (n == 0) {
                        return true;
                    }
                }
            }

            return n <= 0;
        }

    }
}
