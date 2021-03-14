package algorithm.threeSum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ThreeSum {
  public List<List<Integer>> threeSum(int[] nums) {
    if (nums == null || nums.length < 3) {
      return Collections.emptyList();
    }

    Arrays.sort(nums);
    List<List<Integer>> result = new ArrayList<>();

    for (int i = 0; i < nums.length - 2 && nums[i] <= 0; i++) {
      // make unique
      if (i > 0 && nums[i] == nums[i - 1]) {
        continue;
      }

      int target = -nums[i];

      // find two sum in sorted array
      int left = i + 1;
      int right = nums.length - 1;

      while (left < right) {
        int sum = nums[left] + nums[right];
        if (sum > target) {
          right--;
        } else if (sum < target) {
          left++;
        } else {
          result.add(Arrays.asList(nums[i], nums[left], nums[right]));

          // make unique
          int leftValue = nums[left];
          while (left < nums.length && nums[left] == leftValue) {
            left++;
          }
          int rightValue = nums[right];
          while (right > i && nums[right] == rightValue) {
            right--;
          }
        }
      }
    }

    return result;
  }
}