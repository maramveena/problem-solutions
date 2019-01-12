package com.edureka.assignments.module1.loops.forloop;

/**
 * Created by nandigama on 1/7/2019.
 */
public class FibonacciNumbers {
    public static void printTenFibonacciNumbers() {
        int n1 = 0, n2 = 1, n3;
        System.out.print(n1 + " " + n2 + " ");
        for (int i = 2; i < 10; i++) {
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            System.out.print(" " + n3);
        }
    }

    public static void main(String[] args) {
        printTenFibonacciNumbers();
    }
}
