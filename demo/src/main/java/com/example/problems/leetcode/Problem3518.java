package com.example.problems.leetcode;

// https://leetcode.com/problems/smallest-palindromic-rearrangement-ii
public class Problem3518 {
    class Solution {

        private static final long LIMIT = 1_000_000L;

        public String smallestPalindrome(String s, int k) {

            int[] freq = new int[26];

            for (char ch : s.toCharArray()) {
                freq[ch - 'a']++;
            }

            int[] half = new int[26];
            char mid = 0;

            int halfLen = 0;

            for (int i = 0; i < 26; i++) {
                half[i] = freq[i] / 2;
                halfLen += half[i];

                if ((freq[i] & 1) == 1) {
                    mid = (char) ('a' + i);
                }
            }

            if (countPermutations(half) < k) {
                return "";
            }

            StringBuilder firstHalf = new StringBuilder();

            for (int pos = 0; pos < halfLen; pos++) {
                for (int c = 0; c < 26; c++) {
                    if (half[c] == 0) {
                        continue;
                    }

                    half[c]--;

                    long ways = countPermutations(half);

                    if (ways >= k) {
                        firstHalf.append((char) ('a' + c));
                        break;
                    }

                    k -= ways;
                    half[c]++;
                }
            }

            StringBuilder ans = new StringBuilder(firstHalf);

            if (mid != 0) {
                ans.append(mid);
            }
            ans.append(new StringBuilder(firstHalf).reverse());

            return ans.toString();

        }

        private static long countPermutations(int[] half) {
            int total = 0;

            for (int x : half) {
                total += x;
            }

            long ways = 1;
            int rem = total;

            for (int x : half) {
                if (x == 0) {
                    continue;
                }
                ways *= nCr(rem, x);

                if (ways > LIMIT) {
                    return LIMIT;
                }
                rem -= x;
            }
            return ways;
        }

        private static long nCr(int n, int r) {
            if (r > n) {
                return 0;
            }

            r = Math.min(r, n - r);

            long ans = 1;
            for (int i = 1; i <= r; i++) {
                ans = ans * (n - r + i) / i;

                if (ans > LIMIT) {
                    return LIMIT;
                }

            }
            return ans;
        }

    }
}
