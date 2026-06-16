package com.example;

public class BitManipulation {
    public static void main(String[] args) {
        // int n = 102;

        // System.out.println(isOdd(n));

        int[] arr = { 2, 3, 3, 4, 2, 6, 4 };
        // System.out.println(ans(arr));

        // amazon qn -> print magic number
        int n = 6;
        int ans = 0;
        int base = 5;
        while (n > 0) {
            int last = n & 1;
            n = n >> 1;
            ans += last * base;
            base = base * 5;

        }
        // System.out.println(ans);

        // to find no. of digits
        int m = 34567;
        int b = 10;

        int answer = (int) (Math.log(m) / Math.log(b)) + 1;
        // System.out.println(answer);

        int y = 5; // note: fix for n = 0
        boolean answer1 = (y & (y - 1)) == 0;
        // System.out.println(answer1);

        int base1 = 3;
        int power = 6;
        int answer2 = 1;

        while (power > 0) {
            if ((power & 1) == 1) {
                answer2 *= base1;
            }
            base1 *= base1;
            power = power >> 1;
        }

        // System.out.println(answer2);

        // set bits
        int l = 45;
        // System.out.println(Integer.toBinaryString(l));

        // System.out.println(setbits(l));

        // range xor for a,b = xor(b) ^ xor(a-1)
        int a = 3;
        int c = 9;

        int answer3 = xor(c) ^ xor(a - 1);

        System.out.println(answer3);

        // only for check, will give TLE (time limit exceed) for large numbers
        int ans3 = 0;
        for (int i = a; i <= c; i++) {
            ans3 ^= i;
        }

        System.out.println(ans3);

    }

    // this gives XOR from 0 to a
    static int xor(int a) {
        if (a % 4 == 0) {
            return a;
        }
        if (a % 4 == 1) {
            return 1;
        }
        if (a % 4 == 2) {
            return a + 1;
        }

        return 0;
    }

    private static int setbits(int l) {
        int count = 0;

        while (l > 0) {
            count++;
            // l -= (l & -l);
            l = l & (l - 1);

        }

        return count;
    }

    // odd or even
    private static boolean isOdd(int n) {
        return (n & 1) == 1;
    }

    // find unique num
    private static int ans(int[] arr) {
        int unique = 0;

        for (int n : arr) {
            unique ^= n;
        }
        return unique;
    }

}