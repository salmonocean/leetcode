package algorithm.integerBreak;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;

public class SolutionTest {

  @ParameterizedTest
  @MethodSource("testCaseProvider")
  public void testTwoSum(int input, int result) {
    assertEquals(result, new Solution().integerBreak(input));
  }

  static Stream<Arguments> testCaseProvider() {
    return Stream.of(
        Arguments.of(2, 1),
        Arguments.of(7, 12),
        Arguments.of(10, 36)
    );
  }
}