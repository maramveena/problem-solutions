package com.problems.solutions.module2.functions;

/**
 * Created by nandigama on 1/8/2019.
 */
public class FactorialOfNumber {
    /**
     * To find factorial of number using recursion
     * @param n Number
     * @return returns result of factorial of Number
     */
    public static int factorialOfNumber(int n) {
        if(n == 0 || n == 1) {
            return 1;
        }
        return factorialOfNumber(n-1) * n;
    }

    public static void main(String[] args) {
        System.out.println(factorialOfNumber(5));
    }
}
