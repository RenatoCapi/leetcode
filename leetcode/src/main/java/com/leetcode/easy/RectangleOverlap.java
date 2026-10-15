package com.leetcode.easy;

public class RectangleOverlap {
    public boolean isRectangleOverlap(int[] rec1, int[] rec2) {
        // optimal solution
        // boolean xOverlap = rec1[2] > rec2[0] && rec1[0] < rec2[2];

        // boolean yOverlap = rec1[3] > rec2[1] && rec1[1] < rec2[3];

        // return xOverlap && yOverlap;

        // my solution
        int side = 1;

        int[][] x = new int[2][2];
        x[0][0] = rec1[0];
        x[0][1] = rec1[2];

        x[1][0] = rec2[0];
        x[1][1] = rec2[2];

        int[][] y = new int[2][2];
        y[0][0] = rec1[1];
        y[0][1] = rec1[3];

        y[1][0] = rec2[1];
        y[1][1] = rec2[3];
        boolean answer = true;

        answer &= (x[0][0] * side < x[1][1] * side) ? true : false;
        side *= -1;

        answer &= (x[0][1] * side < x[1][0] * side) ? true : false;
        side *= -1;

        answer &= (y[0][0] * side < y[1][1] * side) ? true : false;
        side *= -1;

        answer &= (y[0][1] * side < y[1][0] * side) ? true : false;

        return answer;
    }
}
