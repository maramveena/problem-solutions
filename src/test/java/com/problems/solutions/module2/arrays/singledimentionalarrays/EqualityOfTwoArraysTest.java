package com.problems.solutions.module2.arrays.singledimentionalarrays;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by nandigama on 1/11/2019.
 */
public class EqualityOfTwoArraysTest {
    private EqualityOfTwoArrays equalOrNot;
    @Before
    public void setUp() throws Exception {
        equalOrNot = new EqualityOfTwoArrays();
    }

    @Test
    public void testCompareBothArraysWithValidData() throws Exception {
        int[] a1 = {1, 2, 3, 4};
        int[] a2 = {1, 2, 3, 4};
        assertEquals(true, equalOrNot.compareBothArrays(a1, a2));
    }

    @Test
    public void testCompareBothArraysWithInValidData() throws Exception {
        int[] a1 = {1, 2, 3, 4};
        int[] a2 = {1, 2, 3, 5};
        assertEquals(false, equalOrNot.compareBothArrays(a1, a2));
    }

    @Test
    public void testCompareBothArraysWithBothEmptyData() throws Exception {
        int[] a1 = {};
        int[] a2 = {};
        assertEquals(true, equalOrNot.compareBothArrays(a1, a2));
    }

    @Test
    public void testCompareBothArraysWithFirstOneEmptyData() throws Exception {
        int[] a1 = {};
        int[] a2 = {1, 2, 3, 4};
        assertEquals(false, equalOrNot.compareBothArrays(a1, a2));
    }

    @Test
    public void testCompareBothArraysWithFirstOnePositiveAndNegativeData() throws Exception {
        int[] a2 = {-1, -2, -3, -4};
        int[] a1 = {1, 2, 3, 4};
        assertEquals(false, equalOrNot.compareBothArrays(a1, a2));
    }

    @Test
    public void testCompareBothArraysWithFirstOnePositiveAndSecondNegativeData() throws Exception {
        int[] a1 = {-1, -2, -3, -4};
        int[] a2 = {1, 2, 3, 4};
        assertEquals(false, equalOrNot.compareBothArrays(a1, a2));
    }

    @Test
    public void testCompareBothArraysWithSameSizeWithDefaultValues() throws Exception {
        int[] a1 = new int[5];
        int[] a2 = new int[5];
        assertEquals(true, equalOrNot.compareBothArrays(a1, a2));
    }

    @Test
    public void testCompareBothArraysWithDifferentSizeWithDefaultValues() throws Exception {
        int[] a1 = new int[5];
        int[] a2 = new int[4];
        assertEquals(false, equalOrNot.compareBothArrays(a1, a2));
    }

    @Test
    public void testCompareBothArraysWithNulls() throws Exception {
        assertEquals(true, equalOrNot.compareBothArrays(null, null));
    }

    @Test
    public void testCompareBothArraysWithOneNull() throws Exception {
        int[] ar2 = {1, 2, 3};
        assertEquals(false, equalOrNot.compareBothArrays(null, ar2));
    }

    @Test
    public void testCompareBothArraysWithSecondOneNull() throws Exception {
        int[] ar1 = {1, 2, 3};
        assertEquals(false, equalOrNot.compareBothArrays(ar1, null));
    }
}