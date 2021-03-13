package algorithm.simplifyPath;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.Assert.*;

import java.util.stream.Stream;

public class SimplifyPathTest {

  @ParameterizedTest
  @MethodSource("testCaseProvider")
  public void testSimplifyPath(String input, String result) {
    assertEquals(new SimplifyPath().simplifyPath(input), result);
  }

  static Stream<Arguments> testCaseProvider() {
    return Stream.of(
        Arguments.of("/home/", "/home"),
        Arguments.of("/../", "/"),
        Arguments.of("/home//foo/", "/home/foo"),
        Arguments.of("/a/./b/../../c/", "/c"),
        Arguments.of("/a/../../b/../c//.//", "/c"),
        Arguments.of("/a//b////c/d//././/..", "/a/b/c"),

        Arguments.of("/a./", "/a."),
        Arguments.of("/.a/", "/.a"),
        Arguments.of("/a.c/", "/a.c"),

        Arguments.of("/a../", "/a.."),
        Arguments.of("/..a/", "/..a"),
        Arguments.of("/a..c/", "/a..c"),

        Arguments.of("/a.../", "/a..."),
        Arguments.of("/...a/", "/...a"),
        Arguments.of("/a...c/", "/a...c")
    );
  }
}