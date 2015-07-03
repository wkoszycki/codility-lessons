package com.codility.lessons.lesson2;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author Wojciech Koszycki <wojciech.koszycki@gmail.com>
 */
public class MissingIntegerTest {

  private MissingInteger missingInteger;

  @Before
  public void setUp() {
    missingInteger = new MissingInteger();
  }

  @Test
  public void testValidPermutation() {
    int[] input = {1, 3, 6, 4, 1, 2};
    int result = missingInteger.solution(input);
    assertEquals(5, result);
  }

  @Test
  public void testValidPermutation2() {
    int[] input = {1, 3, 2, 5};
    int result = missingInteger.solution(input);
    assertEquals(4, result);
  }

  @Test
  public void testValidPermutation3() {
    int[] input = {5, 3, 2, 1, 4, 7};
    int result = missingInteger.solution(input);
    assertEquals(6, result);
  }

  @Test
  public void testValidPermutation4() {
    int[] input = {Integer.MIN_VALUE, 3, 2, 4, Integer.MAX_VALUE};
    int result = missingInteger.solution(input);
    assertEquals(1, result);
  }
}
