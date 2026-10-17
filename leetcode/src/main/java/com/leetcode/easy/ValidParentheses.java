package com.leetcode.easy;

import java.util.ArrayList;
import java.util.List;

public class ValidParentheses {
    public boolean isValid(String s) {
        char[] open = new char[] { '(', '[', '{' };
        char[] close = new char[] { ')', ']', '}' };
        char[] cString = s.toCharArray();

        List<Integer> layers = new ArrayList<>();

        for (char c : cString) {
            for (int i = 0; i < 3; i++) {
                if (c == open[i]) {
                    layers.add(i);
                    break;
                }
            }

            for (int i = 0; i < 3; i++) {
                if (c == close[i]) {
                    if (layers.size() > 0) {
                        if (layers.getLast() != i) {
                            return false;
                        }

                        layers.removeLast();
                    } else {
                        return false;
                    }

                    break;
                }
            }
        }

        return (layers.size() == 0) ? true : false;
    }
}
