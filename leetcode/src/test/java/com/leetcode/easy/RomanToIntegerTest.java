package com.leetcode.easy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class RomanToIntegerTest {

    @ParameterizedTest
    @MethodSource
    void testRomanToInt(String input, int expected) {
        RomanToInteger r = new RomanToInteger();
        int output = r.romanToInt(input);
        assertEquals(output, expected);
    }

    private static Stream<Arguments> testRomanToInt() {
        return Stream.of(
                Arguments.of("III", 3),
                Arguments.of("LVIII", 58),
                Arguments.of("MCMXCIV", 1994),
                Arguments.of("DCXXI", 621),
                Arguments.of("IV", 4));
    }
}
