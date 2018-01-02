package com.leetcode.algorithm._75;

/**
 * @see https://leetcode.com/problems/sort-colors/description/
 * Tag: Array
 * Tag: Two Pointer
 */
public class SortColors {
    public void sortColors(int[] nums) {
        int red, white, blue, i;
        red = white = blue = 0;

        for (i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                nums[blue++] = 2;
                nums[white++] = 1;
                nums[red++] = 0;
            } else if (nums[i] == 1) {
                nums[blue++] = 2;
                nums[white++] = 1;
            } else {
                nums[blue++] = 2;
            }
        }
    }
}
