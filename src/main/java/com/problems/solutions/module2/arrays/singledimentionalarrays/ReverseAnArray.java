package com.problems.solutions.module2.arrays.singledimentionalarrays;

import java.util.Arrays;

/**
 * Created by nandigama on 1/8/2019.
 */
public class ReverseAnArray {
    /**
     * Reversing an array with using a new array
     *
     * @param ar Array
     * @return returns Reverse of An Array
     */
    public static String reverseAnArray(int[] ar) {
        int[] reverse = new int[ar.length];
        for (int i = 0, j = ar.length - 1; i < ar.length; i++, j--) {
            reverse[j] = ar[i];
        }
        return Arrays.toString(reverse);
    }

    /**
     * swapping an  elements with in array to reverse an array
     *
     * @param ar Array
     * @return returns Reverse of An Array
     */
    public static String reverseAnArraySwapping(int[] ar) {
        for (int i = 0, j = ar.length - 1; i < j; i++, j--) {
            int temp = ar[i];
            ar[i] = ar[j];
            ar[j] = temp;
        }
        return Arrays.toString(ar);
    }

    public static void main(String[] args) {
        System.out.println(reverseAnArray(new int[]{1, 2, 3}));
        System.out.println(reverseAnArraySwapping(new int[]{3, 4, 5}));
    }
}
