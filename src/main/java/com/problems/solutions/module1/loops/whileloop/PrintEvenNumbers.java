package com.edureka.assignments.module1.loops.whileloop;

/**
 * Created by nandigama on 1/7/2019.
 */
public class PrintEvenNumbers {
    public static void printFirstTenEvenNumbers() {
        int i = 2;
        System.out.println("First Ten Even Numbers are :");
        while (i < 21) {
            System.out.println(i);
            i += 2;
        }
    }

    public static void printFirstTenOddNumbers() {
        int i = 1;
        System.out.println("First Ten Odd Numbers are :");
        while (i < 21) {
            System.out.println(i);
            i += 2;
        }
    }
    public static void main(String[] args) {
        printFirstTenEvenNumbers();
        System.out.println("---------");
        printFirstTenOddNumbers();
    }
}
