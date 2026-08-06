package com.example.problems.leetcode;

// https://leetcode.com/problems/complement-of-base-10-integer
public class Problem1009 {
    class Solution {
        public int bitwiseComplement(int n) {
            if (n == 0) {
                return 1;
            }

            String binary = "";

            while (n > 0) {
                int rem = n % 2;
                binary = rem + binary;
                n /= 2;
            }

            String complement = "";

            for (char ch : binary.toCharArray()) {
                if (ch == '0') {
                    complement += '1';
                } else {
                    complement += '0';
                }
            }

            return Integer.parseInt(complement, 2);
        }
    }
}
