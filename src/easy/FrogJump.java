package easy;

/**
 * Calculate number of jumps for frog to reach/pass destination from origin
 */
public class FrogJump {

  public static void main(String[] args) {
    int X;
    int Y;
    int D;
    int result;
    int expect;
    boolean test;

    X = 10;
    Y = 85;
    D = 30;
    result = frogJump(X,Y,D);
    expect = 3;
    System.out.println(result == expect);

    X = 0;
    Y = 1000000000;
    D = 30;
    result = frogJump(X,Y,D);
    expect = 33333334;
    System.out.println(result == expect);

    X = 1000;
    Y = 1000000;
    D = 999;
    result = frogJump(X,Y,D);
    expect = 1000;
    System.out.println(result == expect);
  }

  public static int frogJump (int X, int Y, int D) {
    int steps = (Y - X) / D;
    int rest = (Y - X) % D;
    if (rest == 0) {
      return steps;
    } else {
      return steps + 1;
    }
  }
}
