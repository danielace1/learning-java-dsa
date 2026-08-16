package com.example.problems.leetcode.two_pointers;

public class Problem345 {
    class Solution {
        public String reverseVowels(String s) {

            char[] arr = s.toCharArray();

            int l = 0;
            int r = arr.length - 1;

            while (l < r) {
                if (!isVowel(arr[l])) {
                    l++;
                } else if (!isVowel(arr[r])) {
                    r--;
                } else {
                    char temp = arr[l];
                    arr[l] = arr[r];
                    arr[r] = temp;
                    l++;
                    r--;
                }
            }

            return new String(arr);
        }

        private static boolean isVowel(char ch) {
            ch = Character.toLowerCase(ch);

            return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
        }
    }
}
