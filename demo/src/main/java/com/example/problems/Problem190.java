package com.example.problems;

// https://leetcode.com/problems/reverse-bits/
public class Problem190 {
    class Solution {
        public int reverseBits(int n) {
            int ans = 0;
            for (int i = 0; i < 32; i++) {
                ans = (ans << 1) | (n & 1);
                n >>>= 1;
            }

            return ans;

        }
    }
}
