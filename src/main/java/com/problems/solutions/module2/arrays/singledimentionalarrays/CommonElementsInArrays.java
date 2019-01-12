package com.edureka.assignments.module2.arrays.singledimentionalarrays;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by nandigama on 1/11/2019.
 */
public class CommonElementsInArrays {

    /**
     * Finding Common Elements in Two Given Arrays and adding to HashSet and printing Those values
     *
     * @param ar1 First Array
     * @param ar2 Second Array
     */
    public Set<Integer> commonElementsInArray(int[] ar1, int[] ar2) {
        Set<Integer> tempSet;
        Set<Integer> resultSet = new HashSet<>();
        if (ar1 != null && ar2 != null) {
            if (Math.min(ar1.length, ar2.length) == ar1.length) {
                tempSet = creatingSetUsingMinArray(ar1);
                resultSet = findCommonUniqueElementsInArray(tempSet, ar2);
            } else {
                tempSet = creatingSetUsingMinArray(ar2);
                resultSet = findCommonUniqueElementsInArray(tempSet, ar1);
            }
        }
        return resultSet;
    }

    /**
     * Creating set using Array to find Min Array
     *
     * @param ar Array
     * @return set values
     */
    public Set<Integer> creatingSetUsingMinArray(int[] ar) {
        Set<Integer> tempSet = new HashSet<>();

        for (int i : ar) {
            tempSet.add(i);
        }
        return tempSet;
    }

    /**
     * find Unique Elements in array
     *
     * @param set set to find unique elements in array
     * @param ar  Array to set unique values
     * @return set of Values
     */
    public Set<Integer> findCommonUniqueElementsInArray(Set<Integer> set, int[] ar) {
        Set<Integer> resultSet = new HashSet<>();
        for (int i : ar) {
            if (set.contains(i)) {
                resultSet.add(i);
            }
        }
        return resultSet;
    }

}
