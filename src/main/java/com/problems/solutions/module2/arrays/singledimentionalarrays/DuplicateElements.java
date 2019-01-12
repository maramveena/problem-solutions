package com.problems.solutions.module2.arrays.singledimentionalarrays;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by nandigama on 1/11/2019.
 */
public class DuplicateElements {

    /**
     * Counting duplicate elements in a given Array
     * @param ar given Array to provide Values to find duplicates.
     * @return count of duplicate elements
     */
    public int findDuplicateElementsInArray(int[] ar) {
        if(ar.length <= 1) {
            return 0;
        }

        Set<Integer> set = new HashSet<>();
        int count = 0;
        for (int i : ar) {
            if(!set.add(i)) {
                count ++;
            }
        }
        return count;
    }
}
