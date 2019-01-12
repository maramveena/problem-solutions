package com.edureka.assignments.module2.arrays.singledimentionalarrays;

/**
 * Created by nandigama on 1/11/2019.
 */
public class EqualityOfTwoArrays {
    /**
     * Comparing Both Arrays Equal or Not
     *
     * @param ar1 Array1
     * @param ar2 Array2
     * @return true if it is Equal or false
     */
    public boolean compareBothArrays(int[] ar1, int[] ar2) {
        if (ar1 == null && ar2 == null) {
            return true;
        }

        if((ar1 != null && ar2 == null) || (ar2 != null && ar1 == null) || ar1.length != ar2.length) {
            return false;
        }

        for (int i = 0; i < ar1.length; i++) {
            if (ar1[i] != ar2[i]) {
                return false;
            }
        }

        return true;
    }

}
