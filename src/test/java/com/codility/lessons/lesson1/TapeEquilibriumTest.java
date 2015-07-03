package com.codility.lessons.lesson1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TapeEquilibriumTest {

  private TapeEquilibrium solution;

  public TapeEquilibriumTest() {
  }

  @Before
  public void setUp() {
    solution = new TapeEquilibrium();
  }

  @Test
  public void testPositive() {
    int[] input = {3, 1, 2, 4, 3};
    int result = solution.solution(input);
    assertEquals(1, result);
  }

  @Test
  public void testPositive2() {
    int[] input = {3, 1, 2, 3, 4};
    int result = solution.solution(input);
    assertEquals(1, result);
  }

  @Test
  public void testPositive3() {
    int[] input = {3, 1};
    int result = solution.solution(input);
    assertEquals(2, result);
  }

  @Test
  public void testPositive4() {
    int[] input = {0, 2000};
    int result = solution.solution(input);
    assertEquals(2000, result);
  }
}
