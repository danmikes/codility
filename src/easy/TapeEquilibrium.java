package easy;

import test.Test;

public class TapeEquilibrium {

  public static void main(String[] args) {
    int[] array;
    int result;
    int expect;
    boolean test;

    array = new int[] {3,1,2,4,3};
    result = tapeEquilibrium(array);
    expect = 1;
    Test.test(result, expect);
  }

  public static int tapeEquilibrium(int[] array) {
    Integer diff = null;
    for (int i = 1; i < array.length; i++) {
      int left = 0;
      int right = 0;
      for (int j = 0; j < i; j++) {
        left += array[j];
      }
      for (int j = i; j < array.length; j++) {
        right += array[j];
      }
      if (diff == null || Math.abs(right - left) < diff) {
        diff = Math.abs(right - left);
      }
    }
    return diff;
  }
}
