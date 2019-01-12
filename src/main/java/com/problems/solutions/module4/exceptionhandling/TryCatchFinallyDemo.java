package com.edureka.assignments.module4.exceptionhandling;

/**
 * Created by nandigama on 1/9/2019.
 */
public class TryCatchFinallyDemo {
    public static void main(String[] args) {
        try {
            int a = 34, b = 0;
            int result = a / b;
            System.out.println("the result is : " + result);
        } catch (Exception e) {
            System.out.println("Exception is : " + e);
        } finally {
            System.out.println("in the finally block");
        }
    }
}
