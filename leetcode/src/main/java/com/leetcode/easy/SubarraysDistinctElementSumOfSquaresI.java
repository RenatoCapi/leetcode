package com.leetcode.easy;

import java.util.HashSet;
import java.util.List;

public class SubarraysDistinctElementSumOfSquaresI {
    public int sumCounts(List<Integer> nums) {
        int answer = 0;
        int count = 0;
        for (int i = 0; i < nums.size(); i++) {
            for (int j = 0; j <= i; j++) {
                HashSet<Integer> subSet = new HashSet<>(
                        nums.subList(j, nums.size() + j - i));

                int size = subSet.size();
                answer += size * size;
                count++;
            }
        }

        System.out.println(count);
        return answer;
    }
}
