package com.example.problems;

public class LongestStringWithoutFunc {
    public static void main(String[] args) {
        String s = "I play tennis";
        // "I came by bus late"

        int max = 0;
        int maxLen = 0;

        int curr = 0;
        int currLen = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ') {
                if (currLen == 0) {
                    curr = i;
                }
                currLen++;
            } else {
                if (maxLen < currLen) {
                    maxLen = currLen;
                    max = curr;
                }
                currLen = 0;
            }
        }

        if (maxLen < currLen) {
            maxLen = currLen;
            max = curr;
        }

        for (int i = max; i < max + maxLen; i++) {
            System.out.print(s.charAt(i));
        }

    }
}
