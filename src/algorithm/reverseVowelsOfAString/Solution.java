
package algorithm.reverseVowelsOfAString;

class Solution {
  public String reverseVowels(String s) {
    StringBuilder result = new StringBuilder();

    int end = s.length() - 1;
    for (int i = 0; i < s.length(); i++) {
      char c = s.charAt(i);
      if (!isVowels(c)) {
        result.append(c);
      } else {
        int j = findVowelsReverse(s, end);
        end = j - 1;

        result.append(s.charAt(j));
      }
    }

    return result.toString();
  }

  private int findVowelsReverse(String s, int end) {
    for (int i = end; i >= 0; i--) {
      if (isVowels(s.charAt(i))) {
        return i;
      }
    }

    return -1;
  }

  private boolean isVowels(char c) {
    return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
  }
}