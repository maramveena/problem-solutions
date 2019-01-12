package com.problems.solutions.module2.arrays.singledimentionalarrays;

import java.util.Arrays;

/**
 * Created by nandigama on 1/11/2019.
 */
public class RemoveDuplicateElements {
    public String removeDuplicateElements(int[] ar) {
        if(ar == null || ar.length == 0) {
            return null;
        }
        int length = ar.length;
        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                if(ar[i] == ar[j]) {
                    ar[j] = ar[length-1];
                    length--;
                    j--;
                }
            }
        }
        int[] arrayWithOutDup = Arrays.copyOf(ar, length);
        return Arrays.toString(arrayWithOutDup);
    }

    public static void main(String[] args) {
        RemoveDuplicateElements remove = new RemoveDuplicateElements();
        int[] ar = {3, 2, 1, 1};
        System.out.println(remove.removeDuplicateElements(ar));
    }
}
