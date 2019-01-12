package com.problems.solutions.module2.arrays.multidimensionalarrays;

/**
 * Created by nandigama on 1/8/2019.
 */
public class MatrixSubstraction {
    /**
     * substract elements in 2 matrices, it works ony for samelength of arrays
     * @param arr1 Array1
     * @param arr2 Array2
     * @return returns result of substracted Arrays
     */
    public static int[][] matrixSubstraction(int[][] arr1, int[][] arr2) {
        int[][] result = new int[arr1.length][arr1[0].length];
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[0].length; j++) {
                result[i][j] = arr1[i][j] - arr2[i][j];
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
        int[][] ar2 = {{1, 5}, {6, 7}};
        printingTwoDArray(matrixSubstraction(ar1, ar2));
    }
}
