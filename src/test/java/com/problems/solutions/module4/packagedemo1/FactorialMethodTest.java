package com.edureka.assignments.module4.packagedemo1;


import org.junit.Before;
import org.junit.Test;

import java.math.BigInteger;

import static org.junit.Assert.*;

/**
 * Created by nandigama on 1/10/2019.
 */
public class FactorialMethodTest {

    private FactorialMethod fact;

    @Before
    public void setUp() throws Exception {
        fact = new FactorialMethod();

    }

    @Test
    public void testFactorialWithValidPositiveNumber() throws Exception {
        assertEquals(BigInteger.valueOf(120), fact.factorial(5));
    }

    @Test
    public void testFactorialWithZero() throws Exception {
        final BigInteger bigInteger = fact.factorial(0);
        assertEquals(1, bigInteger.intValue());
    }

    @Test
    public void testFactorialWithNegativeNumber() throws Exception {
        final BigInteger bigInteger = fact.factorial(-1);
        assertEquals(1, bigInteger.intValue());
    }

    @Test
    public void testFactorialWithNumberOne() throws Exception {
        final BigInteger bigInteger = fact.factorial(1);
        assertEquals(1, bigInteger.intValue());
    }

    @Test
    public void testFactorialWithBigNumbers() throws Exception {
        final BigInteger bigInteger = fact.factorial(100);
        assertEquals(new BigInteger("93326215443944152681699238856266700490715968264381621468592963895217599993229915608941463976156518286253697920827223758251185210916864000000000000000000000000"),
                bigInteger);

    }
}