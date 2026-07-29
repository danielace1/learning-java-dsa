package com.example.problems.set3;

public class SubstringIndex {
    public static void main(String[] args) {
        String s = "testing12";
        String find = "12";

        int len = find.length();

        // normal method O(n x m);
        // normalMethod(s, find, len);

        // KMP O(n + m);
        System.out.println(KMP(s, find));

    }

    private static void normalMethod(String s, String find, int len) {
        for (int i = 0; i <= s.length() - len; i++) {
            if (s.charAt(i) == find.charAt(0)) {
                int k;
                for (k = 0; k < len; k++) {
                    if (s.charAt(i + k) != find.charAt(k)) {
                        break;
                    }
                }

                if (k == len) {
                    System.out.println("found at index: " + i);
                    return;
                }
            }
        }

        System.out.println("not found: -1");
    }

    // KMP - Knuth Morris Pratt O(m + n)
    private static int KMP(String text, String pattern) {
        int n = text.length();
        int m = pattern.length();

        int[] lps = buildLPS(pattern);

        int i = 0;
        int j = 0;

        while (i < n) {
            if (text.charAt(i) == pattern.charAt(j)) {
                i++;
                j++;
            }

            if (j == m) {
                return i - j;
            } else if (i < n && text.charAt(i) != pattern.charAt(j)) {
                if (j != 0) {
                    j = lps[j - 1];
                } else {
                    i++;
                }
            }
        }

        return -1;

    }

    // Building Longest Prefix Sum - LPS
    private static int[] buildLPS(String pattern) {
        int m = pattern.length();
        int[] lps = new int[m];

        int len = 0;
        int i = 1;

        while (i < m) {
            if (pattern.charAt(i) == pattern.charAt(len)) {
                len++;
                lps[i] = len;
                i++;
            } else {
                if (len != 0) {
                    len = lps[len - 1];
                } else {
                    lps[i] = 0;
                    i++;
                }
            }
        }

        return lps;
    }
}
