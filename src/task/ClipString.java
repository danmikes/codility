package task;

import test.Test;

/**
 * Give substring <= length ending on whole word
 */
public class ClipString {

  public static void main(String[] args) {
    String string = "";
    int length = 0;
    String result = "";
    String expect = "";

    string = "";
    length = 0;
    expect = "";
    result = clipString(string, length);
    Test.test(result, expect);

    string = "Hello";
    length = 0;
    expect = "";
    result = clipString(string, length);
    Test.test(result, expect);

    string = "Hello";
    length = 10;
    expect = "Hello";
    result = clipString(string, length);
    Test.test(result, expect);

    string = "Hello how are you";
    length = 10;
    expect = "Hello how";
    result = clipString(string, length);
    Test.test(result, expect);

    string = "The brown fox jumps over the lazy frog";
    length = 21;
    expect = "The brown fox jumps";
    result = clipString(string, length);
    Test.test(result, expect);
  }

  public static String clipString(String string, int length) {
    String result = "";

    String[] array = string.split(" ");

    for (String word : array) {
      if ((result.length() + word.length()) < length) {
        result = result + " " + word;
      }
    }

    return result.trim();
  }
}
