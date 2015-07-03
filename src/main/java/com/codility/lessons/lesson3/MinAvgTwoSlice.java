package com.codility.lessons.lesson3;

/**
 * level: Medium 100/100
 *
 * There is one dependency that must be found here: There must be a slice , with length of two or
 * three, having the minimal average value among all the slices. all the longer slices with min avg
 * are built up with these 2-element and/or 3-element small slices so: Average_of_longer_than_3 >
 * avg_two_element_slice OR avg_three_element_slice e.g 4,2,3,1: [4+2+3+1=10/4=2.5]>[3+1=4/2=2] ||
 * [2+3+1=6/3=2]
 */
public class MinAvgTwoSlice {

  public int solution(int[] A) {
    int arraySize = A.length;
    double minimalAverage = Integer.MAX_VALUE;
    int minIndex = 0;
    for (int i = 0; i < arraySize; i++) {
      // has next element ?
      if (i + 1 < arraySize) {
        double averageOfTwo = (A[i] + A[i + 1]) / (double) 2;
        if (averageOfTwo < minimalAverage) {
          minimalAverage = averageOfTwo;
          minIndex = i;
        }
        // has two next elements ?
        if (i + 2 < arraySize) {
          double averageOfThree = (A[i] + A[i + 1] + A[i + 2]) / 3d;
          if (averageOfThree < minimalAverage) {
            minimalAverage = averageOfThree;
            minIndex = i;
          }
        }
      }
    }
    return minIndex;
  }

}
