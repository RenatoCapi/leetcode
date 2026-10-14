package com.leetcode.medium;

public class MaximizeSumOfSquaresOfDigits {
    public String maxSumOfSquares(int num, int sum) {

        // usar % e div por 9 para a versão optimal
        int acc = 0;
        int[] cNums = new int[num];

        for (int i = 0; i < num; i++) {
            if ((sum - acc <= 9)) {
                cNums[i] = sum - acc;
                acc += cNums[i];
                break;
            }

            cNums[i] = 9;
            acc += cNums[i];
        }
        if (acc < sum)
            return "";

        StringBuilder sb = new StringBuilder();
        for (int d : cNums) {
            sb.append(d);
        }
        return sb.toString();
    }
}
