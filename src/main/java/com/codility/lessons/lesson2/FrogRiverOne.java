package com.codility.lessons.lesson2;

/**
 * 100/100
 *
 * @author Wojciech Koszycki <wojciech.koszycki@gmail.com>
 */
public class FrogRiverOne {

    public int solution(int X, int[] A) {
        int counter = 0;
        boolean[] completeArray = createElementsArray(X);
        for (int i = 0; i < A.length; i++) {
            int element = A[i] - 1;
            boolean alreadyPopped = completeArray[element];
            if (!alreadyPopped) {
                completeArray[element] = true;
                counter++;
                if (counter == X) {
                    return i;
                }
            }

        }
        return -1;
    }

    public boolean[] createElementsArray(int size) {
        return new boolean[size];
    }
}
