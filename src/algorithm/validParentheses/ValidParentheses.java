package algorithm.validParentheses;

import java.util.Stack;

public class ValidParentheses {

    public boolean isValid(String s) {
        Stack stack = new Stack<Character>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            switch (c) {
                case '{':
                    stack.push('}');
                    break;
                case '[':
                    stack.push(']');
                    break;
                case '(':
                    stack.push(')');
                    break;
                case '}':
                case ']':
                case ')':
                    if (stack.isEmpty() || !stack.pop().equals(c)) {
                        return false;
                    }
                    break;
                default:
                    break;
            }
        }

        return stack.isEmpty();
    }

}
