package com.example.problems;

public class ReverseSubstring {
    public static void main(String[] args) {
        String s1 = "azdcbeabaf"; // 9012654312
        String s2 = "fabaedcbza"; // 2165432109
        // op 1: dcb in s1, reverse it to make s2,
        // op 2: 6543

        int start = 0;
        int n = s1.length();

        while (start < n && s1.charAt(start) == s2.charAt(n - 1 - start)) {
            start++;
        }
        for (int end = start; end < n; end++) {
            String temp = reverse(s1, start, end);

            if (isReverse(temp, s2)) {
                System.out.println("Substring: " + s1.substring(start, end + 1));
                System.out.println(temp);
                break;
            }
        }

    }

    private static boolean isReverse(String s1, String s2) {
        int i = 0, j = s2.length() - 1;

        while (i < s1.length()) {
            if (s1.charAt(i) != s2.charAt(j)) {
                return false;
            }
            i++;
            j--;

        }

        return true;
    }

    private static String reverse(String s1, int l, int r) {
        char[] arr = s1.toCharArray();

        while (l < r) {
            char temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;
            r--;
        }

        return new String(arr);

    }
}
