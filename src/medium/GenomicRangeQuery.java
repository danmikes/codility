package medium;

import test.Test;

import java.util.Map;

/**
 * Find minimal nucleotide from range of sequence DNA
 */
public class GenomicRangeQuery {

  public static void main(String[] args) {
    String sequence = "CAGCCTA";
    int[] P = new int[] {2,5,0};
    int[] Q = new int[] {4,5,6};
    int[] result = genomicRangeQuery(sequence, P, Q);
    int[] expect = new int[] {2,4,1};
    Test.test(result, expect);
  }

  public static int[] genomicRangeQuery(String sequence, int[] P, int[] Q) {
    int length = P.length;
    int[] result = new int[length];

    for (int i = 0; i < length; i++) {
      result[i] = findLowestImpactFactor(sequence, P[i], Q[i]);
    }

    return result;
  }

  public static int findLowestImpactFactor(String sequence, int start, int end) {
    int lowestImpactFactor = 5;

    for (int i = start; i <= end; i++) {
      if (findImpactFactor(sequence.charAt(i)) < lowestImpactFactor) {
        lowestImpactFactor = findImpactFactor(sequence.charAt(i));
      }
    }

    return lowestImpactFactor;
  }

  public static int findImpactFactor(Character character) {
    Map<Character, Integer> map = Map.of('A',1,'C',2,'G',3,'T',4);

    return map.get(character);
  }
}
