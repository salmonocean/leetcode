package algorithm.simplifyPath;

import java.util.Stack;

public class SimplifyPath {
  enum State {
    STATE_UNKNOWN, STATE_DOT, STATE_DOT_TWO, STATE_SLASH, STATE_NAME
  }

  public String simplifyPath(String path) {
    Stack<String> stack = new Stack<>();

    String name = "";
    State state = State.STATE_UNKNOWN;

    for (int i = 0; i <= path.length(); i++) {
      char c;
      if (i < path.length()) {
        c = path.charAt(i);
      } else {
        c = '/';
      }

      switch (c) {
        case '/':
          switch (state) {
            case STATE_DOT_TWO:
              if (!stack.empty()) {
                stack.pop();
              }
              break;
            case STATE_NAME:
              stack.push(name);
              break;
            default:
              break;
          }

          state = State.STATE_SLASH;
          name = "";

          break;
        case '.':
          switch (state) {
            case STATE_DOT:
              state = State.STATE_DOT_TWO;
              name += c;
              break;
            case STATE_DOT_TWO:
              state = State.STATE_NAME;
              name += c;
              break;
            case STATE_SLASH:
              state = State.STATE_DOT;
              name = ".";
              break;
            case STATE_NAME:
              name += c;
              break;
            default:
              break;
          }
          break;
        default:
          state = State.STATE_NAME;
          name += c;
          break;
      }
    }

    // build result
    if (stack.isEmpty()) {
      return "/";
    } else {
      StringBuilder sb = new StringBuilder();

      for (String str : stack) {
        sb.append("/");
        sb.append(str);
      }

      return sb.toString();
    }
  }
}
