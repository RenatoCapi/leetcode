package com.leetcode.medium;

public class StringToInteger {
    public int myAtoi(String s) {
        char[] cArray = s.toCharArray();
        int i = 0, j = 0, size = cArray.length;
        int isPositive = 1;
        long sum = 0L;

        if (size == 0)
            return 0;

        while (cArray[i] == ' ') {
            i++;

            if (i == size) {
                return 0;
            }
        }

        if (cArray[i] == '-') {
            isPositive = -1;
            i++;
        } else if (cArray[i] == '+') {
            i++;
        }

        if (i == size)
            return 0;

        j = i;

        while (j < size && cArray[j] >= '0' && cArray[j] <= '9')
            j++;

        if (j == 0)
            return 0;

        while (i < j) {
            sum += (long) isPositive * (cArray[i] - '0') * Math.pow(10, j - i - 1);
            i++;
        }
        if (sum > Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        }
        if (sum < Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }

        return (int) sum;
    }
}
