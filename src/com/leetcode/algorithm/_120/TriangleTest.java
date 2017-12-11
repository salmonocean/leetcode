package com.leetcode.algorithm._120;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class TriangleTest {
    @Test
    public void minimumTotal() throws Exception {
        List<List<List<Integer>>> inputs = new ArrayList<>();

        List<List<Integer>> data = new ArrayList<>();
        data.add(new ArrayList<Integer>() {{
            add(2);
        }});
        data.add(new ArrayList<Integer>() {{
            add(3);
            add(4);
        }});
        data.add(new ArrayList<Integer>() {{
            add(6);
            add(5);
            add(7);
        }});
        data.add(new ArrayList<Integer>() {{
            add(4);
            add(1);
            add(8);
            add(3);
        }});

        inputs.add(data);

        int[] results = {11};

        for (int i = 0; i < results.length; i++) {
            assertEquals(results[i], new Triangle().minimumTotal(inputs.get(i)));
        }
    }

}