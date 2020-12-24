package org.neoa.ch01.a_Fibonacci_Sequence;

public class FibonacciIterative {

    public static int fibonacci(int n) {
        int last = 0;
        int next = 1;
        for (int i = 0; i < n; i++) {
            int oldLast = last;
            last = next;
            next = oldLast + next;
        }
        return last;
    }

}
