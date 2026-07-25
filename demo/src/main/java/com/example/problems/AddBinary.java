package com.example.problems;

public class AddBinary {
    public static void main(String[] args) {
        String A = "11";
        String B = "1";
        // 100

        StringBuilder res = new StringBuilder();

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

            res.append(sum % 2);
            carry = sum / 2;
        }

        System.out.println(res.reverse().toString());

    }
}
