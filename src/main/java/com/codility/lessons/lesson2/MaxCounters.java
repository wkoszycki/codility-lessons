package com.codility.lessons.lesson2;

/**
 * 100/100 level: Medium Problem: problem here is expected worst-case time complexity O(N+M),
 * normally we could just iterate over input array and when there is max counter we could fill our
 * result array otherwise increase given value. Since filling huge array worst-case: 100 000
 * elements with 100 000 times gives us complexity O(N*M) that means performance is an issue.
 */
public class MaxCounters {

  public int[] solution(int N, int[] A) {
    // max counter initially 0
    int maxCounter = 0;
    // last max counter initially 0
    int lastMaxCounterValue = 0;
    //create table to hold results
    final int[] counters = new int[N];
    // prepare constant value
    final int n1 = N + 1;
    //itterate over input table
    for (int i = 0; i < A.length; i++) {
      //when current element is equal to N+1 then perform max counter
      if (n1 == A[i]) {
        //instead of filling whole array keep refference to last max counter
        lastMaxCounterValue = maxCounter;
      } //perform increase of element
      else {
        // since we not filling each max counter we need to check wheter value of max counter was added
        // if no add value of lastmaxCounter + increase by one
        if (counters[A[i] - 1] < lastMaxCounterValue) {
          counters[A[i] - 1] = lastMaxCounterValue + 1;
        } else {
          // othwerwise just normall increasing
          counters[A[i] - 1]++;
        }
        // check is max counter is changing
        if (counters[A[i] - 1] > maxCounter) {
          maxCounter = counters[A[i] - 1];
        }
      }
    }
    // some values could be not processed when there was no value in input array, so
    // those values should be setted to last max counter value.
    for (int i = 0; i < counters.length; i++) {
      int counter = counters[i];
      if (counter < lastMaxCounterValue) {
        counters[i] = lastMaxCounterValue;
      }
    }

    return counters;
  }

}
