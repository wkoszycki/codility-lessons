package com.codility.lessons.lesson2;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertTrue;

/**
 * @author Wojciech Koszycki <wojciech.koszycki@gmail.com>
 */
public class MaxCountersTest {

  private MaxCounters maxCounters;

  @Before
  public void setUp() {
    maxCounters = new MaxCounters();
  }

  @Test
  public void testSimpleCase() {
    int[] input = {3, 4, 4, 6, 1, 4, 4};
    int[] expectedResult = {3, 2, 2, 4, 2};
    int n = 5;
    int[] result = maxCounters.solution(n, input);
    assertTrue(Arrays.equals(result, expectedResult));
  }

}
