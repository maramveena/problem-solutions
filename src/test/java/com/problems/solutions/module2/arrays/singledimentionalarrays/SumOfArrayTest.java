package com.edureka.assignments.module2.arrays.singledimentionalarrays;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by nandigama on 1/11/2019.
 */
public class SumOfArrayTest {
    private SumOfArray sum;
    @Before
    public void setUp() throws Exception {
        sum = new SumOfArray();
    }

    @Test
    public void testSumOfElementsInArrayWithNegativeValidData() throws Exception {
        final int[] ar = {-1, -2 , -3, -4};
        assertEquals(-10, sum.sumOfElementsInArray(ar));
    }

    @Test
    public void testSumOfElementsInArrayWithNullData() throws Exception {
        assertEquals(0, sum.sumOfElementsInArray(null));
    }

    @Test
    public void testSumOfElementsInArrayWithNegativeSingleData() throws Exception {
        final int[] ar = {-1};
        assertEquals(-1, sum.sumOfElementsInArray(ar));
    }

    @Test
    public void testSumOfElementsInArrayWithPositiveSingleData() throws Exception {
        final int[] ar = {4};
        assertEquals(4, sum.sumOfElementsInArray(ar));
    }

    @Test
    public void testSumOfElementsInArrayWithEmptyData() throws Exception {
        final int[] ar = {};
        assertEquals(0, sum.sumOfElementsInArray(ar));
    }
    @Test
    public void testSumOfElementsInArrayWithDefaultValues() throws Exception {
        final int[] ar = new int[5];
        assertEquals(0, sum.sumOfElementsInArray(ar));
    }
    @Test
    public void testSumOfElementsInArrayWithPositiveValidData() throws Exception {
        final int[] ar = {1, 2 , 3};
        assertEquals(6, sum.sumOfElementsInArray(ar));
    }

    @Test
    public void testSumOfElementsInArrayWithPositiveAndNegativeData() throws Exception {
        final int[] ar = {1, -2 , 3};
        assertEquals(2, sum.sumOfElementsInArray(ar));
    }

}