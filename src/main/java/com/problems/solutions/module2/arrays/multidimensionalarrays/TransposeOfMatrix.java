package com.edureka.assignments.module2.arrays.multidimensionalarrays;

/**
 * Created by nandigama on 1/8/2019.
 */
public class TransposeOfMatrix {
    /**
     *  swapping two dimensional array rows to columns and columns to rows (Trnspose Of Matrix)
     * @param ar Array
     * @return returns transpose of Matrix Array
     */
    public static int[][] transPoseOfMatrix(int[][] ar) {
        int[][] tArray = new int[ar[0].length][ar.length];
        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar[0].length; j++) {
                tArray[j][i] = ar[i][j];
            }
        }
        return tArray;
    }
    public static void main(String[] args) {
        int[][] ar1 = {{1, 2}, {3, 4}};
        System.out.println("Before Transpose : ");
        PrintTwoDimensionalArray.printingTwoDArray(ar1);
        System.out.println("After Transpose : ");
        PrintTwoDimensionalArray.printingTwoDArray(transPoseOfMatrix(ar1));
    }
}
