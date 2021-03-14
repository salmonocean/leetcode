package algorithm.validParentheses;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;

public class ValidParenthesesTest {

  @ParameterizedTest
  @MethodSource("testCaseProvider")
  public void testValidParentheses(final String input, final boolean result) {
    assertEquals(result, new ValidParentheses().isValid(input));
  }

  static Stream<Arguments> testCaseProvider() {
    return Stream.of(
        Arguments.of("()", true),
        Arguments.of("()[]{}", true),
        Arguments.of("{[]}", true),
        Arguments.of("(", false),
        Arguments.of(")", false),
        Arguments.of("(]", false),
        Arguments.of("([)]", false)
    );
  }
}