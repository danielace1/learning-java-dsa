package com.example;

import java.util.Arrays;
import java.util.Scanner;

public class Sum {

    static int x = 10;

    public static void main(String[] args) {
        // sum();
        // String message = greet();
        // System.out.println(message);

        // String message = myGreet("Sudharsan");
        // System.out.println(message);

        // int a = 10;
        // int b = 20;

        // swap(a, b);

        // System.out.println("After swap a: " + a + ", b: " + b);

        // int[] arr = { 1, 2, 3, 4, 5 };
        // change(arr);
        // System.out.println("After change: " + Arrays.toString(arr));
        // System.out.println("After change: " + arr[0]);

        // for (int i = 0; i < arr.length; i++) {
        // System.out.print(arr[i] + " ");
        // }

        // String name = "Sudharsan";

        // {
        // name = "Sudharsan Daniel";
        // }
        // System.out.println("Name: " + name);

        // fun();

        // Scanner in = new Scanner(System.in);
        // System.out.print("Enter a number to check if it's prime: ");
        // int n = in.nextInt();

        // boolean isPrime = isPrime(n);
        // System.out.println(isPrime);

        Scanner in = new Scanner(System.in);
        // System.out.print("Enter a number to check if it's an Armstrong number: ");
        // int n = in.nextInt();
        // System.out.println(isArmstrong(n));

        for (int i = 100; i < 1000; i++) {
            if (isArmstrong(i)) {
                System.out.print(i + " ");
            }
        }

    }

    static boolean isArmstrong(int n) {
        int original = n;
        int sum = 0;

        while (n > 0) {
            int rem = n % 10;
            n = n / 10;
            sum += rem * rem * rem;
        }
        return sum == original;
    }

    static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }

        int c = 2;
        while (c * c <= n) {
            if (n % c == 0) {
                return false;
            }
            c++;
        }
        return c * c > n;

    }

    static void fun() {
        System.out.println("hello " + x);
    }

    static void change(int[] nums) {
        nums[0] = 100;
    }

    static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.println("a: " + a + ", b: " + b);
    }

    static String myGreet(String name) {
        String greeting = "Hello " + name;
        return greeting;
    }

    static String greet() {
        String greeting = "Hello, welcome to the Sum program!";
        return greeting;
    }

    static void sum() {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter num1: ");
        int num1 = in.nextInt();
        System.out.print("Enter num2: ");
        int num2 = in.nextInt();

        int sum = num1 + num2;
        System.out.println("The sum is: " + sum);

    }
}
