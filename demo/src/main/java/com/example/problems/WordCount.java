package com.example.problems;

public class WordCount {
    public static void main(String[] args) {

        String s = "  he   know    malayalam     language";

        String[] str = s.split(" ");

        // String[] str = s.trim().split("\\s+")

        int wordCount = 0;

        for (int i = 0; i < str.length; i++) {
            if (str[i].length() > 0) {
                wordCount++;
            }
        }

        System.out.println(wordCount);

    }
}
