package com.leetcode.algorithm._91;

/**
 * @see https://leetcode.com/problems/decode-ways/description/
 * Tag: DP
 */
public class DecodeWays {
    public int numDecodings(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }

        int[] nums = new int[s.length() + 1];

        nums[0] = 1;
        nums[1] = s.charAt(0) != '0' ? 1 : 0;

        for (int i = 2; i < nums.length; i++) {
            if (s.charAt(i-1) != '0') {
                nums[i] += nums[i-1];
            }

            if (s.charAt(i-2) == '1' || (s.charAt(i-2) == '2' && s.charAt(i-1) < '7')) {
                nums[i] += nums[i-2];
            }
        }

        return nums[nums.length - 1];
    }
}
