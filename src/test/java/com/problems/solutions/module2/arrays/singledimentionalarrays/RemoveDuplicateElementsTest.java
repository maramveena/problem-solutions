package com.edureka.assignments.module2.arrays.singledimentionalarrays;

import org.junit.Before;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;

/**
 * Created by nandigama on 1/11/2019.
 */
public class RemoveDuplicateElementsTest {
    private RemoveDuplicateElementsUsingSet remove;
    private Set<Integer> set;
    @Before
    public void setUp() throws Exception {
        remove = new RemoveDuplicateElementsUsingSet();
    }

    @Test
    public void testRemoveDuplicateElementsWithValidData() throws Exception {
        int[] ar = {1, 2, 3, 1};
        set = new HashSet<>();
        set.add(2);
        set.add(3);
        assertEquals(set, remove.removeDuplicateElements(ar));
    }

    @Test
    public void testRemoveDuplicateElementsWithSameData() throws Exception {
        int[] ar = {1, 1, 1, 1};
        set = new HashSet<>();
        assertEquals(set, remove.removeDuplicateElements(ar));
    }

    @Test
    public void testRemoveDuplicateElementsWithDifferentData() throws Exception {
        int[] ar = {1, 2, 3, 4};
        set = new HashSet<>();
        set.add(2);
        set.add(3);
        set.add(1);
        set.add(4);
        assertEquals(set, remove.removeDuplicateElements(ar));
    }

    @Test
    public void testRemoveDuplicateElementsWithNull() throws Exception {
        set = new HashSet<>();
        assertEquals(null, remove.removeDuplicateElements(null));
    }

    @Test
    public void testRemoveDuplicateElementsWithEmptyData() throws Exception {
        int[] ar = {};
        set = new HashSet<>();
        assertEquals(null, remove.removeDuplicateElements(ar));
    }

    @Test
    public void testRemoveDuplicateElementsWithDefaultData() throws Exception {
        int[] ar = new int[5];
        set = new HashSet<>();
        set.add(0);
        assertEquals(set, remove.removeDuplicateElements(ar));
    }

    @Test
    public void testRemoveDuplicateElementsWithNegativeData() throws Exception {
        int[] ar = {-1, -2, -3, -1, -1};
        set = new HashSet<>();
        set.add(-1);
        set.add(-2);
        set.add(-3);
        assertEquals(set, remove.removeDuplicateElements(ar));
    }

    @Test
    public void testRemoveDuplicateElementsWithPositiveAndNegativeData() throws Exception {
        int[] ar = {-1, -2, 3, 1, 1};
        set = new HashSet<>();
        set.add(-1);
        set.add(-2);
        set.add(3);
        assertEquals(set, remove.removeDuplicateElements(ar));
    }

}