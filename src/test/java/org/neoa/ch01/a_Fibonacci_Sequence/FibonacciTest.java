package org.neoa.ch01.a_Fibonacci_Sequence;

import org.approvaltests.Approvals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.neoa.ch01.a_Fibonacci_Sequence.Fibonacci.fibonacci;

public class FibonacciTest {

    private List<Integer> sequence = null;

    @BeforeEach
    void setup() {
        sequence = new ArrayList<>();
    }

    @Test
    void fibonacciReturnsEmptySequenceWhenIndexIsZero() {
        for (int i = 0; i < 0; i++)
            sequence.add(fibonacci(i));

        assertThat(sequence).isEmpty();
    }

    @Test
    void fibonacciReturnSequenceWithOnlyOneElementWhenIndexIsEqualToOne() {
        for (int i = 0; i < 1; i++)
            sequence.add(fibonacci(i));

        assertThat(sequence)
                .hasSize(1)
                .containsExactlyInAnyOrder(0);
    }

    @Test
    void fibonacciReturnsExpectedSequenceWhenIndexIsGreaterThanTwo() {
        int n = 50;
        for (int i = 0; i < n; i++)
            sequence.add(fibonacci(i));

        Approvals.verify(sequence);
    }
}
