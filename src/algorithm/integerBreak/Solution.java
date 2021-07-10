package algorithm.integerBreak;

class Solution {
  public int integerBreak(int n) {
    if (n == 2) {
      return 1;
    }
    int[] dp = new int[n + 1];
    dp[1] = 1;
    dp[2] = 1;

    for (int i = 3; i <= n; i++) {
      int max = 1;

      for (int j = 1; j < i - 1; j++) {
        int r = j * Math.max(dp[i - j], i - j);
        if (r > max) {
          max = r;
        }
      }

      dp[i] = max;
    }

    return dp[n];
  }
}