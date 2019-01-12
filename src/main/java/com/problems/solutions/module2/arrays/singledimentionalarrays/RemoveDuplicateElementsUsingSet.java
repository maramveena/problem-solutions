package com.problems.solutions.module2.arrays.singledimentionalarrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by nandigama on 1/11/2019.
 */
public class RemoveDuplicateElementsUsingSet {
    public Set<Integer> removeDuplicateElements(int[] ar) {
        Set<Integer> set = new HashSet<>();
        if(ar == null || ar.length == 0) {
            return null;
        }
        for (int i : ar) {
            if(!set.add(i)) {
                set.remove(i);
            }
        }
        return set;
    }
}
