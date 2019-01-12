package com.problems.solutions.module3.oops.polymorphism.methodoverloading;

import java.util.Arrays;

/**
 * Created by nandigama on 1/8/2019.
 */
public class PrintInDataAndStringData {
    /**
     * printing int array
     * @param arr Integer Array
     * @return returns Array
     */
    public static String printData(int[] arr) {
        return Arrays.toString(arr);
    }

    /**
     * printing String Array (method overloading)
     * @param str String Array
     */
    public static String printData(String[] str) {
       return Arrays.toString(str);
    }
    public static void main(String[] args) {
        System.out.println(printData(new int[] {1, 2, 3, 4}));
        System.out.println(printData(new String[] {"AAA", "BBB", "CCC", "DDD"}));
    }
}
