package easy;

import test.Test;

import java.util.Arrays;

/**
 * Check if array is permutation: sequence is complete from 1 to N
 */
public class PermCheck {

  public static void main(String[] args) {
    int[] array;
    int result;
    int expect;

    array = new int[] {1};
    expect = 1;
    result = permCheck(array);
    Test.test(result, expect);

    array = new int[] {2};
    expect = 0;
    result = permCheck(array);
    Test.test(result, expect);

    array = new int[] {1,3};
    expect = 0;
    result = permCheck(array);
    Test.test(result, expect);

    array = new int[] {2,3,4};
    expect = 0;
    result = permCheck(array);
    Test.test(result, expect);

    array = new int[] {4,1,3};
    expect = 0;
    result = permCheck(array);
    Test.test(result, expect);

    array = new int[] {4,1,3,2};
    expect = 1;
    result = permCheck(array);
    Test.test(result, expect);
  }

  public static int permCheck(int[] array) {
    // sort array
    Arrays.sort(array);
    // check if array starts with 1 and is complete
    if (array[0] != 1 || array[array.length - 1] != array.length) {
      // array is permutation
      return 0;
    } else {
      // array is not permutation
      return 1;
    }
  }
}
