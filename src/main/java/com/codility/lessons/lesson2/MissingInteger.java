package com.codility.lessons.lesson2;

import java.util.Arrays;

/**
 * 100/100 level: Medium
 */
class MissingInteger {

  public int solution(int[] A) {
    int minimalPositiveInteger = 1;
    Arrays.sort(A);
    for (int currentElement : A) {
      //if positive
      if (currentElement > 0) {
        if (minimalPositiveInteger == currentElement) {
          minimalPositiveInteger++;
        }
      }
    }
    return minimalPositiveInteger;
  }
}
