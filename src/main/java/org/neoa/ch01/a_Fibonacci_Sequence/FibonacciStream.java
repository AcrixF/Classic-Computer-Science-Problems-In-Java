package org.neoa.ch01.a_Fibonacci_Sequence;

import java.util.stream.IntStream;

public class FibonacciStream {
    private int last = 0;
    private int next = 1;

    public IntStream fibonacci() {
        return IntStream.generate(() -> {
            int oldLast = last;
            last = next;
            next = oldLast + next;
            return oldLast;
        });
    }

}
