package com.problems.solutions.module2.arrays.singledimentionalarrays;

import java.util.Arrays;

/**
 * Created by nandigama on 1/8/2019.
 */
public class SortAscendingOrder {
    /**
     * Sorts an array in AscendingOrder
     * @param ar Array
     * @return returns sorted Array
     */
    public static String sortingArrayInAscendingOrder(int[] ar) {
        for (int i = 0; i < ar.length; i++) {
            for (int j = i + 1; j < ar.length; j++) {
                if(ar[i] > ar[j]) {
                    int temp = ar[i];
                    ar[i] = ar[j];
                    ar[j] = temp;
                }
            }
        }
        return Arrays.toString(ar);
    }

    public static void main(String[] args) {
        System.out.println(sortingArrayInAscendingOrder(new int[] {2,6,3,1}));
    }
}
