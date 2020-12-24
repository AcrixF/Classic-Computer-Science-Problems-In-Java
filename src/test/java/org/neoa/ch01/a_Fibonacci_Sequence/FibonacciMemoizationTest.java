package org.neoa.ch01.a_Fibonacci_Sequence;

import org.approvaltests.Approvals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.neoa.ch01.a_Fibonacci_Sequence.FibonacciMemoization.fibonacci;

public class FibonacciMemoizationTest {

    private List<Integer> sequence = null;

    @BeforeEach
    void setup() {
        sequence = new ArrayList<>();
    }

    @Test
    void fibonacciReturnsExpectedSequenceWhenIndexIsGreaterThanTwo() {
        for (int i = 0; i < 5; i++)
            sequence.add(fibonacci(i));

        assertThat(sequence)
                .containsExactlyInAnyOrder(0,1, 1, 2, 3);
    }

    @Test
    void fibonacciReturnsExpectedSequenceWhenNIsGreaterThan50() {
        int n = 50;
        for (int i = 0; i < n; i++)
            sequence.add(fibonacci(i));

        Approvals.verify(sequence);
    }

}
