package com.problems.solutions.module1.loops.forloop;

/**
 * Created by nandigama on 1/7/2019.
 */
public class PrintEvenNumbers {
    public static void printFirstTenEvenNumbers() {
        System.out.println("First Ten Even Numbers are :");
        for (int i = 2 ; i < 21 ; i += 2) {
            System.out.println(i);
        }
    }

    public static void printFirstTenOddNumbers() {
        System.out.println("First Ten Odd Numbers are :");
        for (int i = 1; i < 21; i += 2) {
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        printFirstTenEvenNumbers();
        System.out.println("---------");
        printFirstTenOddNumbers();
    }
}
