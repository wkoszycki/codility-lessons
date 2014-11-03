package com.codility.lessons.lesson1;

/**
 * 100/100 level: Easy
 *
 * @author Wojciech Koszycki <wojciech.koszycki@gmail.com>
 */
public class TapeEquilibrum {

    public int solution(int[] A) {
        int totalSum = countSum(A);
        int elementsSum = A[0];
        int lowestDiff = countDiff(totalSum, elementsSum);
        for (int i = 1; i < A.length - 1; i++) {
            elementsSum += A[i];
            int currentDiff = countDiff(totalSum, elementsSum);
            if (currentDiff < lowestDiff) {
                lowestDiff = currentDiff;
            }
        }

        return lowestDiff;
    }

    private int countDiff(int totalSum, int elementValue) {
        return Math.abs(elementValue - (totalSum - elementValue));
    }

    private int countSum(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

}
