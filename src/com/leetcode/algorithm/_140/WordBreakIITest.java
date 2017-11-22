package com.leetcode.algorithm._140;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertTrue;

public class WordBreakIITest {
    @Test
    public void wordBreak() throws Exception {
        List<String> dict = new ArrayList<String>() {{
            add("cat");
            add("cats");
            add("and");
            add("sand");
            add("dog");
        }};

        String[] inputs = {
                "catsanddog",
        };

        ArrayList<ArrayList<String>> results = new ArrayList<ArrayList<String>>() {{
            add(new ArrayList<String>() {{
                add("cats and dog");
                add("cat sand dog");
            }});
        }};

        for (int i = 0; i < results.size(); i++) {
            List<String> r = new WordBreakII().wordBreak(inputs[i], dict);

            assertTrue(results.get(i).containsAll(r) && results.get(i).size() == r.size());
        }
    }

}