package easy;

import test.Test;

import java.util.Arrays;

/**
 * Find missing element in discrete sequence
 */
public class MissingElement {

  public static void main(String[] args) {
    int[] array;
    int result;
    int expect;
    boolean test;

    array = new int[] {2,3,1,5};
    result = missingElement(array);
    expect = 4;
    Test.test(result, expect);

    array = new int[] {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,22};
    result = missingElement(array);
    expect = 21;
    Test.test(result, expect);
  }

  public static int missingElement(int[] array) {
    Arrays.sort(array);
    for (int i = 1; i < array.length; i++) {
      if ((array[i] - array[i-1]) > 1) {
        return array[i] - 1;
      }
    }
    return -1;
  }
}
