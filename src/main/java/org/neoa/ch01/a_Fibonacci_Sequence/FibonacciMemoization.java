package org.neoa.ch01.a_Fibonacci_Sequence;

import java.util.HashMap;
import java.util.Map;

public class FibonacciMemoization {

    private static Map<Integer, Integer> memo = new HashMap<>(Map.of(0,0,1,1));

    public static int fibonacci(int n) {
        if (!memo.containsKey(n)) {
            memo.put(n, fibonacci(n - 1) + fibonacci(n - 2));
        }
        return memo.get(n);
    }

}
