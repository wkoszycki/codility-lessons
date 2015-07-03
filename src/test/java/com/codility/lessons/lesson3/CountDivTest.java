package com.codility.lessons.lesson3;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author Wojciech Koszycki <wojciech.koszycki@gmail.com>
 */
public class CountDivTest {

  private CountDiv countDiv;

  @Before
  public void setUp() {
    countDiv = new CountDiv();
  }

  @Test
  public void testValidSmallNumbers() {
    assertEquals(3, countDiv.solution(6, 11, 2));
  }

  @Test
  public void testValidSmallBeginWithZero() {
    assertEquals(4, countDiv.solution(4, 11, 2));
  }

  @Test
  public void testEven() {
    assertEquals(2, countDiv.solution(4, 11, 3));
  }

  @Test
  public void testsimple() {
    assertEquals(20, countDiv.solution(11, 345, 17));
  }

}
