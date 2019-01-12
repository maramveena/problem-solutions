package com.edureka.assignments.module2.arrays.singledimentionalarrays;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by nandigama on 1/11/2019.
 */
public class DuplicateElementsTest {
    private DuplicateElements dup;
    @Before
    public void setUp() throws Exception {
        dup = new DuplicateElements();
    }

    @Test
    public void TestFindDuplicateElementsInArrayWithValidData() throws Exception {
        final int[] ar = {1, 2, 3, 1, 2};
        assertEquals(2, dup.findDuplicateElementsInArray(ar));
    }

    @Test
    public void TestFindDuplicateElementsInArrayWithEmptyData() throws Exception {
        final int[] ar = {};
        assertEquals(0, dup.findDuplicateElementsInArray(ar));
    }

    @Test
    public void TestFindDuplicateElementsInArrayWithDefaultValues() throws Exception {
        final int[] ar = new int[5];
        assertEquals(4, dup.findDuplicateElementsInArray(ar));
    }

    @Test
    public void TestFindDuplicateElementsInArrayWithNoDuplicates() throws Exception {
        final int[] ar = {1, 2, 3};
        assertEquals(0, dup.findDuplicateElementsInArray(ar));
    }

    @Test
    public void TestFindDuplicateElementsInArrayWithNoDuplicatesNegative() throws Exception {
        final int[] ar = {-1, -2, -3};
        assertEquals(0, dup.findDuplicateElementsInArray(ar));
    }

    @Test
    public void TestFindDuplicateElementsInArrayWithAllDupValuesNegative() throws Exception {
        final int[] ar = {-1, -2, -1, -2};
        assertEquals(2, dup.findDuplicateElementsInArray(ar));
    }

    @Test
    public void TestFindDuplicateElementsInArrayWithAllDupValuesNegativeAndPositive() throws Exception {
        final int[] ar = {1, 2, -1, -2};
        assertEquals(0, dup.findDuplicateElementsInArray(ar));
    }

    @Test
    public void TestFindDuplicateElementsInArrayWithAllDupValuesNegativeAndPositiveAndZero() throws Exception {
        final int[] ar = {1, 2, 0, 0, -1, -2};
        assertEquals(1, dup.findDuplicateElementsInArray(ar));
    }

    @Test
    public void TestFindDuplicateElementsInArrayWithAllDupValues() throws Exception {
        final int[] ar = {1, 2, 1, 2};
        assertEquals(2, dup.findDuplicateElementsInArray(ar));
    }

}