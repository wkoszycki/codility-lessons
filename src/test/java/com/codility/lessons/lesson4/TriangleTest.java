/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codility.lessons.lesson4;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author Wojciech Koszycki
 */
public class TriangleTest {

    Triangle triangle;
    int[] input;

    @Before
    public void setUp() {
        triangle = new Triangle();
    }
//A[P] + A[Q] > A[R],
//A[Q] + A[R] > A[P],
//A[R] + A[P] > A[Q].
//0,2,4

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
