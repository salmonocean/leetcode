package com.leetcode.algorithm.Triangle;

import java.util.List;

/**
 * @see https://leetcode.com/problems/triangle/description/
 * No.: 120
 * Tag: Dynamic Programming
 */
public class Triangle {

    public int minimumTotal(List<List<Integer>> triangle) {
        int[] mins = new int[triangle.size() + 1];

        for (int i = triangle.size() - 1; i >= 0; i--) {
            for (int j = 0; j < triangle.get(i).size(); j++) {
                mins[j] = Math.min(mins[j], mins[j+1]) + triangle.get(i).get(j);
            }
        }

        return mins[0];
    }
}
