package com.codility.lessons.lesson2;

/**
 * 100/100 level: Easy
 */
class PermCheck {

  public int solution(int[] A) {
    int size = A.length;
    int counter = 0;
    boolean[] logicArray = createElementsArray(size);
    int logicArraySize = logicArray.length;
    for (int element : A) {
      if (element > logicArraySize) {
        return 0;
      }
      boolean isPopped = logicArray[element - 1];
      if (!isPopped) {
        logicArray[element - 1] = true;
        counter++;
      }
    }
    return counter != size ? 0 : 1;
  }

  boolean[] createElementsArray(int size) {
    return new boolean[size];
  }

}
