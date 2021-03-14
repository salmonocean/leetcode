package algorithm.twoSum;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.Assert.assertArrayEquals;

public class TwoSumTest {

  @ParameterizedTest
  @MethodSource("testCaseProvider")
  public void testTwoSum(int[] input, int target, int[] result) {
    assertArrayEquals(result, new TwoSum().twoSum(input, target));
  }

  static Stream<Arguments> testCaseProvider() {
    return Stream.of(
        Arguments.of(new int[]{2, 7, 11, 15}, 9, new int[]{0, 1}),
        Arguments.of(new int[]{3, 2, 4}, 6, new int[]{1, 2}),
        Arguments.of(new int[]{3, 3}, 6, new int[]{0, 1})
    );
  }
}