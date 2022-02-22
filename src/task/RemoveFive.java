package task;

import test.Test;

/**
 * Remove one of fives from int N to yield greatest result
 */
public class RemoveFive {

  public static void main(String[] args) {
    int number;
    int result;
    int expect;

    number = 0;
    expect = 0;
    result = removeFive(number);
    Test.test(expect, result);

    number = -0;
    expect = 0;
    result = removeFive(number);
    Test.test(expect, result);

    number = 5;
    expect = 0;
    result = removeFive(number);
    Test.test(expect, result);

    number = -5;
    expect = 0;
    result = removeFive(number);
    Test.test(expect, result);

    number = 55;
    expect = 5;
    result = removeFive(number);
    Test.test(expect, result);

    number = -55;
    expect = -5;
    result = removeFive(number);
    Test.test(expect, result);

    number = 545;
    expect = 54;
    result = removeFive(number);
    Test.test(expect, result);

    number = 565;
    expect = 65;
    result = removeFive(number);
    Test.test(expect, result);

    number = -545;
    expect = -45;
    result = removeFive(number);
    Test.test(expect, result);

    number = -565;
    expect = -56;
    result = removeFive(number);
    Test.test(expect, result);

    number = 1515;
    expect = 151;
    result = removeFive(number);
    Test.test(expect, result);

    number = -1515;
    expect = -115;
    result = removeFive(number);
    Test.test(expect, result);

    number = 1565;
    expect = 165;
    result = removeFive(number);
    Test.test(expect, result);

    number = -1565;
    expect = -156;
    result = removeFive(number);
    Test.test(expect, result);

    number = -5000;
    expect = 0;
    result = removeFive(number);
    Test.test(expect, result);

    number = 5000;
    expect = 0;
    result = removeFive(number);
    Test.test(expect, result);

    number = -151500000;
    expect = -11500000;
    result = removeFive(number);
    Test.test(expect, result);

    number = 151500000;
    expect = 15100000;
    result = removeFive(number);
    Test.test(expect, result);

    number = -515151515;
    expect = -15151515;
    result = removeFive(number);
    Test.test(expect, result);

    number = 515151515;
    expect = 51515151;
    result = removeFive(number);
    Test.test(expect, result);
  }

  public static int removeFive(int integer) {
    int result = 0;

    if (integer < 0) {
      result = 1000000000;
      String string = Integer.toString(integer * -1);

      for (int i = 0; i < string.length(); i++) {
        if (string.charAt(i) == '5') {
          String one = string.substring(0,i);
          String two = "";
          if (string.length() > (i + 1)) {
            two = string.substring(i + 1);
          } else {
            if (string.length() == 1) {
              two = "0";
            } else {
              two = "";
            }
          }
          String newString = one + two;
          if (Integer.parseInt(newString) < result) {
            result = Integer.parseInt(newString);
          }
        }
      }
      result = result * -1;
    }

    else if (integer > 0) {
      result = 0;
      String string = Integer.toString(integer);

      for (int i = 0; i < string.length(); i++) {
        if (string.charAt(i) == '5') {
          String one = string.substring(0,i);
          String two = "";
          if (string.length() > (i + 1)) {
            two = string.substring(i + 1);
          } else {
            if (string.length() == 1) {
              two = "0";
            } else {
              two = "";
            }
          }
          String newString = one + two;
          if (Integer.parseInt(newString) > result) {
            result = Integer.parseInt(newString);
          }
        }
      }
    }

    return result;
  }
}
