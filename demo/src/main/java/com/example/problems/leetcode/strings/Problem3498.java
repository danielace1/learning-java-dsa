package com.example.problems.leetcode.strings;

public class Problem3498 {
    class Solution {
        public int reverseDegree(String s) {
            int sum = 0;
            char[] ch = s.toCharArray();

            for (int i = 0; i < ch.length; i++) {
                int revInd = 27 - (ch[i] - 'a' + 1);
                int prod = revInd * (i + 1);
                sum += prod;

            }

            return sum;
        }
    }
}
