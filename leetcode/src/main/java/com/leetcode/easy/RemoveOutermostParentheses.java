package com.leetcode.easy;

public class RemoveOutermostParentheses {

    // (()())()(()(()))
    public String removeOuterParentheses(String s) {
        char[] cArray = s.toCharArray();
        StringBuilder answer = new StringBuilder();
        int layer = 0;

        for (int i = 0; i < s.length(); i++) {
            while (layer != 0 && i < s.length()) {
                layer += (cArray[i] == '(') ? 1 : -1;
                if (layer != 0)
                    answer.append(cArray[i]);

                i++;
            }

            layer++;
        }

        return answer.toString();
    }
}
