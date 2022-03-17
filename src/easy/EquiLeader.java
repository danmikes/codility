package easy;

import test.Test;

import java.util.Arrays;

public class EquiLeader {

  public static void main(String[] args) {
    int[] array = new int[] {4,3,4,4,4,2};

    Test.test(equiLeader(array), 2);
  }

  public static int equiLeader(int[] array) {
    int equiLeader = 0;
    for (int i = 1; i < array.length; i++) {
      int[] alpha = Arrays.copyOfRange(array, 0,i);
      int[] beta = Arrays.copyOfRange(array, i,array.length);
      if (dominator(alpha) == dominator(beta)) {
        equiLeader++;
      }
    }

    return equiLeader;
  }

  public static int dominator(int[] array) {
    int dominator;
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
