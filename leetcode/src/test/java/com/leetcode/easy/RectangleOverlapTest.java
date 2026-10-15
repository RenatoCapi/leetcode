package com.leetcode.easy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import com.leetcode.medium.MaximumAlternatingSumOfSquares;

public class RectangleOverlapTest {

    @ParameterizedTest
    @MethodSource
    void testIsRectangleOverlap(int[] input1, int[] input2, boolean expected) {
        RectangleOverlap r = new RectangleOverlap();
        MaximumAlternatingSumOfSquares m = new MaximumAlternatingSumOfSquares();
        boolean output = r.isRectangleOverlap(input1, input2);
        assertEquals(expected, output);
    }

    private static Stream<Arguments> testIsRectangleOverlap() {
        return Stream.of(
                Arguments.of(new int[] { 0, 0, 2, 2 }, new int[] { 1, 1, 3, 3 }, true),
                Arguments.of(new int[] { 0, 0, 1, 1 }, new int[] { 1, 0, 2, 1 }, false),
                Arguments.of(new int[] { 0, 0, 1, 1 }, new int[] { 2, 2, 3, 3 }, false),
                Arguments.of(new int[] { 2, 17, 6, 20 }, new int[] { 3, 8, 6, 20 }, true),
                Arguments.of(new int[] { -526, -216, 109, 495 }, new int[] { -211, -777, 630, -18 }, true));
    }
}
