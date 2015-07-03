package com.codility.lessons.lesson3;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author Wojciech Koszycki <wojciech.koszycki@gmail.com>
 */
public class MinAvgTwoSliceTest {

  private static final double DELTA = 1e-15;
  private MinAvgTwoSlice minAvgTwoSlice;
  private int[] input;

  @Before
  public void setUp() {
    minAvgTwoSlice = new MinAvgTwoSlice();
  }

  //    @Test
  public void testOddInput() {
    input = new int[]{4, 2, 2, 5, 1, 5, 8};
    assertEquals(1, minAvgTwoSlice.solution(input));
  }

  //    @Test
  public void testSliceOnAll() {
    input = new int[]{1, 2, 2, 2, 2, 2, 1};
    assertEquals(0, minAvgTwoSlice.solution(input));
  }

  //    @Test
  public void testEvenInputSequence() {
    input = new int[]{4, 2, 1, 3};
    assertEquals(1, minAvgTwoSlice.solution(input));
  }

  @Test
  public void testBestSliceThreeNumbers() {
    input = new int[]{6, 7, 1, 4, -2, 4};
    assertEquals(2, minAvgTwoSlice.solution(input));
  }
//
//    @Test
//    public void testCountAvg() {
//        input = new int[]{6, 7, 1, 4, -2, 4};
//        double avg1 = minAvgTwoSlice.countAvg(minAvgTwoSlice.countPrefixSums(input), 2, 4);
//        assertEquals(1, avg1, DELTA);
//    }
}
