package com.problems.solutions.module2.functions;

/**
 * Created by nandigama on 1/8/2019.
 */
public class FibonacciNumbers {
    static int num1 = 0, num2 = 1, num3;
    /**
     * printing fibonacci sequence until given number using recursion
     *
     * @param num Number
     */
    public static void fibSequence(int num) {
        if (num > 0) {
            num3 = num1 + num2;
            num1 = num2;
            num2 = num3;
            System.out.print(" " + num3);
            fibSequence(num - 1);
        }
    }

    /**
     * printing fibonacci sequence until given number using 3rd variable
     *
     * @param n Number
     */
    public static void fibonacciSequence(int n) {
        int n1 = 0, n2 = 1, n3;
        System.out.print(n1 + " " + n2 + " ");
        for (int i = 2; i < n; i++) {
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            System.out.print(" " + n3);
        }
    }


    public static void main(String[] args) {
        int count = 10;
        System.out.print(num1 + " " + num2 + " ");
        fibSequence(count - 2);
        System.out.println();
        System.out.println("-----------------------");
        fibonacciSequence(10);

    }
}
