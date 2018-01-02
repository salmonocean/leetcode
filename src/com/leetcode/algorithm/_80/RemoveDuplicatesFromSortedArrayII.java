package com.leetcode.algorithm._80;

/**
 * @see https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/description/
 * Tag: Array
 * Tag: Two Pointers
 */
public class RemoveDuplicatesFromSortedArrayII {

    public int removeDuplicates(int[] nums) {
        return removeDuplicates(nums, 2);
    }

    private int removeDuplicates(int[] nums, int k) {
        if (nums.length <= k) {
            return nums.length;
        }

        int newSize = k;

        for(int i = k; i < nums.length; i++) {
            if (nums[i] != nums[newSize - k]) {
                nums[newSize++] = nums[i];
            }
        }

        return newSize;
    }
}
