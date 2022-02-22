package easy;

public class BinaryGap {

  /**
   * Find longest sequence of zeros in binary representation of an integer
   */
  public static void main(String[] args) {

    final String bin = "1000100001";// -> 0
    int num = Integer.parseInt(bin,2);
    int binGap = binaryGap(num);
    boolean test = binGap == 4;
    System.out.print(bin + ": " + test);
  }

  public static int binaryGap(int num) {
    // convert number to binary
    String bin = Integer.toBinaryString(num);

    if (bin.length() <= 2 || bin.charAt(0) == '0' || bin.charAt(bin.length() - 1) == '0') {
      return 0;
    }
    // find longest sequence of zeros
    int binGap = 0;
    int gap = 0;
    for (int i = 1; i < bin.length(); i++) {
      if (bin.charAt(i) == '0') {
        gap++;
      } else if (gap > binGap) {
        binGap = gap;
        gap = 0;
      }
    }
    return binGap;
  }
}
