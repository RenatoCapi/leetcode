package com.leetcode.medium;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class MaximizeSumOfSquaresOfDigitsTest {

    @ParameterizedTest
    @MethodSource
    void testMaxSumOfSquares(int num, int sum, String expected) {
        MaximizeSumOfSquaresOfDigits m = new MaximizeSumOfSquaresOfDigits();
        String answer = m.maxSumOfSquares(num, sum);
        assertEquals(expected, answer);
    }

    private static Stream<Arguments> testMaxSumOfSquares() {
        return Stream.of(
                Arguments.of(2, 3, "30"),
                Arguments.of(2, 17, "98"),
                Arguments.of(1, 10, ""),
                Arguments.of(3, 1, "100"));
    }
}
