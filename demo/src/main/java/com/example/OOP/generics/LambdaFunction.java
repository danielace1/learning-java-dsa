package com.example.OOP.generics;

import java.util.ArrayList;
import java.util.function.Consumer;

public class LambdaFunction {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            arr.add(i + 1);
        }

        // arr.forEach((item) -> System.err.println(item * 2));

        Consumer<Integer> fun = (item) -> System.err.println(item * 2);
        arr.forEach(fun);

        Operation sum = (a, b) -> a + b;
        Operation prod = (a, b) -> a * b;

        LambdaFunction myCalc = new LambdaFunction();
        System.out.println(myCalc.operate(5, 3, sum));
        System.out.println(myCalc.operate(5, 3, prod));

    }

    private int operate(int a, int b, Operation op) {
        return op.operation(a, b);
    }

}

/**
 * sum
 */
interface Operation {
    int operation(int a, int b);

}