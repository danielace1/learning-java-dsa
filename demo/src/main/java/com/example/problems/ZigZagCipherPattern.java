package com.example.problems;

public class ZigZagCipherPattern {
    public static void main(String[] args) {
        // String s = "QWERTYUIOPASDFGHJKLZXCVBNMQWERTYUIOPLKJGGAS";
        String s = "PAYPALISHIRING";

        // System.out.print(ZigZag(s, 3));

        int r = 3;

        if (r <= 1) {
            System.out.println(s);
            return;
        }

        StringBuilder[] rows = new StringBuilder[r];
        for (int i = 0; i < r; i++) {
            rows[i] = new StringBuilder();
        }

        int curRow = 0;
        int direction = 1;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            rows[curRow].append(ch);
            if (curRow == 0) {
                direction = 1;
            } else if (curRow == r - 1) {
                direction = -1;
            }

            curRow += direction;
        }

        for (int i = 0; i < r; i++) {
            System.out.print(rows[i].toString());
        }

    }

    // private static String ZigZag(String s, int numRow) {
    // if (numRow == 1 || s.length() <= numRow) {
    // return s;
    // }

    // StringBuilder[] rows = new StringBuilder[numRow];

    // for (int i = 0; i < numRow; i++) {
    // rows[i] = new StringBuilder();
    // }

    // int curRow = 0;
    // boolean goingDown = false;

    // for (char ch : s.toCharArray()) {
    // rows[curRow].append(ch);

    // if (curRow == 0 || curRow == numRow - 1) {
    // goingDown = !goingDown;
    // }

    // curRow += goingDown ? 1 : -1;
    // }

    // StringBuilder res = new StringBuilder();
    // for (StringBuilder row : rows)
    // res.append(row);

    // return res.toString();
    // }
}
