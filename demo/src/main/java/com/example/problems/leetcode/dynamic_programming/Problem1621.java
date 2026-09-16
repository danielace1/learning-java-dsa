package com.example.problems.leetcode.dynamic_programming;

// https://leetcode.com/problems/number-of-sets-of-k-non-overlapping-line-segments
public class Problem1621 {

    class Solution {
        static final long MOD = 1_000_000_007;

        long power(long a, long b) {
            long res = 1;

            while (b > 0) {
                if (b % 2 == 1) {
                    res = res * a % MOD;
                }
                a = a * a % MOD;
                b /= 2;
            }

            return res;
        }

        long modInverse(long x) {
            return power(x, MOD - 2);
        }

        long combination(long n, long r) {
            r = Math.min(r, n - r);

            long ans = 1;

            for (long i = 1; i <= r; i++) {
                ans = ans * (n - r + i) % MOD;
                ans = ans * modInverse(i) % MOD;
            }

            return ans;
        }

        public int numberOfSets(int n, int k) {
            long N = n + k - 1L;
            long R = 2L * k;

            return (int) combination(N, R);
        }
    }

}
