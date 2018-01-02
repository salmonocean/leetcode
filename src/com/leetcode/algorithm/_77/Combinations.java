package com.leetcode.algorithm._77;

import java.util.ArrayList;
import java.util.List;

/**
 * @see https://leetcode.com/problems/combinations/description/
 * Tag: DFS
 */
public class Combinations {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> list = new ArrayList<>();

        dfs(result, list, n, k);

        return result;
    }

    private void dfs(List<List<Integer>> result, List<Integer> list, int n, int k) {
        if (k == 0) {
            List<Integer> copy = new ArrayList<>(list);
            result.add(copy);
            return;
        }

        for (int i = n; i >= k; i--) {
            list.add(i);
            dfs(result, list, i-1, k - 1);
            list.remove(list.size() - 1);
        }
    }

    public List<List<Integer>> combine1(int n, int k) {
        if (k > n) {
            return new ArrayList<>();
        }

        if (k == 0) {
            List<List<Integer>> result = new ArrayList<>();
            result.add(new ArrayList<>());
            return result;
        }

        List<List<Integer>> list1 = combine1(n-1, k-1);
        List<List<Integer>> list2 = combine1(n-1, k);

        for (List<Integer> comb : list1) {
            comb.add(n);
        }
        list2.addAll(list1);

        return list2;
    }
}
