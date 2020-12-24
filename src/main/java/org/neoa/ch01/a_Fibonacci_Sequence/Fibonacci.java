package org.neoa.ch01.a_Fibonacci_Sequence;

public class a_Fibonacci {

    public static int fibonacci(int n) {
        if (n < 2)
            return n;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }


}
