package com.codility.lessons.lesson3;

/**
 * level: Easy
 *
 * @author Wojciech Koszycki <wojciech.koszycki@gmail.com>
 */
public class PassingCars {

    public int solution(int[] A) {
        int firstCar = A[0];
        int differentCarsPassed = 1;
        int totalPassedCars = 0;
        //check when there are two cars whetere there are passing each other
        // A=1,0 are not but B=0,1 are passing so A=1-0=1 and  B=0-1=-1
        if (A.length == 2) {
            return A[0] + A[1] == -1 ? 1 : 0;
        }
        for (int i = 1; i < A.length; i++) {
            if (A[i] != firstCar) {
                totalPassedCars += differentCarsPassed * 1;
            } else {
                differentCarsPassed++;
            }
            if (totalPassedCars > 1000000000) {
                return -1;
            }
        }
        return totalPassedCars;
    }

}
