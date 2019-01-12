package com.edureka.assignments.module1.ifelse;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by nandigama on 1/10/2019.
 */
public class LeapYearTest {
     LeapYear leap;
    @Before
    public void setUp() throws Exception {
        leap = new LeapYear();
    }

    @Test
    public void testIsLeapYearWithNegativeValues() throws Exception {
        assertEquals(false, leap.isLeapYear(-2004));
    }

    @Test
    public void testIsLeapYearWithZero() throws Exception {
        assertEquals(false, leap.isLeapYear(0));
    }

    @Test
    public void testIsLeapYearWithValidData() throws Exception {
        assertEquals(true, leap.isLeapYear(2004));
    }

    @Test
    public void testIsLeapYearWithInValidData() throws Exception {
        assertEquals(false, leap.isLeapYear(1800));
    }
}