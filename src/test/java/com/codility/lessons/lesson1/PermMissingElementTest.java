package com.codility.lessons.lesson1;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;


public class PermMissingElementTest {

  private PermMissingElement solution;

  public PermMissingElementTest() {
  }

  @Before
  public void setUp() {
    solution = new PermMissingElement();
  }

  @Test
  public void testPositive() {
    int[] input = {2, 3, 1, 5};
    int result = solution.solution(input);
    assertEquals(4, result);
  }

  @Test
  public void testTwoElements() {
    int[] input = {2, 3};
    int result = solution.solution(input);
    assertEquals(1, result);
  }

  @Test
  public void missingFirst() {
    int[] input = {2, 3, 4, 5};
    int result = solution.solution(input);
    assertEquals(1, result);
  }

  @Test
  public void testSingleElement() {
    int[] input = {1};
    int result = solution.solution(input);
    assertEquals(2, result);
  }

  @Test
  public void testEmptyList() {
    int[] input = {};
    int result = solution.solution(input);
    assertEquals(1, result);
  }

  @Test
  public void testHugeValues() {
    int[] arithmeticSequence = new int[99999];
    List<Integer> list = new ArrayList<>();
    for (int i = 1; i < 100001; i++) {
      if (i == 10001) {
        continue;
      }
      list.add(i);
    }
    for (int i = 0; i < list.size(); i++) {
      arithmeticSequence[i] = list.get(i);
    }

    int result = solution.solution(arithmeticSequence);
    assertEquals(10001, result);
  }

}
