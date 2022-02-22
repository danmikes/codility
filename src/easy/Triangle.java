package easy;

import test.Test;

/**
 * determine if triangle can be built from given set of edges
 */
public class Triangle {

  public static void main(String[] args) {
    int[] array;
    int result;
    int expect;

    array = new int[] {10,2,5,1,8,20};
    result = triangle(array);
    expect = 1;
    Test.test(result, expect);

    array = new int[] {10,50,5,1};
    result = triangle(array);
    expect = 0;
    Test.test(result, expect);
  }

  public static int triangle(int[] array) {
    int N = array.length;

    for (int P = 0; P < N-2; P++) {
      for (int Q = P + 1; Q < N-1; Q++) {
        for (int R = Q + 1; R < N; R++) {
          if (isTriangular(array, P, Q, R)) {
            return 1;
          }
        }
      }
    }

    return 0;
  }

  public static boolean isTriangular(int[] array, int P, int Q, int R) {
    return
      array[P] + array[Q] > array[R] &&
      array[Q] + array[R] > array[P] &&
      array[R] + array[P] > array[Q];
  }
}
