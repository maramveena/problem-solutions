package com.edureka.assignments.module2.arrays.singledimentionalarrays;

/**
 * Created by nandigama on 1/8/2019.
 */
public class GetLargestElement {
    /**
     * find largest element in array
     * @param ar Array
     * @return returns largest element in array
     */
    public static int getMaxValueElementInArray(int[] ar) {
        int largest = ar[0];
        for (int i = 0; i < ar.length; i++) {
            if(ar[0] < ar[i]) {

                largest = ar[i];
            }
        }
        return largest;
    }

    public static void main(String[] args) {
        System.out.println(getMaxValueElementInArray(new int[] {1,4,6,7}));
    }
}
