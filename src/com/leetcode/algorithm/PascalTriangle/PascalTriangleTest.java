package com.leetcode.algorithm.PascalTriangle;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class PascalTriangleTest {
    @Test
    public void generate() throws Exception {
        int[] inputs = {5};

        ArrayList<ArrayList<ArrayList<Integer>>> results = new ArrayList<ArrayList<ArrayList<Integer>>>() {{
           add(new ArrayList<ArrayList<Integer>>() {{
               add(new ArrayList<Integer>() {{
                    add(1);
               }});
               add(new ArrayList<Integer>() {{
                   add(1);
                   add(1);
               }});
               add(new ArrayList<Integer>() {{
                   add(1);
                   add(2);
                   add(1);
               }});
               add(new ArrayList<Integer>() {{
                   add(1);
                   add(3);
                   add(3);
                   add(1);
               }});
               add(new ArrayList<Integer>() {{
                   add(1);
                   add(4);
                   add(6);
                   add(4);
                   add(1);
               }});
           }});
        }};

        for (int i = 0; i < results.size(); i++) {
            List<List<Integer>> r = new PascalTriangle().generate(inputs[i]);
            assertTrue(results.get(i).containsAll(r) && results.get(i).size() == r.size());
        }
    }

}