package medium;

import test.Test;

import java.util.Arrays;

/**
 * return smallest positive integer missing in array
 */
public class MissingInteger {

  public static void main(String[] args) {
    int[] input;
    int result;
    int expect;

    input = new int[] {-1,-3};
    expect = 1;
    result = missingInteger(input);
    Test.test(result, expect);

    input = new int[] {0};
    expect = 1;
    result = missingInteger(input);
    Test.test(result, expect);

    input = new int[] {1,1,2};
    expect = 3;
    result = missingInteger(input);
    Test.test(result, expect);

    input = new int[] {1,1,3};
    expect = 2;
    result = missingInteger(input);
    Test.test(result, expect);

    input = new int[] {6,5,4,3,2,1};
    expect = 7;
    result = missingInteger(input);
    Test.test(result, expect);

    input = new int[] {6,5,4,3,2};
    expect = 1;
    result = missingInteger(input);
    Test.test(result, expect);

    input = new int[] {6,5,4,3,1};
    expect = 2;
    result = missingInteger(input);
    Test.test(result, expect);

    input = new int[] {6,4,3,2,1};
    expect = 5;
    result = missingInteger(input);
    Test.test(result, expect);

    input = new int[] {1,3,6,4,1,2};
    expect = 5;
    result = missingInteger(input);
    Test.test(result, expect);

    input = new int[] {-1000000,-999999};
    expect = 1;
    result = missingInteger(input);
    Test.test(result, expect);

    input = new int[] {999999,1000000};
    expect = 1;
    result = missingInteger(input);
    Test.test(result, expect);
  }

  public static int missingInteger(int[] input) {
    Arrays.sort(input);

    // all numbers < 0 || all numbers > 1
    if (input[input.length -1] < 0 || input[0] > 1) {
      return 1;
    // numbers [1,..] incomplete
    } else {
      // find first missing integer
      for (int i = 1; i < input.length; i++) {
        if ((input[i] - input[i-1]) > 1) {
          return input[i] - 1;
        }
      }
      // numbers [1,..] complete
      return input[input.length - 1] + 1;
    }
  }
}
