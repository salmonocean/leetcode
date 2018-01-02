package com.leetcode.algorithm._79;

/**
 * @see https://leetcode.com/problems/word-search/description/
 * Tag: DFS
 */
public class WordSearch {

    public boolean exist(char[][] board, String word) {
        int i, j;

        for (i = 0; i < board.length; i++) {
            for (j = 0; j < board[i].length; j++) {
                if (dfs(board, word, 0, i, j)) {
                    return true;
                }
            }
        }

        return false;
    }

    private boolean dfs(char[][] board, String word, int wi, int i, int j) {
        if (wi == word.length()) {
            return true;
        }

        char c = word.charAt(wi);

        if (i < 0 || i >= board.length ||
                j < 0 || j >= board[0].length ||
                board[i][j] != c) {
            return false;
        }

        board[i][j] = '#';

        boolean existed = dfs(board, word, wi + 1, i + 1, j) ||
                dfs(board, word, wi + 1, i - 1, j) ||
                dfs(board, word, wi + 1, i, j + 1) ||
                dfs(board, word, wi + 1, i, j - 1);

        board[i][j] = c;

        return existed;
    }
}
