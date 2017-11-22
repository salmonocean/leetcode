package com.leetcode.algorithm._137;

/**
 * @see https://leetcode.com/problems/single-number-ii/description/
 * Tag: Bit Op
 */
public class SingleNumberII {

    public int singleNumber(int[] nums) {
        int ones = 0;
        int twos = 0;
        int threes = 0;

        for (int i = 0; i < nums.length; i++) {
            twos |= ones & nums[i];

            ones ^= nums[i];

            threes = twos & ones;

            twos &= ~threes;
            ones &= ~threes;
        }

        return ones;
    }
}
