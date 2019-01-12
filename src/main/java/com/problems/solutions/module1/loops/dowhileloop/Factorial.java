package com.edureka.assignments.module1.loops.dowhileloop;

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
        int i = 1, fact = 1;
        do {
            fact *= i;
            i++;
        } while (i <= num);

        return fact;
    }

    public static void main(String[] args) {
        System.out.println(findFactorial(5));
    }
}
