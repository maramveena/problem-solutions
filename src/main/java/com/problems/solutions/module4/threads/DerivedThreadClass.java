package com.edureka.assignments.module4.threads;

/**
 * Created by nandigama on 1/9/2019.
 */
public class DerivedThreadClass extends Thread {
    public static void main(String[] args) {
        Thread t = Thread.currentThread();
        System.out.println("Base thread");
        System.out.println("First 20 Even Numbers are :");
            for (int i = 2 ; i <= 40; i += 2) {
                System.out.println(i);
            }
        System.out.println("child thraed");
        ChildThread ct = new ChildThread();
        ct.printMultiplicationTables(5);
    }
}
