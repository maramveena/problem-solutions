package com.edureka.assignments.module3.oops.polymorphism.methodoverloading;

/**
 * Created by nandigama on 1/8/2019.
 */
public class CubeNumberIntAndDouble {
    /**
     * @param n Number
     * @return returns cube result of a number
     */
    public static int cubeNumber(int n) {
        return n * n * n;
    }

    /**
     * calculating cube of a number
     * @param d
     * @return returns cube result of a number
     */
    public static double cubeNumber(double d) {
        return d * d * d;
    }
    public static void main(String[] args) {
        System.out.println(cubeNumber(2));
        System.out.println(cubeNumber(2.0));
    }
}
