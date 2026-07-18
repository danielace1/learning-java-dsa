package com.example.problems.leetcode;

// https://leetcode.com/problems/minimum-array-end/
public class Problem3133 {
    class Solution {
        public long minEnd(int n, int x) {
            long ans = x;
            long val = n - 1;

            int bit = 0;

            while (val > 0) {
                if ((ans & (1L << bit)) == 0) {
                    if ((val & 1) == 1) {
                        ans |= (1L << bit);
                    }
                    val >>= 1;
                }
                bit++;
            }

            return ans;
        }
    }
}
