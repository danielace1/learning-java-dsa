package com.example.problems;

import java.util.HashSet;

public class LongestSubstringWithoutRepeatChar {
    public static void main(String[] args) {
        String s = "asdsdah";
        HashSet<Character> set = new HashSet<>();

        int start = 0;
        String res = "";

        for (int i = 0; i < s.length(); i++) {
            while (set.contains(s.charAt(i))) {
                set.remove(s.charAt(start));
                start++;
            }

            set.add(s.charAt(i));

            if (i - start + 1 > res.length()) {
                res = s.substring(start, i + 1);
            }
        }

        System.out.println(res);
    }
}
