package algorithm.binaryWatch;

import java.util.ArrayList;
import java.util.List;

class Solution {

  public List<String> readBinaryWatch(int turnedOn) {
    List<String> outputs = new ArrayList<>();
    int[] bits = new int[60];

    for (int i = 0; i < 60; i++) {
      bits[i] = bitOneCount(i);
    }

    for (int hour = 0; hour < 12; hour++) {
      for (int minute = 0; minute < 60; minute++) {
        if (bits[hour] + bits[minute] == turnedOn) {
          String time = hour + ":" + (minute < 10 ? "0" : "") + minute;
          outputs.add(time);
        }
      }
    }

    return outputs;
  }

  private int bitOneCount(int number) {
    int count = 0;
    int n = number;
    while (n != 0) {
      n = n & (n - 1);
      count++;
    }

    return count;
  }
}