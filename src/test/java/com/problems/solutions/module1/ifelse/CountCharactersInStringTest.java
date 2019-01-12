package com.problems.solutions.module1.ifelse;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by nandigama on 1/10/2019.
 */
public class CountCharactersInStringTest {
    private CountCharactersInString count;

    @Before
    public void setUp() throws Exception {
        count = new CountCharactersInString();
    }

    @Test
    public void testCountCharactersWithNull() throws Exception {
        assertEquals(-1, count.countCharacters(null, 'e'));
    }

    @Test
    public void testCountCharactersWithEmptyString() throws Exception {
        assertEquals(-1, count.countCharacters("", 'e'));
    }

    @Test
    public void testCountCharactersWithEmptyCharacter() throws Exception {
        assertEquals(0, count.countCharacters("veena", ' '));
    }

    @Test
    public void testCountCharactersWithEmptyData() throws Exception {
        assertEquals(-1, count.countCharacters("", ' '));
    }

    @Test
    public void testCountCharactersWithWhiteSpace() throws Exception {
        assertEquals(0, count.countCharacters(" ", ' '));
    }

    @Test
    public void testCountCharactersWithValidData() throws Exception {
        assertEquals(2, count.countCharacters("veena", 'e'));
    }

    @Test
    public void testCountCharactersWithNumbers() throws Exception {
        assertEquals(2, count.countCharacters("12312", '2'));
    }

}