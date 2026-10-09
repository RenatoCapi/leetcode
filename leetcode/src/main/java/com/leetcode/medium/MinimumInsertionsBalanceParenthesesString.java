package com.leetcode.medium;

public class MinimumInsertionsBalanceParenthesesString {
    public int minInsertions(String s) {
        char[] input = s.toCharArray();
        int layer = 0;
        int needToClose = 0;

        for (int i = 0; i < input.length; i++) {
            if (input[i] == ')') {
                if (layer == 0) {
                    if ((i + 1) < input.length) {
                        needToClose += (input[++i] == ')') ? 1 : 2;
                        layer += (input[i] == '(') ? 1 : 0;
                    } else {
                        needToClose += 2;
                    }
                } else {
                    if ((i + 1) < input.length) {
                        if (input[i + 1] == ')') {
                            ++i;
                        } else {
                            ++needToClose;
                        }
                    } else {
                        ++needToClose;
                    }

                    --layer;
                }
            } else {
                ++layer;
            }
        }

        needToClose += layer * 2;
        return needToClose;
    }
}
