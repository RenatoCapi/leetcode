package com.leetcode.medium;

import java.util.Arrays;

public class MaximumAlternatingSumOfSquares {
    public long maxAlternatingSum(int[] nums) {
        for (int i = 0; i < nums.length; i = i + 1) {
            nums[i] = Math.abs(nums[i]);
        }

        Arrays.sort(nums);

        int halfIndex = nums.length / 2;

        long answer = 0;

        for (int i = nums.length - 1; i >= halfIndex; i--)
            answer += nums[i] * nums[i];

        for (int i = halfIndex - 1; i >= 0; i--)
            answer -= nums[i] * nums[i];

        return answer;
    }

}
