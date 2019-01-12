package com.problems.solutions.module1.loops.whileloop;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by nandigama on 1/11/2019.
 */
public class SumOfFirstAndLastDigitsTest {
    private SumOfFirstAndLastDigits sum;

    @Before
    public void setUp() throws Exception {
        sum = new SumOfFirstAndLastDigits();
    }

    @Test
    public void testSumOfFirstAndLastDigitsWithPositiveData() throws Exception {
        assertEquals(8, sum.sumOfFirstAndLastDigits(45674));
    }

    @Test
    public void testSumOfFirstAndLastDigitsWithZero() throws Exception {
        assertEquals(0, sum.sumOfFirstAndLastDigits(0));
    }

    @Test
    public void testSumOfFirstAndLastDigitsWithNegativeData() throws Exception {
        assertEquals(-1, sum.sumOfFirstAndLastDigits(-123));
    }
}