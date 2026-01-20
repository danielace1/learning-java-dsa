package com.example.problems;


// TO find even no. of digits in array
public class Problem1295 {
    public static void main(String[] args) {

        int[] nums = { 12, 345, 2, 6, 7896 };

        // System.out.println(findNumbers(nums));

        System.out.println(dig2(123456));
    }

    static int findNumbers(int[] nums) {
        int count = 0;

        for (int num : nums) {
            if (even(num)) {
                count++;
            }
        }

        return count;
    }

    // even digits or not
    static boolean even(int num) {
        int dig = digits(num);

        if (dig % 2 == 0) {
            return true;
        }
        return false;

        // return dig % 2 == 0;
    }

    // count digits of number
    static int digits(int num) {

        if (num < 0) {
            num = num * -1;
        }

        if (num == 0) {
            return 1;
        }

        int count = 0;

        while (num > 0) {
            count++;
            num = num / 10;
        }

        return count;
    }

    static int dig2(int num) {

        if (num < 0) {
            num = num * -1;
        }

        return (int) (Math.log10(num)) + 1;
    }
}
