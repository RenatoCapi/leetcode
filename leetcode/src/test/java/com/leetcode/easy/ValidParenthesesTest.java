package com.leetcode.easy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class ValidParenthesesTest {

    @ParameterizedTest
    @MethodSource
    void testIsValid(String s, boolean expect) {
        ValidParentheses v = new ValidParentheses();
        boolean answer = v.isValid(s);
        assertEquals(expect, answer);
    }

    private static Stream<Arguments> testIsValid() {
        return Stream.of(
                Arguments.of("()", true),
                Arguments.of("()[]{}", true),
                Arguments.of("(]", false),
                Arguments.of("([])", true),
                Arguments.of("([)]", false),
                Arguments.of("[", false),
                Arguments.of("]", false));
    }
}
