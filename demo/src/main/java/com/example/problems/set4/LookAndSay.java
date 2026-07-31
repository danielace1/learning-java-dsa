package com.example.problems.set4;

public class LookAndSay {
    public static void main(String[] args) {
        // Conway Sequence

        // 1
        // 1 1
        // 2 1
        // 1 2 1 1
        // 1 1 1 2 2 1

        int n = 5;

        String cur = "1";

        for (int i = 1; i <= n; i++) {
            for (char ch : cur.toCharArray()) {
                System.out.print(ch + " ");
            }
            System.out.println();
            cur = nextTerm(cur);
        }

    }

    private static String nextTerm(String cur) {
        StringBuilder res = new StringBuilder();

        // int count = 1;
        // char[] arr = cur.toCharArray();

        // for (int i = 0; i < arr.length - 1; i++) {
        // if (arr[i] == arr[i + 1]) {
        // count++;
        // } else {
        // res.append(count);
        // res.append(arr[i]);
        // count = 1;
        // }
        // }

        // res.append(count);
        // res.append(arr[arr.length - 1]);

        int i = 0;
        while (i < cur.length()) {
            char digit = cur.charAt(i);
            int count = 0;

            while (i < cur.length() && cur.charAt(i) == digit) {
                count++;
                i++;
            }

            res.append(count);
            res.append(digit);
        }

        return res.toString();

    }
}
