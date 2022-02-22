package easy;

import test.Test;

/**
 * maximise A[P] * A[Q] * A[R] for any triplet (P,Q,R) | 0 <= P < Q < R < N | N = A.length
 */
public class MaxProductOfThree {

  public static void main(String[] args) {
    int[] array = new int[] {-3,1,2,-2,5,6};
    int result = maxProductOfThree(array);
    int expect = 60;
    Test.test(result, expect);
  }

  public static int maxProductOfThree(int[] array) {
    int N = array.length;
    int maxProductOfThree = productOfThree(array, 0, 1, 2);

    for (int P = 0; P < N-2; P++) {
      for (int Q = 0; Q < N-1; Q++) {
        for (int R = 0; R < N; R++) {
          int productOfThreeProduct = productOfThree(array, P, Q, R);
          if (productOfThreeProduct > maxProductOfThree) {
            maxProductOfThree = productOfThreeProduct;
          }
        }
      }
    }

    return maxProductOfThree;
  }

  public static int productOfThree(int[] array, int P, int Q, int R) {
    return array[P] * array[Q] * array[R];
  }
}
