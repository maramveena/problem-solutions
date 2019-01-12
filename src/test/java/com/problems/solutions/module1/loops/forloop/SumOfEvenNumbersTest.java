package com.problems.solutions.module1.loops.forloop;

import com.problems.solutions.module1.loops.whileloop.SumOfEvenNumbers;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by nandigama on 1/11/2019.
 */
public class SumOfEvenNumbersTest {
    private SumOfEvenNumbers sum;
    @Before
    public void setUp() throws Exception {
        sum = new SumOfEvenNumbers();
    }

    @Test
    public void testSumOfEvenNumbersWithValidData() throws Exception {
        assertEquals(4, sum.sumOfEvenNumbers(1232));
    }

    @Test
    public void testSumOfEvenNumbersWithZero() throws Exception {
        assertEquals(0, sum.sumOfEvenNumbers(0));
    }

    @Test
    public void testSumOfEvenNumbersWithNegitiveData() throws Exception {
        assertEquals(-4, sum.sumOfEvenNumbers(-1232));
    }

    @Test
    public void testSumOfEvenNumbersWithOddNumbers() throws Exception {
        assertEquals(0, sum.sumOfEvenNumbers(1357));
    }

    @Test
    public void testSumOfEvenNumbersWithEvenNumbers() throws Exception {
        assertEquals(8, sum.sumOfEvenNumbers(2222));
    }

}