package com.example.problems.set4;

public class NumberInWords {

    static String[] ones = {
            "", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"
    };

    static String[] teens = {
            "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"
    };

    static String[] tens = {
            "", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"
    };

    public static void main(String[] args) {
        int n = 112;
        // Two hundred and thirty four

        if (n == 0) {
            System.out.println("Zero");
            return;
        }

        int hundreds = n / 100;
        int rem = n % 100; 

        if (hundreds > 0) {
            System.out.print(ones[hundreds] + " hundred");
        }

        if (hundreds > 0 && rem > 0) {
            System.out.print(" and ");
        }

        // 10 to 19
        if (rem >= 10 && rem <= 19) {
            System.out.print(teens[rem - 10]);
        }
        // 20 to 99
        else if (rem >= 20) {
            int ten = rem / 10;
            int one = rem % 10;

            System.out.print(tens[ten]);

            if (one > 0) {
                System.out.print(" " + ones[one]);
            }
        }
        // 1 to 9
        else if (rem > 0) {
            System.out.print(ones[rem]);
        }
    }

}
