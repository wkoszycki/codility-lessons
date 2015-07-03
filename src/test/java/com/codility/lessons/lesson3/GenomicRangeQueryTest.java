package com.codility.lessons.lesson3;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @author Wojciech Koszycki <wojciech.koszycki@gmail.com>
 */
public class GenomicRangeQueryTest {

  GenomicRangeQuery query;

  @Before
  public void setUp() {
    this.query = new GenomicRangeQuery();
  }

  @Test
  public void testValidSmallBeginWithZero() {
    int[] p = new int[]{2, 5, 0};
    int[] q = new int[]{4, 5, 6};
    String s = "CAGCCTA";
    int[] result = query.solution(s, p, q);
    Assert.assertArrayEquals("Arrays are not equal", new int[]{2, 4, 1}, result);
  }

  //@Test
  public void testOneChar() {
    int[] p = new int[]{0};
    int[] q = new int[]{0};
    String s = "A";
    int[] result = query.solution(s, p, q);
    Assert.assertArrayEquals("Arrays are not equal", new int[]{1}, result);
  }

}
