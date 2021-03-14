package algorithm.threeSumClosest;

import java.util.Arrays;

public class ThreeSumClosest {
  public int threeSumClosest(int[] nums, int target) {
    Arrays.sort(nums);

    int best = 100000;

    for (int i = 0; i < nums.length - 2; i++) {
      int left = i + 1;
      int right = nums.length - 1;
      int value = target - nums[i];

      while (left < right) {
        int sum = nums[left] + nums[right];

        if (sum < value) {
          if (Math.abs(best - target) > Math.abs(sum + nums[i] - target)) {
            best = sum + nums[i];
          }
          left++;
        } else if (sum > value) {
          if (Math.abs(best - target) > Math.abs(sum + nums[i] - target)) {
            best = sum + nums[i];
          }
          right--;
        } else {
          return target;
        }
      }
    }

    return best;
  }
}