package com.edureka.assignments.module2.arrays.singledimentionalarrays;

/**
 * Created by nandigama on 1/11/2019.
 */
public class SumOfArray {
    /**
     * Adding all elements in given array
     *
     * @param ar given array to find sum
     * @return result of sum of array elements
     */
    public int sumOfElementsInArray(int[] ar) {
        if(ar == null || ar.length == 0) {
            return 0;
        }
        int sum = 0;
        for (int i : ar) {
            sum += i;
        }
        return sum;
    }
}
