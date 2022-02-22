package easy;

import test.Test;

import java.util.HashSet;
import java.util.Set;

/**
 * Give earliest time when frog can cross river over fallen leaves
 */
public class FrogRiverOne {

  public static void main(String[] args) {
    int[] leaves;
    int width;
    int result;
    int expect;

    leaves = new int[] {1};
    width = 2;
    expect = -1;
    result = frogRiverOne(width, leaves);
    Test.test(result, expect);

    leaves = new int[] {1};
    width = 1;
    expect = 0;
    result = frogRiverOne(width, leaves);
    Test.test(result, expect);

    leaves = new int[] {1,3,1,2};
    width = 3;
    expect = 3;
    result = frogRiverOne(width, leaves);
    Test.test(result, expect);

    leaves = new int[] {1,3,1,4,2,3,5,4};
    width = 5;
    expect = 6;
    result = frogRiverOne(width, leaves);
    Test.test(result, expect);

    leaves = new int[] {1,3,1,4,2,3,1,1,1,1,1,1,1,1,1,5,4};
    width = 5;
    expect = 15;
    result = frogRiverOne(width, leaves);
    Test.test(result, expect);

    leaves = new int[] {1,2,3,4,5};
    width = 5;
    expect = 4;
    result = frogRiverOne(width, leaves);
    Test.test(result, expect);

    leaves = new int[] {1,3,1,4,2,3,5,4};
    width = 5;
    expect = 6;
    result = frogRiverOne(width, leaves);
    Test.test(result, expect);
  }

  public static int frogRiverOne(int width, int[] leaves) {
    // initialise Set
    Set<Integer> path = new HashSet<>();
    // iterate over leaves array
    for (int i = 0; i < leaves.length; i++) {
      // add new leaf position to set
      path.add(leaves[i]);
      // if path complete : Set has all positions from 1..width
      if (path.size() == width) {
        // return time
        return i;
      }
    }

    // if path incomplete
    return -1;
  }
}
