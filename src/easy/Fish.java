package easy;

import test.Test;

import java.util.Stack;

/**
 * N voracious move along river
 * calculate how many fish survive journey
 */
public class Fish {

  public static void main(String[] args) {
    int[] size;//size [1..5]
    int[] flow;//direction [0,1] 0:upstream 1:downstream
    int result;
    int expect;

    size = new int[] {1,2};
    flow = new int[] {0,1};
    result = fish(size, flow);
    expect = 2;
    Test.test(result, expect);

    size = new int[] {1,2};
    flow = new int[] {1,0};
    result = fish(size, flow);
    expect = 1;
    Test.test(result, expect);

    size = new int[] {2,1};
    flow = new int[] {0,1};
    result = fish(size, flow);
    expect = 2;
    Test.test(result, expect);

    size = new int[] {2,1};
    flow = new int[] {1,0};
    result = fish(size, flow);
    expect = 1;
    Test.test(result, expect);

    size = new int[] {1,2,3,4,5};
    flow = new int[] {0,0,0,0,1};
    result = fish(size, flow);
    expect = 5;
    Test.test(result, expect);

    size = new int[] {1,2,3,4,5};
    flow = new int[] {1,0,0,0,0};
    result = fish(size, flow);
    expect = 4;
    Test.test(result, expect);

    size = new int[] {5,4,3,2,1};
    flow = new int[] {1,0,0,0,0};
    result = fish(size, flow);
    expect = 1;
    Test.test(result, expect);

    size = new int[] {4,3,2,1,5};
    flow = new int[] {0,1,0,0,0};
    result = fish(size, flow);
    expect = 2;
    Test.test(result, expect);
  }

  public static int fish(int[] size, int[] flow) {
    Stack<Integer> stack = new Stack<>();
    int number = 0;

    for (int i = 0; i < size.length; i++) {
      if (flow[i] == 0) {
        while (!stack.isEmpty() && size[i] > stack.peek()) {
          stack.pop();
        }

        if (stack.isEmpty()) {
          number++;
        }
      } else {
        stack.push(size[i]);
      }
    }
    return number + stack.size();
  }
}
