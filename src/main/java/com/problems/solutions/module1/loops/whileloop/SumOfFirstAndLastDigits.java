package com.problems.solutions.module1.loops.whileloop;

/**
 * Created by nandigama on 9/19/2018.
 */
public class SumOfFirstAndLastDigits {

    /**
     * adding first and last digits of a number
     * @param n Number to find first and last digits
     * @return returns sum of first and last digit
     */
    public int sumOfFirstAndLastDigits(int n) {
        if(n < 0) {
            return -1;
        }
        int firstDigit = 0;
        int lastDigit = n % 10;
        while (n != 0) {
            if (n < 10) {
                firstDigit = n;
            }
            n /= 10;
        }
        return firstDigit + lastDigit;
    }
}
