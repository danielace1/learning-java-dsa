package com.example.problems.leetcode.strings;

// https://leetcode.com/problems/zigzag-conversion/
public class Problem6 {
    class Solution {
        public String convert(String s, int numRow) {

            if (numRow == 1 || s.length() <= numRow) {
                return s;
            }

            StringBuilder[] rows = new StringBuilder[numRow];

            for (int i = 0; i < numRow; i++) {
                rows[i] = new StringBuilder();
            }

            int curRow = 0;
            boolean goingDown = false;

            for (char ch : s.toCharArray()) {
                rows[curRow].append(ch);

                if (curRow == 0 || curRow == numRow - 1) {
                    goingDown = !goingDown;
                }

                curRow += goingDown ? 1 : -1;
            }

            StringBuilder res = new StringBuilder();
            for (StringBuilder row : rows)
                res.append(row);

            return res.toString();
        }
    }
}
