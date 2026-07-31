package com.example.problems.set4;

public class ExcelSheetCol {
    public static void main(String[] args) {
        int n = 28;

        StringBuilder res = new StringBuilder();

        while (n > 0) {
            n--;
            int rem = n % 26;
            char letr = (char) ('A' + rem);
            res.append(letr);
            n /= 26;
        }

        System.out.println(res.reverse().toString());

    }
}
