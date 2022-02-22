package easy;

import test.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * Find element with odd frequency
 */
public class Orphan {

  public static void main(String[] args) {
    int[] array;
    int result;
    int expect;
    boolean test;

    array = new int[] {9,3,9,3,9,7,9};
    result = orphan(array);
    expect = 7;
    Test.test(result, expect);

    array = new int[] {9,7,5,3,1,3,5,7,9};
    result = orphan(array);
    expect = 1;
    Test.test(result, expect);

    array = new int[] {1,1,1,1,1,1,1,9,3,9,3,9,3,9,3};
    result = orphan(array);
    expect = 1;
    Test.test(result, expect);
  }

  public static int orphan(int[] array) {
    Integer value = 1;
    Map<Integer,Integer> map = new HashMap<>();
    for (int i : array) {
      Integer j = map.get(i);
      map.put(i, (j == null) ? 1 : j + 1);
    }
    return map
      .entrySet()
      .stream()
      .filter(entry -> value.equals(entry.getValue() % 2))
      .map(Map.Entry::getKey).findFirst().get();
  }
}
