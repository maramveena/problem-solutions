package com.problems.solutions.module1.loops.forloop;

/**
 * Created by nandigama on 1/7/2019.
 */
public class MultiplicationTables {
    public static void printMultiplicationTable(int n) {
        for (int i = 1; i < 11; i++) {
            System.out.println(n + "\t*" + "\t" + i + "\t=\t" + (n * i));
        }
    }
    public static void main(String[] args) {
        printMultiplicationTable(10);
    }
}
