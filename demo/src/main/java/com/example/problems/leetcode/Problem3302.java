package com.example.problems.leetcode;

// https://leetcode.com/problems/find-the-lexicographically-smallest-valid-sequence
public class Problem3302 {
    class Solution {
        public int[] validSequence(String word1, String word2) {
            int n = word1.length();
            int m = word2.length();

            int[] suf = new int[m];

            int i = n - 1;
            int j = m - 1;

            while (i >= 0 && j >= 0) {
                if (word1.charAt(i) == word2.charAt(j)) {
                    suf[j] = i;
                    j--;
                }
                i--;
            }

            while (j >= 0) {
                suf[j] = -1;
                j--;
            }
            int[] res = new int[m];
            boolean usedMismatch = false;
            j = 0;

            for (i = 0; i < n && j < m; i++) {
                if (word1.charAt(i) == word2.charAt(j)) {
                    res[j] = i;
                    j++;
                } else if (!usedMismatch) {
                    if (j == m - 1 || suf[j + 1] != -1 && suf[j + 1] > i) {
                        usedMismatch = true;
                        res[j] = i;
                        j++;
                    }
                }
            }

            if (j != m) {
                return new int[0];
            }

            return res;
        }
    }

}
