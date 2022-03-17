package easy;

import test.Test;

public class MaxSliceSum {

  public static void main(String[] args) {
    int[] array = new int[] {3,2,-6,4,0};

    Test.test(maxSliceSum(array), 5);
  }

  public static int maxSliceSum(int[] array) {
    int maxEndingPrevious = array[0];
    int maxEndingHere = array[0];
    int maxSoFar = array[0];

    for (int i = 1; i < array.length; i++) {
      maxEndingHere = Math.max(array[i], maxEndingPrevious + array[i]);
      maxEndingPrevious = maxEndingHere;
      maxSoFar = Math.max(maxSoFar, maxEndingHere);
    }

    return maxSoFar;
  }
}
