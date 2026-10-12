package com.leetcode.easy;

public class SumSquaresSpecialElements {
    public int sumOfSquares(int[] nums) {
        int anwser = 0;
        for (int i = 0; i < nums.length; i++) {
            if (((nums.length) % (i + 1)) == 0)
                anwser += nums[i] * nums[i];
        }

        return anwser;
    }
}
