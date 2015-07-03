/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codility.lessons.lesson4;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author Wojciech Koszycki
 */
public class MaxProductOfThreeTest {

  MaxProductOfThree instance;
  int[] input;

  @Before
  public void setUp() {
    instance = new MaxProductOfThree();
  }

  @Test
  public void tesPositiveCase() {
    input = new int[]{-3, 1, 2, -2, 5, 6};
    assertEquals(60, instance.solution(input));
  }

  @Test
  public void tesMinArraySize() {
    input = new int[]{-3, 1, 2};
    assertEquals(-6, instance.solution(input));
  }

  @Test
  public void tesMediumArraySize() {
    input = new int[100];
    assertEquals(0, instance.solution(input));
  }

}
