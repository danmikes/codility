package medium;

import test.Test;

/**
 * count disc intersections
 */
public class NumberOfDiscIntersections {

  public static void main(String[] args) {
    int[] array = new int[] {1,5,2,1,5,0};
    int result = numberOfDiscIntersections(array);
    int expect = 11;
    Test.test(result, expect);
  }

  public static int numberOfDiscIntersections(int[] array) {
    int intersections = 0;

    for (int i = 0; i < array.length; i++) {
      for (int j = i + 1; j < array.length; j++) {
        if (intersect(array, i, j)) {
          intersections++;
          if (intersections > 10_000_000) {
            return -1;
          }
        }
      }
    }

    return intersections;
  }

  public static boolean intersect(int[] array, int i, int j) {
    return j - array[j] <= i + array[i];
  }
}
