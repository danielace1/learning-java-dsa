package com.example.problems;

public class PrintLettera {
    public static void main(String[] args) {
        String str = "abcac";
        int n = 10;

        StringBuilder sb = new StringBuilder();

        while (sb.length() < 100) {
            sb.append(str);
        }

        int count = 0;
        for (int i = 0; i < 10; i++) {
            if (sb.charAt(i) == 'a') {
                count++;
            }
        }

        System.out.println(count);

    }
}
