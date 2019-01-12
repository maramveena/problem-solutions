package com.problems.solutions.module2.arrays.multidimensionalarrays;

/**
 * Created by nandigama on 1/8/2019.
 */
public class MatrixAddition {
    /**
     * Adding Two dimensional arrays
     *
     * @param ar1 Array1
     * @param ar2 Array2
     * @return returns the result of addition of 2 Arrays
     */
    public static int[][] addingTwoMatrices(int[][] ar1, int[][] ar2) {
        int[][] result = new int[ar1.length][ar1[0].length];
        for (int i = 0; i < ar1.length; i++) {
            for (int j = 0; j < ar1[0].length; j++) {
                result[i][j] = ar1[i][j] + ar2[i][j];
            }
        }
        return result;
    }

    public static void printingTwoDArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] ar1 = {{1, 2}, {3, 4}};
        int[][] ar2 = {{1, 2}, {3, 4}};
        printingTwoDArray(addingTwoMatrices(ar1, ar2));
    }
}
