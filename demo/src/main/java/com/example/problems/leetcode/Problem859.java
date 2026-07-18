package com.example.problems.leetcode;

// https://leetcode.com/problems/buddy-strings/
public class Problem859 {
    class Solution {
        public boolean buddyStrings(String s, String goal) {

            if (s.length() != goal.length())
                return false;

            int first = -1, second = -1;

            for (int i = 0; i < s.length(); i++) {

                if (s.charAt(i) != goal.charAt(i)) {
                    if (first == -1) {
                        first = i;
                    } else if (second == -1) {
                        second = i;
                    } else {
                        return false;
                    }
                }
            }

            if (first == -1) {
                boolean[] seen = new boolean[26];

                for (char ch : s.toCharArray()) {
                    if (seen[ch - 'a']) {
                        return true;
                    }
                    seen[ch - 'a'] = true;
                }
                return false;
            }
            ;

            if (second == -1)
                return false;

            return s.charAt(first) == goal.charAt(second) && s.charAt(second) == goal.charAt(first);

        }

    }
}
