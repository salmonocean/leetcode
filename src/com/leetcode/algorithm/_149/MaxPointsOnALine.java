package com.leetcode.algorithm._149;

import com.leetcode.data.Point;

import java.util.HashMap;
import java.util.Map;

/**
 * @see https://leetcode.com/problems/max-points-on-a-line/description/
 * Tag: 最大公约数
 */
public class MaxPointsOnALine {
    public int maxPoints(Point[] points) {
        int max = 0;

        for (int i = 0; i < points.length; i++) {
            HashMap<String, Integer> lines = new HashMap<>();

            int equal = 0;

            for (int j = 0; j < points.length; j++) {
                if (points[j].x == points[i].x && points[j].y == points[i].y) {
                    equal++;
                } else {
                    int dy = points[j].y - points[i].y;
                    int dx = points[j].x - points[i].x;

                    int g = gcd(dy, dx);

                    String key = dy / g + "#" + dx / g;

                    if (lines.containsKey(key)) {
                        lines.put(key, lines.get(key) + 1);
                    } else {
                        lines.put(key, 1);
                    }
                }
            }

            max = Math.max(max, equal);

            for (Map.Entry<String, Integer> entry : lines.entrySet()) {
                max = Math.max(max, entry.getValue() + equal);
            }
        }

        return max;
    }

    private int gcd(int x, int y) {
        if (y == 0) {
            return x;
        }

        return gcd(y, x % y);
    }
}
