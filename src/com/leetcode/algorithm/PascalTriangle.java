package com.leetcode.algorithm;

import java.util.ArrayList;
import java.util.List;

/**
 * @see https://leetcode.com/problems/pascals-triangle/description/
 * No.: 118
 * Tag: Simple
 */
public class PascalTriangle {
    public static void main(String[] args) {
        System.out.println(new PascalTriangle().generate(4));
    }

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();

        if (numRows <= 0) {
            return list;
        }

        List<Integer> row = new ArrayList<>();
        row.add(1);
        list.add(row);

        for (int i = 2; i <= numRows; i++) {
            List<Integer> lastRow = list.get(i-2);
            row = new ArrayList<>();

            for (int j = 0; j < i; j++) {
                int num = (j > 0 ? lastRow.get(j-1) : 0) +
                        (j < i-1 ? lastRow.get(j) : 0);
                row.add(num);
            }

            list.add(row);
        }

        return list;
    }
}
