package com.leetcode.easy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class RemoveOutermostParenthesesTest {
    @ParameterizedTest
    @MethodSource
    void testRemoveOuterParentheses(String input, String expected) {
        RemoveOutermostParentheses r = new RemoveOutermostParentheses();
        String output = r.removeOuterParentheses(input);
        assertEquals(output, expected);
    }

    private static Stream<Arguments> testRemoveOuterParentheses() {
        return Stream.of(
                Arguments.of("(()())(())", "()()()"),
                Arguments.of("(()())(())(()(()))", "()()()()(())"),
                Arguments.of("()()", ""));
    }
}
