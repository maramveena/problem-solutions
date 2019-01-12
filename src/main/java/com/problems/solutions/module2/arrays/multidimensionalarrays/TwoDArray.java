package com.problems.solutions.module2.arrays.multidimensionalarrays;

import java.util.Scanner;

/**
 * Created by nandigama on 1/9/2019.
 */
public class TwoDArray {
    public static void main(String[] args) {
        int[][] ar = new int[2][2];
        int i , j;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 4 elemnts : ");
        for ( i = 0; i < 2; i++) {
            for (j = 0; j < 2; j++) {
                ar[i][j] = sc.nextInt();
            }
        }
        System.out.println("printing Elements in two dimentional array");
        for ( i = 0; i < 2; i++) {
            for (j = 0; j < 2; j++) {
                System.out.print(ar[i][j] + " ");
            }
            System.out.println();
        }
    }
}
