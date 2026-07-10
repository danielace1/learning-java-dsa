package com.example.problems;

public class StringAdjacentPair {
    public static void main(String[] args) {
        String s1 = "asdfghij";
        String s2 = "adsfgijh";

        StringBuilder a = new StringBuilder();
        StringBuilder b = new StringBuilder();

        int i = 0;
        while (i < s1.length()) {
            if (s1.charAt(i) == s2.charAt(i)) {
                if (a.length() > 0) {
                    System.out.println(a + " - " + b);
                    a.setLength(0);
                    b.setLength(0);
                }
            } else {
                a.append(s1.charAt(i));
                b.append(s2.charAt(i));
            }

            i++;
        }

        if (a.length() > 0) {
            System.out.println(a + " - " + b);
        }

    }
}
