package easy;

import java.util.Arrays;

public class CyclicRotation {

  /**
   * Return array rotated right-ward by given value
   */
  public static void main(String[] args) {
    int[] A;
    int K;
    int[] B;
    int[] C;
    boolean test;

    A = new int[] {3,8,9,7,6};
    K = 3;
    B = cyclicRotation(A,K);
    C = new int[] {9,7,6,3,8};
    test = Arrays.equals(B,C);
    System.out.println(test);

    A = new int[] {0,0,0};
    K = 1;
    B = cyclicRotation(A,K);
    C = new int[] {0,0,0};
    test = Arrays.equals(B,C);
    System.out.println(test);

    A = new int[] {1,2,3,4};
    K = 4;
    B = cyclicRotation(A,K);
    C = new int[] {1,2,3,4};
    test = Arrays.equals(B,C);
    System.out.println(test);
  }

  public static int[] cyclicRotation(int[] A, int K) {
    int[] a = Arrays.copyOfRange(A,A.length-K,A.length);
    int al = a.length;
    int[] b = Arrays.copyOfRange(A,0,A.length-K);
    int bl = b.length;
    int cl = al + bl;
    int[] c = new int[cl];

    System.arraycopy(a,0,c,0,al);
    System.arraycopy(b,0,c,al,bl);

    return c;
  }
}
