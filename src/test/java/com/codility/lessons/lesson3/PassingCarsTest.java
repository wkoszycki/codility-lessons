package com.codility.lessons.lesson3;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author Wojciech Koszycki <wojciech.koszycki@gmail.com>
 */
public class PassingCarsTest {

  private PassingCars passingCars;
  private int[] cars;

  @Before
  public void setUp() {
    passingCars = new PassingCars();
  }

  @Test
  public void testValidSmallBeginWithZero() {
    cars = new int[]{0, 1, 0, 1, 1};
    assertEquals(5, passingCars.solution(cars));
  }

  @Test
  public void testValidSmallBeginWithOne() {
    cars = new int[]{1, 0, 1, 0, 0};
    assertEquals(5, passingCars.solution(cars));
  }

  @Test
  public void testDoubleElements() {
    cars = new int[]{0, 0};
    assertEquals(0, passingCars.solution(cars));
  }

  @Test
  public void testDoubleElementsOnePassed() {
    cars = new int[]{1, 0};
    assertEquals(0, passingCars.solution(cars));
  }

  @Test
  public void testDoubleElementsOnePassed2() {
    cars = new int[]{0, 1};
    assertEquals(1, passingCars.solution(cars));
  }

//    @Test
//    public void testValidMediumArray() {
//        cars = new int[]{0, 1, 0, 1, 1, 1, 0, 1, 1};
//        assertEquals(10, passingCars.solution(cars));
//    }
}
