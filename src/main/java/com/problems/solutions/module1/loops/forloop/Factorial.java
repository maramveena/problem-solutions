package com.problems.solutions.module1.loops.forloop;

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
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
        System.out.println(findFactorial(1));
    }
}
