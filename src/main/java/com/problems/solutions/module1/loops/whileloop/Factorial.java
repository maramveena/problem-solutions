package com.problems.solutions.module1.loops.whileloop;

/**
 * Created by nandigama on 1/7/2019.
 */
public class Factorial {
    /**
     * to find factorial of a number
     *
     * @param num
     * @return returns factorial value of a number
     */
    public static int findFactorial(int num) {
        int fact = 1, i = 1;
        while (i <= num) {
            fact *= i;
            i++;
        }
        return fact;
    }

    public static void main(String[] args) {
        System.out.println(findFactorial(5));
    }
}
