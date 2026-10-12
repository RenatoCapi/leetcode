package com.leetcode.easy;

public class RomanToInteger {
    public int romanToInt(String s) {
        final String[] uniRomans = new String[] {
                "I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M"
        };
        final int[] uniArabic = new int[] {
                1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000
        };

        final char[] input = s.toCharArray();
        int index = input.length - 1;
        int indexRoman = 0;
        int answer = 0;
        while (index >= 0) {
            if ((index - 1 >= 0) && uniRomans[indexRoman].equals("" + input[index - 1] + input[index])) {
                answer += uniArabic[indexRoman];
                index -= 2;
                continue;
            }

            if (uniRomans[indexRoman].equals("" + input[index])) {
                answer += uniArabic[indexRoman];
                index -= 1;
                continue;
            }

            indexRoman++;
        }

        return answer;
    }
}
