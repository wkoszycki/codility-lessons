package com.codility.lessons.lesson2;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author Wojciech Koszycki <wojciech.koszycki@gmail.com>
 */
public class FrogRiverOneTest {

    private FrogRiverOne solution;

    @Before
    public void setUp() {
        solution = new FrogRiverOne();
    }

    @Test
    public void testSmallArray() {
        int[] input = {1, 3, 1, 4, 2, 3, 5, 4};
        int result = solution.solution(5, input);
        assertEquals(6, result);
    }

    @Test
    public void testMediumArray() {
        int[] input = {1, 3, 1, 4, 2, 3, 2, 4, 1, 3, 2, 1, 4, 1, 3, 2, 4, 1, 5, 3};
        int result = solution.solution(5, input);
        assertEquals(18, result);
    }

}
