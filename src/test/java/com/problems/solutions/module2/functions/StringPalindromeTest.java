package com.problems.solutions.module2.functions;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by nandigama on 1/11/2019.
 */
public class StringPalindromeTest {
    private StringPalindrome str;
    @Before
    public void setUp() throws Exception {
        str = new StringPalindrome();
    }

    @Test
    public void testIsStringPalindromeOrNotWithNull() throws Exception {
        assertEquals(false, str.isStringPalindromeOrNot(null));
    }

    @Test
    public void testIsStringPalindromeOrNotWithEmptyData() throws Exception {
        assertEquals(false, str.isStringPalindromeOrNot(""));
    }

    @Test
    public void testIsStringPalindromeOrNotWithValidData() throws Exception {
        assertEquals(true, str.isStringPalindromeOrNot("racecar"));
    }

    @Test
    public void testIsStringPalindromeOrNotWithSpacesInMiddle() throws Exception {
        assertEquals(false, str.isStringPalindromeOrNot("race car"));
    }

    @Test
    public void testIsStringPalindromeOrNotWithInValidData() throws Exception {
        assertEquals(false, str.isStringPalindromeOrNot("abcdd"));
    }

    @Test
    public void testIsStringPalindromeOrNotWithUpperCaseData() throws Exception {
        assertEquals(true, str.isStringPalindromeOrNot("MARAM"));
    }

    @Test
    public void testIsStringPalindromeOrNotWithLowerCaseData() throws Exception {
        assertEquals(true, str.isStringPalindromeOrNot("maram"));
    }

    @Test
    public void testIsStringPalindromeOrNotWithInValidNumberData() throws Exception {
        assertEquals(false, str.isStringPalindromeOrNot("12312"));
    }

    @Test
    public void testIsStringPalindromeOrNotWithValidNumberData() throws Exception {
        assertEquals(true, str.isStringPalindromeOrNot("11011"));
    }

    @Test
    public void testIsStringPalindromeOrNotWithWhiteSpace() throws Exception {
        assertEquals(true, str.isStringPalindromeOrNot(" "));
    }

    @Test
    public void testIsStringPalindromeOrNotWithSingleCharacter() throws Exception {
        assertEquals(true, str.isStringPalindromeOrNot("$"));
    }

}