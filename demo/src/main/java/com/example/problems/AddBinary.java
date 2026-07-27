package com.example.problems;

public class AddBinary {
    public static void main(String[] args) {
        String A = "11";
        String B = "1";
        // 100

        String res = "";

        int i = A.length() - 1;
        int j = B.length() - 1;
        int carry = 0;

        while (i >= 0 || j >= 0 || carry != 0) {
            int sum = carry;

            if (i >= 0) {
                sum += A.charAt(i--) - '0';
            }

            if (j >= 0) {
                sum += B.charAt(j--) - '0';
            }

            res = (sum % 2) + res;
            carry = sum / 2;
        }

        System.out.println(res);

    }
}
