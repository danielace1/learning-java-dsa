package com.example.problems;

public class BuyAndSellTime {
    public static void main(String[] args) {

        int[] prices = { 5, 5, 10, 8, 7, 6, 4, 5, 2, 6, 1, 10 };

        // int[] prices = { 1, 5, 2, 3, 7, 6, 4, 5 };
        // buy day 1 and sell day 3

        // int min = arr[0];

        int i = 0;
        int profit = 0;

        // for only one transaction
        // for (int i = 1; i < arr.length; i++) {
        // if (arr[i] < min) {
        // min = arr[i];
        // } else {
        // profit = Math.max(profit, arr[i] - min);
        // }
        // }
        // System.out.println(min);
        // System.out.println(profit);

        while (i < prices.length - 1) {

            // buy point(local min)
            while (i < prices.length - 1 && prices[i] >= prices[i + 1]) {
                i++;
            }

            if (i == prices.length - 1) {
                break;
            }

            int buy = i++;

            // sell point(local max)
            while (i < prices.length && prices[i] >= prices[i - 1]) {
                i++;
            }

            int sell = i - 1;

            profit += prices[sell] - prices[buy];

            System.out.println("Buy on day " + (buy + 1) + " and sell on day " + (sell + 1));

        }

        System.out.println("Total profit: " + profit);

    }
}