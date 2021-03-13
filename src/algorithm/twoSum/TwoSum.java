package algorithm.twoSum;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
  public int[] twoSum(int[] nums, int target) {
    Map<Integer, Integer> map = new HashMap<>();

    for (int i = 0; i < nums.length; i++) {
      Integer value = map.get(target - nums[i]);
      if (value != null) {
        return new int[]{value, i};
      } else {
        map.put(nums[i], i);
      }
    }

    return new int[0];
  }
}
