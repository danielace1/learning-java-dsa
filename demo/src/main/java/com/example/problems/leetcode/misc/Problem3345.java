package com.example.problems.leetcode.misc;

// https://leetcode.com/problems/smallest-divisible-digit-product-i
public class Problem3345 {
    class Solution {
        public int smallestNumber(int n, int t) {
            for (int i = n; i <= 100; i++) {
                if (digit(i) % t == 0) {
                    return i;
                }
            }
            return 0;
        }

        private static int digit(int n) {
            int mul = 1;
            while (n != 0) {
                int rem = n % 10;
                mul *= rem;
                n /= 10;
            }
            return mul;
        }
    }
}
