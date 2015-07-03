package com.codility.lessons.lesson2;

/**
 * 100/100 level: Easy Problem: We need to know when all elements from sequence 1..X already
 * appeared, so we need to iterate over input array when there is new element we have to keep it
 * somewhere, boolean array seems to be the faster way since I don't need to fill it just happen
 * automatically while creating new array.
 */
public class FrogRiverOne {

  public int solution(int X, int[] A) {
    int counter = 0;
    // Create complete array e.g 1..X our max element is X so size =X
    boolean[] completeArray = createElementsArray(X);
    for (int i = 0; i < A.length; i++) {
      int element = A[i] - 1;
      boolean alreadyPopped = completeArray[element];
      // when element is not already taken
      if (!alreadyPopped) {
        //set it to true, so we know next time
        completeArray[element] = true;
        // increase counter so we know when all leafs has fallen
        counter++;
        // when all leafs has fallen, return current time
        if (counter == X) {
          return i;
        }
      }

    }
    return -1;
  }

  public boolean[] createElementsArray(int size) {
    return new boolean[size];
  }
}
