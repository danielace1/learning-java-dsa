package com.example.problems;

public class PalindromeString {
    public static void main(String[] args) {

        String s = "he know malayalam";

        int l = 0;
        int r = s.length() - 1;

        String word = "";

        String[] str = s.split(" ");

        for (int i = 0; i < str.length; i++) {
            if (!isPalindrome(str[i])) {
                word += str[i] + " ";
            }
        }

        System.out.println(word);

        // while (l < r) {
        // if (Character.toLowerCase(s.charAt(l)) != Character.toLowerCase(s.charAt(r)))
        // {
        // System.out.print(s.charAt(l));
        // }

        // l++;
        // r--;
        // }

        // System.out.println("NO palindrome");`
    }

    private static boolean isPalindrome(String s) {
        int l = 0;
        int r = s.length() - 1;

        while (l < r) {
            if (s.charAt(l) != s.charAt(r)) {
                return false;
            }
            l++;
            r--;
        }

        return true;

    }
}
