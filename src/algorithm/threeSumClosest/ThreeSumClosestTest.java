package algorithm.threeSumClosest;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;

public class ThreeSumClosestTest {

  @ParameterizedTest
  @MethodSource("testCaseProvider")
  public void test4Sum(int[] input, int target, int result) {
    assertEquals(result, new ThreeSumClosest().threeSumClosest(input, target));
  }

  static Stream<Arguments> testCaseProvider() {
    return Stream.of(
        Arguments.of(new int[]{-1, 2, 1, -4}, 1, 2)
    );
  }
}