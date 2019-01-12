package com.problems.solutions.module1.loops.whileloop;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by nandigama on 1/11/2019.
 */
public class SumOfOddNumbersTest {
    private SumOfOddNumbers sum;
    @Before
    public void setUp() throws Exception {
        sum = new SumOfOddNumbers();
    }

    @Test
    public void testSumOfEvenNumbersWithValidData() throws Exception {
        assertEquals(4, sum.sumOfOddNumbers(1232));
    }

    @Test
    public void testSumOfEvenNumbersWithZero() throws Exception {
        assertEquals(0, sum.sumOfOddNumbers(0));
    }

    @Test
    public void testSumOfEvenNumbersWithNegitiveData() throws Exception {
        assertEquals(-4, sum.sumOfOddNumbers(-1232));
    }

    @Test
    public void testSumOfEvenNumbersWithOddNumbers() throws Exception {
        assertEquals(8, sum.sumOfOddNumbers(1331));
    }

    @Test
    public void testSumOfEvenNumbersWithEvenNumbers() throws Exception {
        assertEquals(0, sum.sumOfOddNumbers(2222));
    }
}