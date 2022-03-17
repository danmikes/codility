package easy;

import test.Test;

public class MaxProfit {

  public static void main(String[] args) {
    int[] array = new int[] {23171,21011,21123,21366,21013,21367};

    Test.test(maxProfit(array), 356);
  }

  private static int maxProfit(int[] array) {
    if (array.length < 2) return 0;

    int minPrice = array[0];
    int maxProfit = 0;

    for (int i = 1; i < array.length; i++) {
      if (array[i] < minPrice) {
        minPrice = array[i];
      } else {
        int curProfit = array[i] - minPrice;
        if (curProfit > maxProfit) {
          maxProfit = curProfit;
        }
      }
    }

    return maxProfit;
  }
}
