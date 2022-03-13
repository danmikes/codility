package easy;

import test.Test;

import java.util.Stack;

/**
 * determine if string of parentheses (single type) is properly nested
 */
public class Nesting {

  public static void main(String[] args) {
    String string;

    string = "(()(())())";
    Test.test(nesting(string), 1);

    string = "())";
    Test.test(nesting(string), 0);
  }

  public static int nesting(String string) {
    Stack<Character> stack = new Stack<>();

    for (int i = 0; i < string.length(); i++) {
      switch(string.charAt(i)) {
        case '(':
          stack.push(string.charAt(i));
          break;
        case ')':
          if (stack.isEmpty()) return 0;
          else stack.pop();
          break;
      }
    }

    return stack.isEmpty() ? 1 : 0;
  }
}
