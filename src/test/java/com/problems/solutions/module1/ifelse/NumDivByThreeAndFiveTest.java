package com.problems.solutions.module1.ifelse;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by nandigama on 1/10/2019.
 */
public class NumDivByThreeAndFiveTest {
    private NumDivByThreeAndFive number;
    @Before
    public void setUp() throws Exception {
        number = new NumDivByThreeAndFive();
    }

    @Test
    public void testNumDivByThreeAndFiveWithDivByBoth() throws Exception {
        assertEquals("fooboo",number.numDivByThreeAndFive(15));
    }

    @Test
    public void testNumDivByThreeAndFiveWithDivByThree() throws Exception {
        assertEquals("foo",number.numDivByThreeAndFive(3));
    }

    @Test
    public void testNumDivByThreeAndFiveWithDivByFive() throws Exception {
        assertEquals("boo",number.numDivByThreeAndFive(5));
    }

    @Test
    public void testNumDivByThreeAndFiveWithDivByZero() throws Exception {
        assertEquals("fooboo",number.numDivByThreeAndFive(0));
    }

    @Test
    public void testNumDivByThreeAndFiveWithNotDivByBoth() throws Exception {
        assertEquals("Invalid",number.numDivByThreeAndFive(14));
    }

    @Test
    public void testNumDivByThreeAndFiveWithDivByBothNegative() throws Exception {
        assertEquals("fooboo",number.numDivByThreeAndFive(-15));
    }

    @Test
    public void testNumDivByThreeAndFiveWithDivByThreeNegative() throws Exception {
        assertEquals("foo",number.numDivByThreeAndFive(-3));
    }

    @Test
    public void testNumDivByThreeAndFiveWithDivByFiveNegative() throws Exception {
        assertEquals("boo",number.numDivByThreeAndFive(-5));
    }

    @Test
    public void testNumDivByThreeAndFiveWithNotDivByBothNegative() throws Exception {
        assertEquals("Invalid",number.numDivByThreeAndFive(-14));
    }

    @Test
    public void testNumDivByThreeAndFiveWithMaxValue() throws Exception {
        assertEquals("Invalid",number.numDivByThreeAndFive(Integer.MAX_VALUE));
    }

    @Test
    public void testNumDivByThreeAndFiveWithMinValue() throws Exception {
        assertEquals("Invalid",number.numDivByThreeAndFive(Integer.MIN_VALUE));
    }
}