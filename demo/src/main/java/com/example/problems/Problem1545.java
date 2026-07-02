package com.example.problems;

// https://leetcode.com/problems/find-kth-bit-in-nth-binary-string/description/
public class Problem1545 {
    class Solution {
        public char findKthBit(int n, int k) {

            if (n == 1)
                return '0';

            int len = (1 << n) - 1;
            int mid = (len + 1) / 2;

            if (k == mid) {
                return '1';
            }

            if (k < mid)
                return findKthBit(n - 1, k);

            // Right half: mirror and invert
            char ch = findKthBit(n - 1, len - k + 1);
            return ch == '0' ? '1' : '0';
        }
    }
}
