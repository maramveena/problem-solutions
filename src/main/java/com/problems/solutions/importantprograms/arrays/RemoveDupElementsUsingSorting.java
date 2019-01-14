package com.problems.solutions.importantprograms.arrays;

import java.util.*;

/**
 * Created by nandigama on 1/12/2019.
 */
public class RemoveDupElementsUsingSorting {

    public static int[] removeDupElementsUsingSorting(int[] ar) {
        Arrays.sort(ar);

        List<Integer> res = new ArrayList<>();

        for (int i = 1; i < ar.length; i++) {
            if (ar[i] != ar[i - 1])
                res.add(ar[i - 1]);

            if (i + 1 == ar.length) {
                res.add(ar[i]);
            }
        }

        int[] uniqueValues = new int[res.size()];

        for (int i = 0; i < res.size(); i++)
            uniqueValues[i] = res.get(i);

        return uniqueValues;
    }

    public static void main(String [] args) {
        System.out.println(Arrays.toString(removeDupElementsUsingSorting(new int[]{4,3,4,3,2,5,1})));
    }
}
