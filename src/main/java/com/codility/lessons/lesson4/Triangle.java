package com.codility.lessons.lesson4;

import java.util.Arrays;

/**
 * Level: easy
 */
class Triangle {

  public int solution(int[] A) {
    //sanity check ( can't build Triangle by two edges :-) )
    if (A.length < 3) {
      return 0;
    }
    // sort array
    Arrays.sort(A);
    //count sum of first two elements
    long sum = (long) A[0] + A[1];
    //iterate
    for (int i = 2; i < A.length; i++) {
      // when sum of previous two elements is higher than next element
      // e.g 2,3,4  2+3=5>4 so 4+3>2 and 4+2>3 we have found our Triangle
      if (sum > A[i]) {
        return 1;
      }
      //count next sum
      sum = A[i - 1] + A[i];
    }
    // Triangle not found
    return 0;
  }
}
