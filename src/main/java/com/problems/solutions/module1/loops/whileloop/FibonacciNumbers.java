package com.problems.solutions.module1.loops.whileloop;

/**
 * Created by nandigama on 1/7/2019.
 */
public class FibonacciNumbers {
    public static void printTenFibonacciNumbers() {
        int i = 2,n1 = 0, n2 = 1, n3;
        System.out.print(n1 + " " + n2 + " ");
        while (i < 10){
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            System.out.print(" " + n3);
            i++;
        }
    }

    public static void main(String[] args) {
        printTenFibonacciNumbers();
    }
}
