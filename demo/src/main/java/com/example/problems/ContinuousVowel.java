package com.example.problems;

public class ContinuousVowel {
    public static void main(String[] args) {
        String word = "aeioum!!"; 

        int v = 0;
        int c = 0;

        int flag = 0;

        for (int i = 0; i < word.length(); i++) {
            if (isVowel(word.charAt(i))) {
                v++;
                c = 0;
            } else if (word.charAt(i) == '!') {
                if (v > 0) {
                    v++;
                } else {
                    c++;
                }
            } else {
                c++;
                v = 0;
            }

            if (v >= 5 || c >= 3) {
                System.out.println(1); // positive word
                flag = 1;
                break;
            }
        }

        if (flag == 0) {
            System.out.println(0); // negative word
        }

    }

    private static boolean isVowel(char v) {
        char[] vowles = { 'a', 'e', 'i', 'o', 'u' };
        for (char vo : vowles) {
            if (v == vo) {
                return true;
            }
        }

        return false;
    }
}
