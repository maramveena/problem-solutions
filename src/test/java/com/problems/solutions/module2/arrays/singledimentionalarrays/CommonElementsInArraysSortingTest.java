package com.problems.solutions.module2.arrays.singledimentionalarrays;

import org.junit.Before;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;

/**
 * Created by nandigama on 1/11/2019.
 */
public class CommonElementsInArraysSortingTest {

    private CommonElementsInArraysSorting common;
    private Set<Integer> setResult = new HashSet<>();

    @Before
    public void setUp() throws Exception {
        common = new CommonElementsInArraysSorting();
    }

    @Test
    public void testCommonElementsInArrayWithValidData() throws Exception {
        int[] arr1 = {1, 2, 5, 3};
        int[] arr2 = {5, 4, 3, 2};
        setResult.add(2);
        setResult.add(3);
        setResult.add(5);
        assertEquals(setResult, common.commonElementsInArray(arr1, arr2));
    }

    @Test
    public void testCommonElementsInArrayWithBothDefaultData() throws Exception {
        int[] arr1 = new int[5];
        int[] arr2 = new int[6];
        setResult.add(0);
        assertEquals(setResult, common.commonElementsInArray(arr1, arr2));
    }

    @Test
    public void testCommonElementsInArrayWithBothNegativeData() throws Exception {
        int[] arr1 = {-1, -2, -5, -3};
        int[] arr2 = {-5, -4, -3, -2};
        setResult.add(-2);
        setResult.add(-3);
        setResult.add(-5);
        assertEquals(setResult, common.commonElementsInArray(arr1, arr2));
    }

    @Test
    public void testCommonElementsInArrayWithOneNegativeAndOnePositiveData() throws Exception {
        int[] arr1 = {-1, -2, -5, -3};
        int[] arr2 = {5, 4, 3, 2};
        assertEquals(setResult, common.commonElementsInArray(arr1, arr2));
    }

    @Test
    public void testCommonElementsInArrayWithBothNegativeAndPositiveData() throws Exception {
        int[] arr1 = {-1, -2, 5, 4};
        int[] arr2 = {5, -4, -3, 2};
        setResult.add(5);
        assertEquals(setResult, common.commonElementsInArray(arr1, arr2));
    }
    @Test
    public void testCommonElementsInArrayWithBothNullData() throws Exception {

        assertEquals(setResult, common.commonElementsInArray(null, null));
    }

    @Test
    public void testCommonElementsInArrayWithFirstNull() throws Exception {
        int[] arr2 = {5, 4, 3, 2};
        assertEquals(setResult, common.commonElementsInArray(null, arr2));
    }

    @Test
    public void testCommonElementsInArrayWithSecondNull() throws Exception {
        int[] arr1 = {5, 4, 3, 2};
        assertEquals(setResult, common.commonElementsInArray(arr1, null));
    }

    @Test
    public void testCommonElementsInArrayWithBothEmpty() throws Exception {
        int[] arr1 = {};
        int[] arr2 = {};
        assertEquals(setResult, common.commonElementsInArray(arr1, arr2));
    }

    @Test
    public void testCommonElementsInArrayWithFirstEmpty() throws Exception {
        int[] arr1 = {};
        int[] arr2 = {5, 4, 3, 2};
        assertEquals(setResult, common.commonElementsInArray(arr1, arr2));
    }

    @Test
    public void testCommonElementsInArrayWithSecondEmpty() throws Exception {
        int[] arr1 = {5, 4, 3, 2};
        int[] arr2 = {};
        assertEquals(setResult, common.commonElementsInArray(arr1, arr2));
    }
}