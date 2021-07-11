package algorithm.removeKdigits;

class Solution {
  public String removeKdigits(String num, int k) {
    StringBuilder output = new StringBuilder();

    int start, end;
    int minIndex = -1;

    for (int j = 1; j <= num.length() - k; j++) {
      start = minIndex + 1;
      end = k + j - 1;

      minIndex = start;
      for (int i = start + 1; i <= end; i++) {
        if (num.charAt(i) < num.charAt(minIndex)) {
          minIndex = i;
        }
      }

      char candidate = num.charAt(minIndex);
      if (!output.toString().isEmpty() || candidate != '0') {
        output.append(candidate);
      }
    }

    String s = output.toString();
    if (s.isEmpty()) {
      return "0";
    } else {
      return s;
    }
  }
}