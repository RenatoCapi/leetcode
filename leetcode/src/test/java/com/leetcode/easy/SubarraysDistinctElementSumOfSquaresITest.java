package com.leetcode.easy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class SubarraysDistinctElementSumOfSquaresITest {

    @ParameterizedTest
    @MethodSource
    void testSumCounts(List<Integer> input, int expected) {
        SubarraysDistinctElementSumOfSquaresI s = new SubarraysDistinctElementSumOfSquaresI();
        int answer = s.sumCounts(input);

        assertEquals(expected, answer);
    }

    private static Stream<Arguments> testSumCounts() {
        return Stream.of(
                Arguments.of(List.of(1, 2, 1), 15),
                Arguments.of(List.of(1, 1), 3),
                Arguments.of(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 11), 1210));
    }
}
