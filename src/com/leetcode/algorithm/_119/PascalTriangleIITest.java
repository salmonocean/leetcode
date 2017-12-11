package com.leetcode.algorithm._119;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class PascalTriangleIITest {
    int[] inputs = {3, 4};

    ArrayList<ArrayList<Integer>> results = new ArrayList<ArrayList<Integer>>() {{
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
    }};

    @Test
    public void getRow() throws Exception {
        for (int i = 0; i < results.size(); i++) {
            List<Integer> r = new PascalTriangleII().getRow(inputs[i]);
            assertTrue(results.get(i).containsAll(r) && results.get(i).size() == r.size());
        }
    }


    @Test
    public void getRow1() throws Exception {
        for (int i = 0; i < results.size(); i++) {
            List<Integer> r = new PascalTriangleII().getRow1(inputs[i]);
            assertTrue(results.get(i).containsAll(r) && results.get(i).size() == r.size());
        }
    }

}