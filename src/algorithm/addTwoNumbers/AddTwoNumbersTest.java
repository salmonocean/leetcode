package algorithm.addTwoNumbers;

import algorithm.ListNode;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.Assert.assertArrayEquals;

public class AddTwoNumbersTest {

  @ParameterizedTest
  @MethodSource("testCaseProvider")
  public void testTwoSum(int[] input1, int[] input2, int[] result) {
    assertArrayEquals(result, new AddTwoNumbers().addTwoNumbers(ListNode.fromArray(input1), ListNode.fromArray(input2)).toArray());
  }

  static Stream<Arguments> testCaseProvider() {
    return Stream.of(
        Arguments.of(new int[]{2, 4, 3}, new int[]{5, 6, 4}, new int[]{7, 0, 8}),
        Arguments.of(new int[]{0}, new int[]{0}, new int[]{0}),
        Arguments.of(new int[]{9, 9, 9, 9, 9, 9, 9}, new int[]{9, 9, 9, 9}, new int[]{8, 9, 9, 9, 0, 0, 0, 1})
    );
  }
}