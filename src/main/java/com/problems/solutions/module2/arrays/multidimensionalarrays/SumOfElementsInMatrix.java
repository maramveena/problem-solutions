package com.edureka.assignments.module2.arrays.multidimensionalarrays;

/**
 * Created by nandigama on 1/8/2019.
 */
public class SumOfElementsInMatrix {
    /**
     * adding all the elements in a matrix
     *
     * @param ar Array
     * @return returns the result of sum elements
     */
    public static int sumOfElementsInMatrix(int[][] ar) {
        int result = 0;
        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar[0].length; j++) {
                result += ar[i][j];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {1, 2, 3}};
        System.out.println(sumOfElementsInMatrix(arr));
    }
}
