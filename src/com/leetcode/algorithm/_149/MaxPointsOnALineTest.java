package com.leetcode.algorithm._149;

import com.leetcode.data.Point;
import org.junit.Test;

public class MaxPointsOnALineTest {
    @Test
    public void maxPoints() throws Exception {
        Point[] input = {
                new Point(0, 0),
                new Point(94911151,94911150),
                new Point(94911152,94911151)
        };

        System.out.println(new MaxPointsOnALine().maxPoints(input));
    }

}