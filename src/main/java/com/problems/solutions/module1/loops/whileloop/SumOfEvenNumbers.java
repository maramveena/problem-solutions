package com.problems.solutions.module1.loops.whileloop;


/**
 * Created by nandigama on 1/11/2019.
 */
public class SumOfEvenNumbers {

    /**
     * finding even numbers in given number and adding them
     *
     * @param n given number to find even numbers
     * @return returns sum of Even numbers
     */
    public  int sumOfEvenNumbers(int n) {
        int sum = 0, result;
        while (n != 0) {
            result = n % 10;
            if (result % 2 == 0) {
                sum = sum + result;
            }
            n /= 10;
        }
        return sum;
    }
}
