package com.problems.solutions.module2.arrays.singledimentionalarrays;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by nandigama on 1/11/2019.
 */
public class BinarySearchTest {
    private FindElementUsingBinarySearch search;
    @Before
    public void setUp() throws Exception {
        search = new FindElementUsingBinarySearch();
    }

    @Test
    public void testFindElementInSortedArrayWithValidData() throws Exception {
        int[] ar = {1, 2, 3, 4};
        assertEquals(0, search.findElementInSortedArray(ar, 1));
    }

    @Test
    public void testFindElementInSortedArrayWithoutAscendingOrder() throws Exception {
        int[] ar = {1, 3, 1, 6, 7, 2};
        assertEquals(-1, search.findElementInSortedArray(ar, 2));
    }

    @Test
    public void testFindElementInSortedArrayWithSameData() throws Exception {
        int[] ar = {2, 2, 2, 2, 2};
        assertEquals(2, search.findElementInSortedArray(ar, 2));
    }

    @Test
    public void testFindElementInSortedArrayWithInValidData() throws Exception {
        int[] ar = {1, 2, 3, 4};
        assertEquals(-1, search.findElementInSortedArray(ar, 5));
    }

    @Test
    public void testFindElementInSortedArrayWithNull() throws Exception {
        assertEquals(-1, search.findElementInSortedArray(null, 1));
    }

    @Test
    public void testFindElementInSortedArrayWithDefaultValues() throws Exception {
        int[] ar = new int[4];
        assertEquals(1, search.findElementInSortedArray(ar, 0));
    }

    @Test
    public void testFindElementInSortedArrayWithNegativeNumber() throws Exception {
        int[] ar = {1, 2, 3, 4};
        assertEquals(-1, search.findElementInSortedArray(ar, -1));
    }

    @Test
    public void testFindElementInSortedArrayWithNegativeData() throws Exception {
        int[] ar = {-4, -3, -2, -1};
        assertEquals(3, search.findElementInSortedArray(ar, -1));
    }

    @Test
    public void testFindElementInSortedArrayWithEmpty() throws Exception {
        int[] ar = new int[0];
        assertEquals(-1, search.findElementInSortedArray(ar, 1));
    }
}