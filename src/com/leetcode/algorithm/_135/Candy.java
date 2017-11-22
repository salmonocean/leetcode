package com.leetcode.algorithm._135;

/**
 * @see https://leetcode.com/problems/candy/description/
 * Tag: Basic
 */
public class Candy {
    public int candy(int[] ratings) {
        int start = -1;

        int sum = 1;
        int c = 1;

        /**
         * 1. up
         * 2. equal
         * 3. down
         */
        int prevState = 2;

        for (int i = 1; i < ratings.length; i++) {
            if (ratings[i] > ratings[i-1]) {
                if (prevState != 1) {
                    c = 1;
                }

                c++;
                sum += c;

                prevState = 1;
            } else if (ratings[i] == ratings[i-1]) {
                c = 1;
                sum += c;

                prevState = 2;
            } else {
                if (prevState != 3) {
                    start = i - 1;
                }

                c--;

                sum += i - start + 1;

                if (c > 0) {
                    sum--;
                }

                prevState = 3;
            }
        }

        return sum;
    }
}
