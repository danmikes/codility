package easy;

import test.Test;

import java.util.HashSet;
import java.util.Set;

/**
 * compute number distinct values in array
 */
public class Distinct {

  public static void main(String[] args) {
    int[] array = new int[] {2,1,1,2,3,1};
    int result = distinct(array);
    int expect = 3;
    Test.test(result, expect);
  }

  public static int distinct(int[] array) {
    Set<Integer> set = new HashSet<>();
    for (int i : array) {
      set.add(i);
    }

    return set.size();
  }
}
