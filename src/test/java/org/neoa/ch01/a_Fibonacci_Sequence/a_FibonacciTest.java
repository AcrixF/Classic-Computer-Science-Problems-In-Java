package org.neoa.ch01.a_Fibonacci_Sequence;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.neoa.ch01.a_Fibonacci_Sequence.Fibonacci.fibonacci;

public class a_FibonacciTest {

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
        for (int i = 0; i < 5; i++)
            sequence.add(fibonacci(i));

        assertThat(sequence)
                .containsExactlyInAnyOrder(0,1, 1, 2, 3);
    }
}
