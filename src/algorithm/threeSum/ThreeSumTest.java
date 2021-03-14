package algorithm.threeSum;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;

public class ThreeSumTest {

  @ParameterizedTest
  @MethodSource("testCaseProvider")
  public void test3Sum(int[] input, List<List<Integer>> result) {
    assertEquals(result, new ThreeSum().threeSum(input));
  }

  static Stream<Arguments> testCaseProvider() {
    return Stream.of(
        Arguments.of(new int[]{-1, 0, 1, 2, -1, -4}, new ArrayList<List<Integer>>() {{
          add(Arrays.asList(-1, -1, 2));
          add(Arrays.asList(-1, 0, 1));
        }}),
        Arguments.of(new int[]{-1, 0, 1, 2, 1, 0}, new ArrayList<List<Integer>>() {{
          add(Arrays.asList(-1, 0, 1));
        }}),
        Arguments.of(new int[]{0, 0, 0, 0, 0}, new ArrayList<List<Integer>>() {{
          add(Arrays.asList(0, 0, 0));
        }}),
        Arguments.of(new int[]{}, new ArrayList<List<Integer>>()),
        Arguments.of(new int[]{0}, new ArrayList<List<Integer>>())
    );
  }
}