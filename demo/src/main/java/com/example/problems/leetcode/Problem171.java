package com.example.problems.leetcode;

// https://leetcode.com/problems/excel-sheet-column-numbe
public class Problem171 {
    public static void main(String[] args) {
        String s = "ZZ";

        // METHOD: 1

        // int col_num = 0;

        // for (int i = 0; i < s.length(); i++) {
        // col_num = col_num * 26 + s.charAt(i) - 'A' + 1;
        // }

        // System.out.println(col_num);

        // METHOD: 2

        int col_num2 = 0;

        int l = s.length() - 1;

        for (int i = 0; i < l; i++) {
            col_num2 += (s.charAt(i) - 'A' + 1) * Math.pow(26, l);
            l--;
        }

        col_num2 += s.charAt(l) - 'A' + 1;

        System.out.println(col_num2);
    }
}
