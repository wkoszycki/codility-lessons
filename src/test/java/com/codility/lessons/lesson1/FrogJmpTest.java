package com.codility.lessons.lesson1;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author Wojciech Koszycki <wojciech.koszycki@gmail.com>
 */
public class FrogJmpTest {

    FrogJmp solution;

    public FrogJmpTest() {
    }

    @Before
    public void setUp() {
        solution = new FrogJmp();
    }

    @Test
    public void testLongDistance() {
        int[] input = {10, 85, 30};
        int result = solution.solution(input[0], input[1], input[2]);
        assertEquals(3, result);
    }

    @Test
    public void testSameDistance() {
        int[] input = {10, 10, 30};
        int result = solution.solution(input[0], input[1], input[2]);
        assertEquals(0, result);
    }

    @Test
    public void testMediumDistance() {
        int[] input = {10, 20, 30};
        int result = solution.solution(input[0], input[1], input[2]);
        assertEquals(1, result);
    }

}
