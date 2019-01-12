package com.edureka.assignments.module4.threads;

/**
 * Created by nandigama on 1/9/2019.
 */
public class ChildThread {
    public void printMultiplicationTables(int n) {
        for (int i = 1; i < 11; i++)
            System.out.println(n + " * " + i + " = " + (n * i));
    }
}
