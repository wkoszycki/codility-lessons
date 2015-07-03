package com.codility.lessons.lesson1;

/**
 * 100/100 level: Easy
 */
public class FrogJmp {

  public int solution(int X, int Y, int D) {
    return (int) Math.ceil((Y - X * 1.0) / D);
  }

}
