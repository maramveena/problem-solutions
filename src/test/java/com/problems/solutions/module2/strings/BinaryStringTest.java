package com.problems.solutions.module2.strings;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by nandigama on 1/10/2019.
 */
public class BinaryStringTest {
    BinaryString binary;
    @Before
    public void setUp() throws Exception {
        binary = new BinaryString();
    }

    /**
     * test cases for method Binary sub strings one
     * @throws Exception
     */
    @Test
    public void testCountBinarySubStringsOneWithValidData() throws Exception {
        assertEquals(6, binary.countBinarySubStringsOne("11011"));
    }

    @Test
    public void testCountBinarySubStringsOneWithEmptyData() throws Exception {
        assertEquals(0, binary.countBinarySubStringsOne(""));
    }

    @Test
    public void testCountBinarySubStringsOneWithNull() throws Exception {
        assertEquals(0, binary.countBinarySubStringsOne(null));
    }

    @Test
    public void testCountBinarySubStringsOneWithWhiteSpace() throws Exception {
        assertEquals(0, binary.countBinarySubStringsOne(" "));
    }

    @Test
    public void testCountBinarySubStringsOneWithSpecialCharacters() throws Exception {
        assertEquals(1, binary.countBinarySubStringsOne("1&&1"));
    }

    @Test
    public void testCountBinarySubStringsOneWithNumbers() throws Exception {
        assertEquals(6, binary.countBinarySubStringsOne("11511"));
    }

    @Test
    public void testCountBinarySubStringsOneWithCharacters() throws Exception {
        assertEquals(0, binary.countBinarySubStringsOne("veena1"));
    }
    /**
     * test cases for method Binary sub strings 2
     * @throws Exception
     */
    @Test
    public void testCountBinaryStringsWithValidData() throws Exception {
        assertEquals(3, binary.countBinaryStrings("1101"));
    }

    @Test
    public void testCountBinaryStringsWithEmptyData() throws Exception {
        assertEquals(0, binary.countBinarySubStringsOne(""));
    }

    @Test
    public void testCountBinaryStringsWithNull() throws Exception {
        assertEquals(0, binary.countBinarySubStringsOne(null));
    }

    @Test
    public void testCountBinaryStringsWithWhiteSpace() throws Exception {
        assertEquals(0, binary.countBinarySubStringsOne(" "));
    }

    @Test
    public void testCountBinaryStringsWithSpecialCharacters() throws Exception {
        assertEquals(1, binary.countBinarySubStringsOne("1&&1"));
    }

    @Test
    public void testCountBinaryStringsWithNumbers() throws Exception {
        assertEquals(6, binary.countBinarySubStringsOne("11511"));
    }

    @Test
    public void testCountBinaryStringsWithCharacters() throws Exception {
        assertEquals(0, binary.countBinarySubStringsOne("veena1"));
    }

}