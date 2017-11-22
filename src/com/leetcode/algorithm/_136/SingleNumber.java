package com.leetcode.algorithm._136;

/**
 * @see https://leetcode.com/problems/single-number/description/
 * Tag: Bit Op
 */
public class SingleNumber {

    public int singleNumber(int[] nums) {
        int target = nums[0];
        for (int i = 1; i < nums.length; i++) {
            target = target ^ nums[i];
        }

        return target;
    }
}
