package easy;

import test.Test;

import java.util.Stack;

/**
 * cover 'Manhattan' skyline using minimum number of rectangles
 */
public class StoneWall {

  public static void main(String[] args) {
    int[] array;

    array = new int[] {8,8,5,7,9,8,7,4,8};
    Test.test(stoneWall(array), 7);
  }

  public static int stoneWall(int[] H) {
    Stack<Integer> wall = new Stack<Integer>();
    int count = 0;
    for(int i = 0; i < H.length; i++){
      while(!wall.empty() && H[i] < wall.peek()){
        wall.pop();
      }
      if(wall.empty() || H[i] > wall.peek()){
        wall.push(H[i]);
        count++;
      }
    }
    return count;
  }
}
