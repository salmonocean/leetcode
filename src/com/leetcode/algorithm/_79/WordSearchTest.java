package com.leetcode.algorithm._79;

import org.junit.Test;

import static org.junit.Assert.*;

public class WordSearchTest {
    @Test
    public void exist() throws Exception {
        char[][] board = {
                {'A','B','C','E'},
                {'S','F','C','S'},
                {'A','D','E','E'}
        };

        String[] inputs = {
                "ABCCED",
                "SEE",
                "ABCB"
        };

        boolean[] results = {
                true,
                true,
                false
        };

        for (int i = 0; i < results.length; i++) {
            assertEquals(results[i], new WordSearch().exist(board, inputs[i]));
        }
    }

}