package medium;

import test.Test;

/**
 * find minimal average of any slice containing at least two elements
 */
public class MinAvgTwoSlice {

  public static void main(String[] args) {
    int[] array = new int[] {4,2,2,5,1,5,8};
    int result = minAvgTwoSlice(array);
    int expect = 1;
    Test.test(result, expect);
  }

  public static int minAvgTwoSlice(int[] A) {
    double minAvg = giveSliceAvg(A, 0, 0);
    int start = 0;

    for (int i = 0; i < A.length; i++) {
      for (int j = 0; j < A.length; j++) {
        double sliceAvg = giveSliceAvg(A, i, j);
        if (sliceAvg < minAvg) {
          minAvg = sliceAvg;
          start = i;
        }
      }
    }

    return start;
  }

  public static double giveSliceAvg(int[] A, int start, int end) {
    double sliceAvg = -1;

    for (int i = start; i <= end; i++) {
      sliceAvg += A[i];
    }

    return sliceAvg;
  }
}
