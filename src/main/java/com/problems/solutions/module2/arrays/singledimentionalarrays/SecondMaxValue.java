package com.edureka.assignments.module2.arrays.singledimentionalarrays;

/**
 *
 * Created by nandigama on 1/8/2019.
 */
public class SecondMaxValue {
    /**
     * Search second largest element in array
     * @param ar Array
     * @return returns Second largest element
     */
    public static int findSecondMaxValueInArray(int[] ar) {
        int firstLargest , secondLargest;
        if(ar[0] > ar[1]) {
            firstLargest = ar[0];
            secondLargest = ar[1];
        } else {
            firstLargest = ar[1];
            secondLargest = ar[0];
        }
        for (int i = 2; i < ar.length; i++) {
            if(ar[i] > firstLargest) {
                secondLargest = firstLargest;
                firstLargest = ar[i];
            } else if(ar[i] < firstLargest && ar[i] > secondLargest) {
                secondLargest = ar[i];
            }
        }
        return secondLargest;
    }

    public static void main(String[] args) {
        System.out.println(findSecondMaxValueInArray(new int[] {1,4,3,7,8,10,23}));
    }
}
