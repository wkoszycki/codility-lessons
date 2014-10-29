package com.codility.lessons.lesson1;

/**
 * 100/100 this is arithmetic sequence {1}=3 {1,3}=6 {1,2,3,5}=15 this tables
 * are missing one element calc sum of all elements in proper table
 * sumOfallElements= numberOfelements *(firstElement+lastElement) /2 calc sum of
 * all elements in current table in for loop
 * sumOfallProper-sumOfallInvalid=result e.g {1,3} 6-4=2 , {1,2,3,5} 15-11=4
 *
 * @author Wojciech Koszycki <wojciech.koszycki@gmail.com>
 */
public class PermMissingelement {

    public int solution(int[] A) {
        int numberOfElements = A.length;
        if (numberOfElements == 0) {
            return 1;
        }
        long sumOfproperArithmeticSequence = countSumArithmeticSequence(numberOfElements + 1, 1, numberOfElements + 1);
        long sumOfcurrentSequence = countSumOfArray(A);
        long result = sumOfproperArithmeticSequence - sumOfcurrentSequence;
        return (int) result;
    }

    private long countSumOfArray(int[] array) {
        long sum = 0;
        for (int element : array) {
            sum += element;
        }
        return sum;
    }

    private long countSumArithmeticSequence(long numberOfElements, long firstElement, long lastElement) {
        return numberOfElements * (firstElement + lastElement) / 2;
    }
}
