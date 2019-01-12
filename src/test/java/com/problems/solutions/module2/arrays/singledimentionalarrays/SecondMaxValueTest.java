package com.problems.solutions.module2.arrays.singledimentionalarrays;


import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by nandigama on 1/10/2019.
 */
public class SecondMaxValueTest {
    SecondMaxValue secondMax;
    @Before
    public void setUp() throws Exception {
        secondMax = new SecondMaxValue();

    }

    @Test
    public void testFindSecondMaxValueInArrayWithNull() throws Exception {
        assertEquals(-1, secondMax.findSecondMaxValueInArray(null));
    }
    @Test
    public void testFindSecondMaxValueInArrayWithValidData() throws Exception {
        final int[] ar = {1, 2, 3, 4};
        assertEquals(3, secondMax.findSecondMaxValueInArray(ar));
    }
    @Test
    public void testFindSecondMaxValueInArrayWithEmptyData() throws Exception {
        final int[] ar = {};
        assertEquals(-1, secondMax.findSecondMaxValueInArray(ar));
    }
    @Test
    public void testFindSecondMaxValueInArrayWithEmptyValues() throws Exception {
        final int[] ar = new int[5];
        assertEquals(0, secondMax.findSecondMaxValueInArray(ar));
    }
    @Test
    public void testFindSecondMaxValueInArrayWithNegativeValues() throws Exception {
        final int[] ar = {-1, -2, -3, -4};
        assertEquals(-2, secondMax.findSecondMaxValueInArray(ar));
    }
}