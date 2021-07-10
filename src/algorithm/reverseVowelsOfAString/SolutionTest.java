package algorithm.reverseVowelsOfAString;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;

public class SolutionTest {

  @ParameterizedTest
  @MethodSource("testCaseProvider")
  public void testTwoSum(String input, String result) {
    assertEquals(result, new Solution().reverseVowels(input));
  }

  static Stream<Arguments> testCaseProvider() {
    return Stream.of(
        Arguments.of("hello", "holle"),
        Arguments.of("leetcode", "leotcede"),
        Arguments.of("aA", "Aa")
    );
  }
}