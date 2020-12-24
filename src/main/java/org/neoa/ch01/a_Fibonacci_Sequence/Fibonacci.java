package org.neoa.ch01.a_Fibonacci_Sequence;

public class Fibonacci {

    public static int fibonacci(int n) {
        if (n < 2) return n;
        return fibonacci(n - 2) + fibonacci(n - 1);
    }

}
