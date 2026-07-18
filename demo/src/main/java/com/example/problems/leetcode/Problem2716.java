package com.example.problems.leetcode;

import java.util.HashSet;

// https://leetcode.com/problems/minimize-string-length/
public class Problem2716 {
    class Solution {
        public int minimizedStringLength(String s) {
            HashSet<Character> set = new HashSet<>();

            for (int i = 0; i < s.length(); i++) {
                set.add(s.charAt(i));
            }

            return set.size();
        }
    }
}
