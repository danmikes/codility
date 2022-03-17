package easy;

import test.Test;

public class MaxDoubleSliceSum {

  public static void main(String[] args) {
    int[] array = new int[] {3,2,6,-1,4,5,-1,2};

    Test.test(maxDoubleSliceSum(array), 17);
  }

  public static int maxDoubleSliceSum(int[] array) {
    int[] maxLeft = new int[array.length];
    int[] maxRight = new int[array.length];

    for (int i = 1; i < array.length; i++) {
      maxLeft[i] = Math.max(0, maxLeft[i-1]+array[i]);
    }

    for (int i = array.length-2; i >= 0; i--) {
      maxRight[i] = Math.max(0, maxRight[i+1]+array[i]);
    }

    int maxDoubleSlice = 0;
    for (int i = 1; i < array.length-1; i++) {
      if (maxLeft[i-1] + maxRight[i+1] > maxDoubleSlice) {
        maxDoubleSlice = maxLeft[i-1] + maxRight[i+1];
      }
    }

    return maxDoubleSlice;
  }
}
