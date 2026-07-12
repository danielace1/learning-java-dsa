package com.example.problems;

public class ReverseStringSpecialChar {
    public static void main(String[] args) {
        String s = "house ! no: 12";
        // 21one ! su: oh

        System.out.println(reverse(s));

    }

    private static String reverse(String s) {
        char[] str = s.toCharArray();

        int l = 0;
        int r = s.length() - 1;

        while (l < r) {
            if (!Character.isLetterOrDigit(str[l])) {
                l++;
            } else if (!Character.isLetterOrDigit(str[r])) {
                r--;
            } else {

                char temp = str[l];
                str[l] = str[r];
                str[r] = temp;
                l++;
                r--;
            }

        }
        return new String(str);
    }

}
