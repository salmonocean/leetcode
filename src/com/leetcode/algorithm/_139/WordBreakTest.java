package com.leetcode.algorithm._139;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class WordBreakTest {
    @Test
    public void wordBreak() throws Exception {
        List<String> dict = new ArrayList<String>() {{
            add("leet");
            add("code");
        }};

        String[] inputs = {
                "leetcode",
                "leetcodee",
                "codeleetcode"
        };

        boolean[] results = {true, false, true};

        for (int i = 0; i < results.length; i++) {
            assertEquals(results[i], new WordBreak().wordBreak(inputs[i], dict));
        }
    }

}