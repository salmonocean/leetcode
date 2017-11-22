package com.leetcode.algorithm._131;

import org.junit.Test;

import java.util.List;

/**
 * @see url
 * Tag:
 */
public class PalindromePartitioningTest {
    @Test
    public void partition() throws Exception {
        String[] inputs = {
                "aab",
                "a"
        };

        for (int i = 0; i < inputs.length; i++) {
            List<List<String>> result = new PalindromePartitioning().partition(inputs[i]);

            for (List<String> sl : result) {
                System.out.println(sl);
            }
        }
    }

}