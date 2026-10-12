package com.leetcode.easy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class SumSquaresSpecialElementsTest {
    @ParameterizedTest
    @MethodSource
    void testTwoSum(int[] input, int expectedAnswer) {
        SumSquaresSpecialElements s = new SumSquaresSpecialElements();

        int answer = s.sumOfSquares(input);
        assertEquals(expectedAnswer, answer);
    }

    private static Stream<Arguments> testTwoSum() {
        return Stream.of(
                Arguments.of(new int[] { 1, 2, 3, 4 }, 21),
                Arguments.of(new int[] { 2, 7, 1, 19, 18, 3 }, 63));
    }
}
