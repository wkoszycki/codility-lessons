package com.codility.lessons.lesson2;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author Wojciech Koszycki <wojciech.koszycki@gmail.com>
 */
public class PermCheckTest {

    private PermCheck permCheck;

    @Before
    public void setUp() {
        permCheck = new PermCheck();
    }

    @Test
    public void testValidPermutation() {
        int[] input = {4, 1, 3, 2};
        int result = permCheck.solution(input);
        assertEquals(1, result);
    }

    @Test
    public void testInvalidPermutation() {
        int[] input = {4, 1, 3};
        int result = permCheck.solution(input);
        assertEquals(0, result);
    }

    @Test
    public void antiSumTest() {
        int[] input = {2, 2, 2};
        int result = permCheck.solution(input);
        assertEquals(0, result);
    }

}
