package com.edureka.assignments.module2.arrays.multidimensionalarrays;

import java.util.Arrays;

/**
 * Created by nandigama on 1/7/2019.
 */
public class PrintTwoDimensionalArray {

    public static void printingTwoDArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void printingTwoDArrayUsingForeach(int[][] arr) {
        for (int [] ar : arr) {
            System.out.println(Arrays.toString(ar));
        }
    }

    public static int[][] sumOfTwoDArray(int[][] arr1, int[][] arr2) {
        int[][] result = new int[arr1.length][arr1[0].length];
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[0].length; j++) {
                result[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] arr1 = {{10, 20, 30, 40, 50}, {30, 50, 70, 60, 80}};
        int[][] arr2 = {{10, 20, 30, 40, 50}, {30, 50, 70, 60, 80}};
        printingTwoDArrayUsingForeach(sumOfTwoDArray(arr1, arr2));

    }
}
