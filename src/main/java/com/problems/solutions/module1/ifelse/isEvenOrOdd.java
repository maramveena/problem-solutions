package com.edureka.assignments.module1.ifelse;

/**
 * Created by nandigama on 1/7/2019.
 */
public class isEvenOrOdd {
    public static boolean isEvenNumber(int num) {
        return num % 2 == 0;
    }

    public static boolean isOddNumber(int num) {
        return num % 2 != 0;
    }

    public static void main(String[] args) {
        System.out.println(isEvenNumber(0));
        System.out.println(isOddNumber(0));
    }
}
