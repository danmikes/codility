package easy;

import test.Test;

/**
 * count passing cars
 */
public class PassingCars {

  public static void main(String[] args) {
    int[] cars;
    int result;
    int expect;

    cars = new int[] {0};
    expect = 0;
    result = passingCars(cars);
    Test.test(result,expect);

    cars = new int[] {1};
    expect = 0;
    result = passingCars(cars);
    Test.test(result,expect);

    cars = new int[] {0,1,0,1,1};
    expect = 5;
    result = passingCars(cars);
    Test.test(result,expect);

    cars = new int[] {0,0,0,0,0,1,1,1,1,1};
    expect = 25;
    result = passingCars(cars);
    Test.test(result,expect);

    cars = new int[] {1,1,1,1,1,0,0,0,0,0};
    expect = 0;
    result = passingCars(cars);
    Test.test(result,expect);

    cars = new int[] {0,1,0,1,0,1};
    expect = 6;
    result = passingCars(cars);
    Test.test(result,expect);

    cars = new int[] {1,0,1,0,1,0};
    expect = 3;
    result = passingCars(cars);
    Test.test(result,expect);
  }

  public static int passingCars(int[] cars) {
    // cars driving East
    int right = 0;
    // cars driving West
    int pass = 0;

    // iterate over cars array
    for (int i : cars) {
      // car driving East adds to right
      if (i == 0) {
        right ++;
      // car driving West passes all previous cars driving East
      } else {
        pass += right;
      }
    }

    // count limit
    if (pass > 1_000_000_000) {
      return -1;
    } else {
      // number of cars passing
      return pass;
    }
  }
}
