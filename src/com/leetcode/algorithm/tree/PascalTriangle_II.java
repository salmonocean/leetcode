package com.leetcode.algorithm.tree;

import java.util.ArrayList;

/**
 * @see https://leetcode.com/problems/pascals-triangle-ii/description/
 * @see https://en.wikipedia.org/wiki/Pascal%27s_triangle
 * No.: 119
 * Tag: Math
 */
public class PascalTriangle_II {
    public static void main(String[] args) {
        System.out.println(new PascalTriangle_II().getRow1(4));
    }

    public ArrayList<Integer> getRow(int rowIndex) {
        ArrayList<Integer> list = new ArrayList<>();
        int [] row = new int[rowIndex+1];
        row[0] = 1;
        int i, j;

        for (i = 1; i <= rowIndex; i++) {
            for (j = i; j >= 0; j--) {
                row[j] = (j < i ? row[j] : 0) +
                        (j > 0 ? row[j-1] : 0);
            }
        }

        for (i = 0; i < rowIndex + 1; i++)
            list.add(row[i]);
        return list;
    }

    public ArrayList<Integer> getRow1(int rowIndex) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < rowIndex +1; i++) {
            int num = i == 0 ? 1 : (int) ((long)list.get(i-1)) * (rowIndex - i + 1) / i;
            list.add(num);
        }

        return list;
    }
}
