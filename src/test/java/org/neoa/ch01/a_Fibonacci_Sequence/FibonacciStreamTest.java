package org.neoa.ch01.a_Fibonacci_Sequence;

import org.approvaltests.Approvals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Collectors;

import static org.assertj.core.api.Assertions.assertThat;

public class FibonacciStreamTest {

    private FibonacciStream fibonacciStream;
    private List<Integer> sequence;

    @BeforeEach
    void setup() {
        this.fibonacciStream = new FibonacciStream();
    }

    @Test
    void fibonacciReturnsExpectedSequenceWhenIndexIsGreaterThanTwo() {
        sequence = fibonacciStream.fibonacci()
                .limit(5).boxed().collect(Collectors.toList());

        assertThat(sequence)
                .containsExactlyInAnyOrder(0, 1, 1, 2, 3);
    }

    @Test
    void fibonacciReturnsExpectedSequenceWhenNIsGreaterThan50() {
       sequence = fibonacciStream.fibonacci()
               .limit(50).boxed().collect(Collectors.toList());

        Approvals.verify(sequence);
    }

}
