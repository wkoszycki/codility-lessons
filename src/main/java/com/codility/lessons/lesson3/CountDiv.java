package com.codility.lessons.lesson3;

/**
 * level: Medium
 *
 * @author Wojciech Koszycki <wojciech.koszycki@gmail.com>
 */
public class CountDiv {

    public int solution(int A, int B, int K) {
        //6, B = 11 and K = 2
        return B / K - (A / K) + (A % K == 0 ? 1 : 0);
    }
}
