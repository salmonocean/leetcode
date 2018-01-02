package com.leetcode.algorithm._78;

import java.util.ArrayList;
import java.util.List;

/**
 * @see https://leetcode.com/problems/subsets/description/
 * Tag: DFS
 * Tag: Bit
 */
public class Subsets {
    public List<List<Integer>> subsets(int[] nums) {
        int total = (int)Math.pow(2, nums.length);
        List<List<Integer>> list = new ArrayList<>();

        int i, j, v;
        for (i = 0; i < total; i++) {
            List<Integer> subset = new ArrayList<>();
            v = i;
            j = 0;
            while (v > 0) {
                if ((v & 1) != 0)
                    subset.add(nums[j]);
                j++;
                v = v >> 1;
            }

            list.add(subset);
        }

        return list;
    }
}
