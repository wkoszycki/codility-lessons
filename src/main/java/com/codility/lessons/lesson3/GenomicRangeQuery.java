package com.codility.lessons.lesson3;

/**
 * level: Medium, score: 100/100, Point is that we need to know which letter occured in asked
 * sequence, we can prepare a a double table to store information about number of occurences, then
 * we can use our prefixSUm Ninja knowledge to ask about occurence of specific element
 */
public class GenomicRangeQuery {

  public int[] solution(String S, int[] P, int[] Q) {
    final int[][] prefixOccurenceSums = createPrefixSumOfOccurence(S);
    final int size = P.length;
    final int[] result = new int[size];
    for (int i = 0; i < size; i++) {
      result[i] = findMinimalImpactFactor(P[i], Q[i], prefixOccurenceSums);
    }

    return result;
  }

  private int[][] createPrefixSumOfOccurence(String s) {
    final int lenght = s.length();
    // prefix sum should always be one element larger
    final int[][] prefixOccurenceSums = new int[4][lenght + 1];
    //itterate over string
    char[] chars = s.toCharArray();
    for (int i = 0; i < chars.length; i++) {
      //set next element of all sums to last element
      prefixOccurenceSums[0][i + 1] = prefixOccurenceSums[0][i];
      prefixOccurenceSums[1][i + 1] = prefixOccurenceSums[1][i];
      prefixOccurenceSums[2][i + 1] = prefixOccurenceSums[2][i];
      prefixOccurenceSums[3][i + 1] = prefixOccurenceSums[3][i];
      //letter indexes A=0,C=1,G=2,T=3
      int letterIndex = 3;
      //get current char
      switch (chars[i]) {
        case 'A':
          letterIndex = 0;
          break;
        case 'C':
          letterIndex = 1;
          break;
        case 'G':
          letterIndex = 2;
          break;
        default:
      }
      // increase occurence of letter
      prefixOccurenceSums[letterIndex][i + 1] = prefixOccurenceSums[letterIndex][i] + 1;
    }
    return prefixOccurenceSums;
  }

  private int findMinimalImpactFactor(int left, int right, int[][] matrix) {
    //when A occurs
    if (matrix[0][right + 1] - matrix[0][left] > 0) {
      return 1;
    }
    //when C occurs
    if (matrix[1][right + 1] - matrix[1][left] > 0) {
      return 2;
    }
    //when G occurs otherwise return T
    return matrix[2][right + 1] - matrix[2][left] > 0 ? 3 : 4;
  }
}
