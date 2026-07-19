package com.example.problems;

import java.util.ArrayList;
import java.util.List;

public class GroupAnagrmas {
    public static void main(String[] args) {
        String[] s = { "eat", "tea", "tan", "ate", "nat", "bat" };

        List<List<String>> ans = new ArrayList<>();

        boolean[] visited = new boolean[s.length];

        for (int i = 0; i < s.length; i++) {
            if (visited[i]) {
                continue;
            }

            List<String> group = new ArrayList<>();
            group.add(s[i]);
            visited[i] = true;

            for (int j = i + 1; j < s.length; j++) {
                if (!visited[j] && isAnagram(s[i], s[j])) {
                    group.add(s[j]);
                    visited[j] = true;
                }
            }

            ans.add(group);
        }

        // return ans;
        for (List<String> x : ans) {
            System.out.println(x);
        }

    }

    private static boolean isAnagram(String s1, String s2) {
        if (s1.length() != s2.length())
            return false;

        int[] freq = new int[26];

        for (int i = 0; i < s1.length(); i++) {
            freq[s1.charAt(i) - 'a']++;
            freq[s2.charAt(i) - 'a']--;
        }

        for (int count : freq) {
            if (count != 0) {
                return false;
            }
        }

        return true;
    }

}
