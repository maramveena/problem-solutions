package com.edureka.assignments.module1.loops.dowhileloop;

/**
 * Created by nandigama on 1/7/2019.
 */
public class MultiplicationTables {
    public static void printMultiplicationTable(int n) {
        int i = 1;
        do {
            System.out.println(n + "\t*" + "\t" + i + "\t=\t" + (n * i));
            i++;
        } while (i < 11);
    }

    public static void main(String[] args) {
        printMultiplicationTable(10);
    }
}
