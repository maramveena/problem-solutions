package com.problems.solutions.module4.packagedemo1;


import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by nandigama on 1/10/2019.
 */
public class ReverseNumberMethodTest {
    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void testReverseANumberWithThreeDigits () throws Exception {
        ReverseNumberMethod reverse = new ReverseNumberMethod();
        assertEquals(321, reverse.reverseANumber(123));
    }

    @Test
    public void testReverseANumberWithTwoDigits () throws Exception {
        ReverseNumberMethod reverse = new ReverseNumberMethod();
        assertEquals(21, reverse.reverseANumber(12));
    }

    @Test
    public void testReverseANumberWithZero() throws Exception {
        ReverseNumberMethod reverse = new ReverseNumberMethod();
        assertEquals(0, reverse.reverseANumber(0));
    }

    @Test
    public void testReverseANumberWithOneDigit() throws Exception {
        ReverseNumberMethod reverse = new ReverseNumberMethod();
        assertEquals(3, reverse.reverseANumber(3));
    }

    @Test
    public void testReverseANumberWithNegativeNumbers () throws Exception {
        ReverseNumberMethod reverse = new ReverseNumberMethod();
        assertEquals(-321, reverse.reverseANumber(-123));
    }

}