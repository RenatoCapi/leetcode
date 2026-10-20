package com.leetcode.medium;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class StringToIntegerTest {

    @ParameterizedTest
    @MethodSource
    void testMyAtoi(String input, int expected) {
        StringToInteger atoi = new StringToInteger();
        assertEquals(expected, atoi.myAtoi(input));
    }

    private static Stream<Arguments> testMyAtoi() {
        return Stream.of(
                Arguments.of("42", 42),
                Arguments.of("  -042", -42),
                Arguments.of("1337c0d3", 1337),
                Arguments.of("0-1", 0),
                Arguments.of("words and 987", 0));
    }
}
