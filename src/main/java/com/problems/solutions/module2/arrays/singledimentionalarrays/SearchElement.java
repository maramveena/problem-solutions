package com.edureka.assignments.module2.arrays.singledimentionalarrays;

import java.util.Scanner;

/**
 * Created by nandigama on 1/8/2019.
 */
public class SearchElement {
    /**
     * search Element in array
     * @param ar Array
     * @return returns true if find an element , otherwise returns false
     */
    public static boolean searchElementInArray(int[] ar, int searchNum) {
        for (int i = 0; i < ar.length; i++) {
            if (ar[i] == searchNum) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of Elements :");
        int noOfElements = sc.nextInt();
        int[] ar = new int[noOfElements];
        for (int i = 0; i < ar.length; i++) {
            System.out.println("Enter Element " + i);
            ar[i] = sc.nextInt();
        }
        System.out.println("Enter Number to find in Array");
        int searchNum = sc.nextInt();
        sc.close();
        System.out.println(searchElementInArray(ar, searchNum));
    }
}
