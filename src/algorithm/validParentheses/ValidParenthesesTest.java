package algorithm.validParentheses;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.Assert.*;

import java.util.stream.Stream;

public class ValidParenthesesTest {

    @ParameterizedTest
    @MethodSource("testCaseProvider")
    public void testValidParentheses(final String input, final boolean result) {
        assertEquals(new ValidParentheses().isValid(input), result);
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