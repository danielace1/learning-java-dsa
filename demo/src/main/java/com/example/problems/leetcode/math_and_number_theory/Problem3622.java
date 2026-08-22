package com.example.problems.leetcode.math_and_number_theory;

// https://leetcode.com/problems/check-divisibility-by-digit-sum-and-product
public class Problem3622 {
    class Solution {
        public boolean checkDivisibility(int n) {
            int sum = digitSum(n) + digitProd(n);

            return n % sum == 0;

        }

        private static int digitSum(int n) {
            int sum = 0;
            while (n != 0) {
                int rem = n % 10;
                sum += rem;
                n /= 10;
            }
            return sum;
        }

        private static int digitProd(int n) {
            int prod = 1;
            while (n != 0) {
                int rem = n % 10;
                prod *= rem;
                n /= 10;
            }
            return prod;
        }
    }
}
