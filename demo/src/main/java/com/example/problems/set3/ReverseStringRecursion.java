package com.example.problems.set3;

public class ReverseStringRecursion {
    public static void main(String[] args) {
        String s = "One two three four";
        // four three two one

        String[] words = s.split(" ");

        reverse(words, 0);
    }

    private static void reverse(String[] words, int idx) {
        if (idx == words.length) {
            return;
        }

        reverse(words, idx + 1);

        // print after func over i.e when 3==3 then only print three, then two, one
        System.out.print(words[idx] + " ");

    }
}
