package com.leetcode.medium;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class MinimumInsertionsBalanceParenthesesStringTest {

    @ParameterizedTest
    @MethodSource
    void testMinInsertions(String input, int expected) {
        MinimumInsertionsBalanceParenthesesString m = new MinimumInsertionsBalanceParenthesesString();
        int output = m.minInsertions(input);
        assertEquals(output, expected);
    }

    private static Stream<Arguments> testMinInsertions() {
        return Stream.of(
                Arguments.of("(()))", 1),
                Arguments.of("())", 0),
                Arguments.of("))())(", 3),
                Arguments.of(")))))))", 5),
                Arguments.of("()()()()()(", 7));
    }
}
