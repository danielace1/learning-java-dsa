package com.example;

import java.util.ArrayList;
import java.util.Arrays;

public class StringBuilder1 {
    public static void main(String[] args) {

        String name = "Sudharsan Daniel";
        // System.out.println("Name: " + name);

        String a = "Sudharsan";
        String c = a; // c == a -> true
        // String b = "Sudharsan"; a==b -> true
        // to check val use .equals method
        a = "Daniel"; // creating new object in heap

        String name1 = new String("Sudharsan");
        String name2 = new String("Sudharsan");

        // name1 == name2 -> false (diff var, obj)
        System.out.println("using equals: " + name1.equals(name2));
        System.out.println(name1.charAt(0));

        System.out.println(10);
        System.out.println("Hello");
        System.out.println(new int[] { 1, 2, 3, 4, 5 });
        // System.out.println(Arrays.toString(new int[] { 1, 2, 3, 4, 5 }));

        String z = null;
        System.out.println(z);

        // pretty printing
        float f = 123.412f;
        System.out.printf("floating %.2f: ", f); // also round off
        System.out.printf("Pie: ", Math.PI);

        System.out.println((char) ('a' + 3));
        // "a" + "1"
        // integer will be converted to Interer wrapper class that will call toString()

        String res = new Integer(56) + "" + new ArrayList<>();

        System.out.println("String + primitives: " + res);

        String series = "";

        for (int i = 0; i < 26; i++) {
            char ch = (char) ('a' + i);
            // System.out.println(ch);
            series += ch;
        }

        System.out.println("series: " + series);

        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < 26; i++) {
            char ch = (char) ('a' + i);
            // System.out.println(ch);
            builder.append(ch);
        }

        System.out.println("builder: " + builder.toString());

        System.out.println(Arrays.toString(name.toCharArray()));

        // palindrome or not
        // use 2 pointer start, end
        String str = "level";
        System.out.println("is Palindrome: " + isPalindrome(str));

    }

    static boolean isPalindrome(String str) {
        if (str == null || str.length() == 0) {
            return true;
        }

        str = str.toLowerCase();

        for (int i = 0; i <= str.length() / 2; i++) {
            char start = str.charAt(i);
            char end = str.charAt(str.length() - 1 - i);

            if (start != end) {
                return false;
            }
        }

        return true;
    }
}
