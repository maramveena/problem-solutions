package com.edureka.assignments.module2.facorial;

/**
 * Created by nandigama on 1/5/2019.
 */
public class FactRecursion {
    public static int factorial(int n) {
        if(n == 0 || n == 1) {
            return 1;
        }
        return factorial(n-1) * n;
    }

    public static void main(String[] args) {
        System.out.println(factorial(5));
    }
}
