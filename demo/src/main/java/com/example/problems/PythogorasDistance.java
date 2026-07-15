package com.example.problems;

/**
 * PythogorasDistance
 */
public class PythogorasDistance {

    public static void main(String[] args) {
        String input = "3 4";

        String[] str = input.split(" ");

        float res = 0;

        for (int i = 0; i < str.length - 1; i++) {

            if (Integer.parseInt(str[i]) >= 0) {
                int sum = (int) Math.pow(Integer.parseInt(str[i]), 2) + (int) Math.pow(Integer.parseInt(str[i + 1]), 2);
                res = (int) Math.sqrt(sum);
            }
        }

        System.out.println(res);

    }
}