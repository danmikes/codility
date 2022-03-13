package easy;

import test.Test;

import java.util.Stack;

/**
 * determine if string of parentheses is properly nested
 */
public class Brackets {

  public static void main(String[] args) {
    String string;
    int result;
    int expect;

    string = "";
    result = brackets(string);
    expect = 0;
    Test.test(result, expect);

    string = "0";
    result = brackets(string);
    expect = 0;
    Test.test(result, expect);

    string = "x";
    result = brackets(string);
    expect = 0;
    Test.test(result, expect);

    string = "{";
    result = brackets(string);
    expect = 0;
    Test.test(result, expect);

    string = "}";
    result = brackets(string);
    expect = 0;
    Test.test(result, expect);

    string = "{}";
    result = brackets(string);
    expect = 1;
    Test.test(result, expect);

    string = "{[()()]}";
    result = brackets(string);
    expect = 1;
    Test.test(result, expect);

    string = "([)()]";
    result = brackets(string);
    expect = 0;
    Test.test(result, expect);
  }

  public static int brackets(String string) {
    if (string.length() % 2 == 1 ||
      string.length() == 0) return 0;

    Stack<Character> charStack = new Stack<>();

    for (int i = 0; i < string.length(); i++) {
      char currentChar = string.charAt(i);
      if (isLeftBracket(currentChar)) {
        charStack.push(currentChar);
      } else {
        if (charStack.size() == 0) return 0;
        char poppedChar = charStack.pop();
        if (isValidPair(poppedChar, currentChar)) {
          continue;
        } else {
          return 0;
        }
      }
    }
    if (charStack.isEmpty()) return 1;

    return 0;
  }

  private static boolean isLeftBracket(char c) {
    return c == '(' || c == '[' || c == '{';
  }

  private static boolean isValidPair(char left, char right) {
    return left == '(' && right == ')' ||
      left == '[' && right == ']' ||
      left == '{' && right == '}';
  }
}
