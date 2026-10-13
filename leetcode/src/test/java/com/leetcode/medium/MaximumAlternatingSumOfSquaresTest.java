package com.leetcode.medium;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class MaximumAlternatingSumOfSquaresTest {
    
    @ParameterizedTest
    @MethodSource
    void testMaxAlternatingSum(int[] input, int expected) {
        MaximumAlternatingSumOfSquares m = new MaximumAlternatingSumOfSquares();
        long output = m.maxAlternatingSum(input);
        assertEquals(expected,output);
    }

    private static Stream<Arguments> testMaxAlternatingSum() {
        return Stream.of(
                Arguments.of(new int[]{1,2,3}, 12),
                Arguments.of(new int[]{1,-1,2,-2,3,-3}, 16));
    }
}
