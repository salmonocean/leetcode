package com.leetcode.algorithm._134;

/**
 * @see https://leetcode.com/problems/gas-station/description/
 * Tag: Array
 * Tag: Basic
 */
public class GasStation {

    public int canCompleteCircuit(int[] gas, int[] cost) {
        int i, sum, start;
        sum = start = 0;

        for (i = 0; i < 2 * gas.length; i++) {
            sum += gas[i%gas.length] - cost[i%gas.length];
            if (sum < 0) {
                start = i+1;
                sum = 0;
            }
        }

        if (start >= gas.length)
            return -1;
        return start;
    }
}
