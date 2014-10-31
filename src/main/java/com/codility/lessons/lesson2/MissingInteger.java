package com.codility.lessons.lesson2;

import java.util.Arrays;

/**
 * 100/100
 *
 * @author Wojciech Koszycki <wojciech.koszycki@gmail.com>
 */
public class MissingInteger {

    public int solution(int[] A) {
        int minimalPositiveInteger = 1;
        Arrays.sort(A);
        for (int i = 0; i < A.length; i++) {
            int currentElement = A[i];
            //if positive
            if (currentElement > 0) {
                if (minimalPositiveInteger == currentElement) {
                    minimalPositiveInteger++;
                }
            }
        }
        return minimalPositiveInteger;
    }
}
