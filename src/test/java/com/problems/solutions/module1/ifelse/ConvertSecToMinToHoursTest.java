package com.problems.solutions.module1.ifelse;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by nandigama on 1/11/2019.
 */
public class ConvertSecToMinToHoursTest {
    @Test
    public void convertMinToHoursToSecs() throws Exception {
    }

    @Test
    public void convertSecondsToMinutes() throws Exception {
    }

    private ConvertSecToMinToHours min;
    @Before
    public void setUp() throws Exception {
        min = new ConvertSecToMinToHours();
    }

    @Test
    public void TestConvertMinToHoursToCheckHourFormatZero() throws Exception {
       assertEquals("01h 00m 00s", min.convertMinToHoursToSecs(60));
    }
    @Test
    public void TestConvertMinToHoursToCheckHourFormatOne() throws Exception {
        assertEquals("11h 05m 05s", min.convertMinToHoursToSecs(665));
    }

    @Test
    public void TestConvertMinToHoursToSecsWithInValidData() throws Exception {
        assertEquals(null, min.convertMinToHoursToSecs(0));
    }

    @Test
    public void TestConvertMinToHoursToCheckMinFormatZero() throws Exception {
        assertEquals("11h 05m 05s", min.convertMinToHoursToSecs(665));
    }
    @Test
    public void TestConvertMinToHoursToCheckMinFormatOne() throws Exception {
        assertEquals("10h 15m 015s", min.convertMinToHoursToSecs(615));
    }

    @Test
    public void TestConvertMinToHoursToSecsWithMinValue() throws Exception {
        assertEquals(null, min.convertMinToHoursToSecs(Long.MIN_VALUE));
    }

    @Test
    public void TestConvertMinToHoursToSecsWithMaxValue() throws Exception {
        assertEquals("153722867280912930h 07m 07s", min.convertMinToHoursToSecs(Long.MAX_VALUE));
    }

    @Test
    public void TestConvertMinToHoursToSecsWithNegativeData() throws Exception {
        assertEquals(null, min.convertMinToHoursToSecs(-60));
    }
}