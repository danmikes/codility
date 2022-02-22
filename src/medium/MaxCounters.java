package medium;

import test.Test;

import java.util.Arrays;

/**
 * Calculate values of N counters after M operations
 * 1 <= X <= N : increase counter N by 1
 * X > N : set all counters to current maximum
 */
public class MaxCounters {

  public static void main(String[] args) {
    int N;
    int[] input;
    int[] result;
    int[] expect;

    N = 1;
    input = new int[] {1,1,1};
    expect = new int[] {3};
    result = maxCounters(N, input);
    Test.test(result, expect);

    N = 2;
    input = new int[] {1,1,3,2,2};
    expect = new int[] {2,4};
    result = maxCounters(N, input);
    Test.test(result, expect);

    N = 3;
    input = new int[] {3,4,4,1,1,1};
    expect = new int[] {4,1,1};
    result = maxCounters(N, input);
    Test.test(result, expect);

    N = 5;
    input = new int[] {3,4,4,6,1,4,4};
    expect = new int[] {3,2,2,4,2};
    result = maxCounters(N, input);
    Test.test(result, expect);

    N = 5;
    input = new int[] {3,3,3,6,3,3,3};
    expect = new int[] {3,3,6,3,3};
    result = maxCounters(N, input);
    Test.test(result, expect);
  }

  public static int[] maxCounters(int N, int[] input) {
    int[] result = new int[N];

    for (int i : input) {
      if (i > N) {
        Arrays.fill(result, findMax(result));
      } else {
        result[i-1] += 1;
      }
    }

    return result;
  }

  public static int findMax(int[] array) {
    int max = array[0];

    for (int i : array) {
      if (i > max) {
        max = i;
      }
    }

    return max;
  }
}
