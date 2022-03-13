package test;

import java.util.Arrays;

/**
 * print comparison result vs. expect
 */
public interface Test {

  // int
  static void test(int result, int expect) {
    System.out.println(result + " | " + expect + ": " + (result == expect ? "pass" : "fail"));
  }

  // int[]
  static void test(int[] result, int[] expect) {
    System.out.println(Arrays.toString(result) + " | " + Arrays.toString(expect) + ": " + (Arrays.equals(result,expect) ? "pass" : "fail"));
  }

  // String
  static void test(String result, String expect) {
    System.out.println(result + " | " + expect + ": " + (result.equals(expect) ? "pass" : "fail"));
  }
}
