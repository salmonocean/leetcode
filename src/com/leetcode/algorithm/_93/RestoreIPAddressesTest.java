package com.leetcode.algorithm._93;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class RestoreIPAddressesTest {
    @Test
    public void restoreIpAddresses() throws Exception {
        String[] inputs = {
            "25525511135",
            "33"
        };

        ArrayList<ArrayList<String>> results = new ArrayList<ArrayList<String>>(){{
            new ArrayList<String>(){{
                add("255.255.11.135");
                add("255.255.11.35");
            }};

            new ArrayList<String>() {

            };
        }};

        for (int i = 0; i < results.size(); i++) {
            List<String> r = new RestoreIPAddresses().restoreIpAddresses(inputs[i]);
            assertTrue(results.get(i).containsAll(r) && results.get(i).size() == r.size());
        }
    }

}