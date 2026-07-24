package com.example.OOP.ExceptionHandling;

public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 0;

        try {
            // int c = a / b;
            // divide(a, b);

            // mimicking
            // throw new Exception("for fun");

            String name = "sudharsan";
            if (name.equals("sudharsan")) {
                throw new MyException("name is sudharsan");
            }

        } catch (MyException e) {
            System.out.println(e.getMessage() + "my exception");
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage() + "specific exception");
        } catch (Exception e) {
            System.out.println(e.getMessage() + "normal exception");
        } finally {
            System.out.println("Execute always");
        }

    }

    static int divide(int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("dont divide by zero");
        }

        return a / b;
    }
}
