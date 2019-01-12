package com.edureka.assignments.module2.arrays.singledimentionalarrays;

import java.util.*;

/**
 * Created by nandigama on 1/11/2019.
 */
public class CommonElementsInArraysSorting {

    /**
     * Finding Common Elements in Two Given Arrays and adding to Array List
     * and printing Those values
     *Sorting Both Arrays and Comparing.
     * @param ar1 First Array
     * @param ar2 Second Array
     */
    public Set<Integer> commonElementsInArray(int[] ar1, int[] ar2) {
        Set<Integer> set = new HashSet<>();

        if (ar1 != null && ar2 != null && ar1.length != 0 && ar2.length != 0) {
            Arrays.sort(ar1);
            Arrays.sort(ar2);

            for (int i = 0; i < ar1.length; i++) {
                for (int j = 0; j < ar2.length; j++) {
                    if (ar1[i] == ar2[j]) {
                        set.add(ar1[i]);
                    }
                }
            }
        }
        return set;
    }
}
