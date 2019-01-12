package com.edureka.assignments.module2.arrays.singledimentionalarrays;


import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by nandigama on 1/10/2019.
 */
public class GetLargestElementTest {
    GetLargestElement element;
    @Before
    public void setUp() throws Exception {
        element = new GetLargestElement();
    }
    @Test
    public void testGetMaxValueElementInArrayWithNull() throws Exception {
        assertEquals(-1, element.getMaxValueElementInArray(null));
    }

    @Test
    public void testGetMaxValueElementInArrayWithSameData() throws Exception {
        int[] ar = {1, 1, 1, 1};
        assertEquals(1, element.getMaxValueElementInArray(ar));
    }
    @Test
    public void testGetMaxValueElementInArrayWithAscendingOrder() throws Exception {
        int[] ar = {1, 4, 5, 6, 7, 8};
        assertEquals(8, element.getMaxValueElementInArray(ar));
    }
    @Test
    public void testGetMaxValueElementInArrayWithDescendingOrder() throws Exception {
        int[] ar = {7, 6, 5, 4, 1};
        assertEquals(7, element.getMaxValueElementInArray(ar));
    }
    @Test
    public void testGetMaxValueElementInArrayWithValidData() throws Exception {
        int[] ar = {1, 5, 4, 3, 6};
        assertEquals(6, element.getMaxValueElementInArray(ar));
    }
    @Test
    public void testGetMaxValueElementInArrayWithZeros() throws Exception {
        int[] ar = new int[5];
        assertEquals(0, element.getMaxValueElementInArray(ar));
    }
    @Test
    public void testGetMaxValueElementInArrayWithEmptyArray() throws Exception {
        int[] ar = {};
        assertEquals(-1, element.getMaxValueElementInArray(ar));
    }

    @Test
    public void testGetMaxValueElementInArrayWithNegativeValues() throws Exception {
        int[] ar = {-1, -2,-3, -4};
        assertEquals(-1, element.getMaxValueElementInArray(ar));
    }
    @Test
    public void testGetMaxValueElementInArrayWithPositiveAndNegative() throws Exception {
        int[] ar = {-1, -2, 3, 4};
        assertEquals(4, element.getMaxValueElementInArray(ar));
    }

}