package com.problems.solutions.module2.arrays.singledimentionalarrays;

import java.util.Arrays;

/**
 * Created by nandigama on 1/12/2019.
 */
public class DoubleArrayElements {
    /**
     * multiplying array of Each element in Given array by 2 and storing into new Array
     * @param ar Given Array to calculate
     * @return result of multiplying Array
     */
    public static String doubleTheElementsInArray(int[] ar) {
        if(ar == null || ar.length == 0) {
            return null;
        }
        int[] result = new int[ar.length];
        for (int i = 0; i < ar.length; i++) {
            result[i] = ar[i] * 2;
        }
        return Arrays.toString(result);
    }

    public static void main(String[] args) {
        int[] ar = {1, 2, 3, 4};
        System.out.println(doubleTheElementsInArray(ar));
    }
}
