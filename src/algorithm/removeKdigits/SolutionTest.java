package algorithm.removeKdigits;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;

public class SolutionTest {

  @ParameterizedTest
  @MethodSource("testCaseProvider")
  public void testTwoSum(String number, int k, String result) {
    assertEquals(result, new Solution().removeKdigits(number, k));
  }

  static Stream<Arguments> testCaseProvider() {
    return Stream.of(
        Arguments.of("1432219", 3, "1219"),
        Arguments.of("10200", 1, "200"),
        Arguments.of("10", 2, "0")
    );
  }
}