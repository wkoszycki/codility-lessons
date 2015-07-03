package com.codility.lessons.lesson4;

import java.util.Arrays;

/**
 * level: easy
 */
public class MaxProductOfThree {

  public int solution(int[] A) {
    int length = A.length;
    Arrays.sort(A);
    //get max product of three from the end
    int max = A[length - 3] * A[length - 2] * A[length - 1];
    for (int i = length - 4; i >= 2; i--) {
      int tempMax = A[i] * A[i - 1] * A[i - 2];
      if (tempMax > max) {
        max = tempMax;
      }
    }
    return max;
  }
}
