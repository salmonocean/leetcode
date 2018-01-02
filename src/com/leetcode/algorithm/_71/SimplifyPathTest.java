package com.leetcode.algorithm._71;

import org.junit.Test;

import static org.junit.Assert.*;

public class SimplifyPathTest {
    @Test
    public void simplifyPath() throws Exception {
        String[] inputs = {
                "/home/",
                "/a/./b/../../c/"
        };

        String[] results = {
                "/home",
                "/c"
        };

        for (int i = 0; i < results.length; i++) {
            assertEquals(results[i], new SimplifyPath().simplifyPath(inputs[i]));
        }
    }

}