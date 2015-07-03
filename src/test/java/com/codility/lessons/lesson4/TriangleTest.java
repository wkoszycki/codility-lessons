/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codility.lessons.lesson4;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TriangleTest {

  private Triangle triangle;
  private int[] input;

  @Before
  public void setUp() {
    triangle = new Triangle();
  }

  @Test
  public void tesPositiveCase() {
    input = new int[]{10, 2, 5, 1, 8, 20};
    assertEquals(1, triangle.solution(input));
  }

  @Test
  public void tesNegativeCase() {
    input = new int[]{10, 50, 5, 1};
    assertEquals(0, triangle.solution(input));
  }

  @Test
  public void testOverflow() {
    input = new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE};
    assertEquals(1, triangle.solution(input));
  }

}
