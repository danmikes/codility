package easy;

import test.Test;

import java.util.Arrays;

public class Dominator {

  public static void main(String[] args) {
    int[] array = new int[] {3,4,3,2,3,-1,3,3};

    Test.test(dominator(array), 3);
  }

  public static int dominator(int[] array) {
    int dominator = -1;
    Arrays.sort(array);
    int candidate = array[array.length/2];
    int count = 0;

    for (int x : array) {
      if (x == candidate) {
        count++;
        if (count > array.length/2) {
          dominator = candidate;
          return dominator;
        }
      }
    }

    return -1;
  }
}
