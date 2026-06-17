package com.example;

import java.util.ArrayList;

public class Maths {
    public static void main(String[] args) {
        int n = 40;

        for (int i = 2; i <= n; i++) {
            // System.out.println(i + " " + isPrime(i));
        }

        boolean[] primes = new boolean[n + 1];
        // seive(n, primes);

        int p = 3; // precision val (afer decimal how many values)
        // System.out.printf("%.3f", sqrt(n, p));

        // System.out.println(newton(n));

        // factors3(20);

        // System.out.println(gcd(4, 9));
        System.out.println(lcm(3, 7));

    }

    // sieve of eratosthenes
    // - false in arr means num is prime
    static void seive(int n, boolean[] primes) {
        for (int i = 2; i * i <= n; i++) {
            if (!primes[i]) {
                for (int j = i * 2; j <= n; j += i) {
                    primes[j] = true;
                }
            }
        }

        for (int i = 2; i <= n; i++) {
            if (!primes[i]) {
                System.out.print(i + " ");
            }
        }
    }

    // binary sqrt --> Time: O(log(n))
    static double sqrt(int n, int p) {
        int s = 0;
        int e = n;

        double root = 0.0;

        while (s <= e) {
            int m = s + (e - s) / 2;

            if (m * m == n) {
                return m;
            }

            if (m * m > n) {
                e = m - 1;
            } else {
                s = m + 1;
            }

        }

        double incr = 0.1;
        for (int i = 0; i < p; i++) {
            while (root * root <= n) {
                root += incr;
            }

            root -= incr;
            incr /= 10;
        }

        return root;
    }

    // Newton Raphson sqrt
    static double newton(double n) {
        double x = n;
        double root;

        while (true) {
            root = 0.5 * (x + (n / x));

            if (Math.abs(root - x) < 0.5) {
                break;
            }

            x = root;
        }

        return root;

    }

    // prime num advanced
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
        return true;

    }

    // factors of number O(n)
    static void factors(int n) {
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
            }
        }
    }

    // factors of number O(sqrt(n))
    static void factors2(int n) {
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                if (n / i == i) {
                    System.out.print(i + " ");
                } else {
                    System.out.print(i + " " + n / i + " ");
                }
            }
        }
    }

    // both time and space will be O(sqrt(n))
    static void factors3(int n) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                if (n / i == i) {
                    System.out.print(i + " ");
                } else {
                    System.out.print(i + " ");
                    list.add(n / i);
                }
            }
        }

        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.print(list.get(i) + " ");
        }
    }

    // GCD
    static int gcd(int a, int b) {
        if (a == 0) {
            return b;
        }
        return gcd(b % a, a);
    }

    // LCM
    static int lcm(int a, int b) {
        return a * b / gcd(a, b);
    }

}
