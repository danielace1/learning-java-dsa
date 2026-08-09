package com.example.problems;

public class BracketCombinations {

    // n pairs Valid combinations Catalan number
    // 0 empty 1
    // 1 () 1
    // 2 ()(), (()) 2
    // 3 ()()(), ()(()), (())(), (()()), ((())) 5
    // 4 14 valid arrangements 14

    // The formula for the nth Catalan number is:
    // Cn​=1/(n+1)(2nCn)

    public static int combinations(int num) {
        // code goes here

        int[] dp = new int[num + 1];
        dp[0] = 1;

        for (int i = 1; i <= num; i++) {
            for (int j = 0; j < i; j++) {
                dp[i] += dp[j] * dp[i - j - 1];
            }
        }

        return dp[num];
    }

    public static void main(String[] args) {
        // keep this function call here

        System.out.print(combinations(3));

    }

}
