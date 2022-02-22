package medium;

import test.Test;

/**
 * count integers in range [A,B] divisible by K
 */
public class CountDiv {

  public static void main(String[] args) {
    int A;
    int B;
    int K;
    int expect;
    int result;

    A = 0;
    B = 1;
    K = 2;
    expect = 1;
    result = countDiv(A,B,K);
    Test.test(result,expect);

    A = 0;
    B = 10;
    K = 2;
    expect = 6;
    result = countDiv(A,B,K);
    Test.test(result,expect);

    A = 1;
    B = 12;
    K = 3;
    expect = 4;
    result = countDiv(A,B,K);
    Test.test(result,expect);

    A = 1;
    B = 2_000_000_000;
    K = 2;
    expect = 1_000_000_000;
    result = countDiv(A,B,K);
    Test.test(result,expect);

    A = 1;
    B = 2_000_000_000;
    K = 1_234_567;
    expect = 1_620;
    result = countDiv(A,B,K);
    Test.test(result,expect);
  }

  public static int countDiv(int A, int B, int K) {
    int diffs = B/K - A/K;

    if (A % K == 0) {
      diffs += 1;
    }

    return diffs;
  }
}
