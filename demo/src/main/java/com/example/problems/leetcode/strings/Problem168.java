package com.example.problems.leetcode.strings;

// https://leetcode.com/problems/excel-sheet-column-title/
public class Problem168 {
    class Solution {
        public String convertToTitle(int columnNumber) {
            StringBuilder res = new StringBuilder();

            while (columnNumber > 0) {
                columnNumber--;
                int rem = columnNumber % 26;
                char ltr = (char) ('A' + rem);
                res.append(ltr);
                columnNumber /= 26;
            }

            return res.reverse().toString();
        }
    }
}
