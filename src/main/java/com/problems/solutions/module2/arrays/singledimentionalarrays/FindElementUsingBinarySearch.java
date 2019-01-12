package com.problems.solutions.module2.arrays.singledimentionalarrays;

/**
 * Created by nandigama on 1/11/2019.
 */
public class FindElementUsingBinarySearch {

     /**
     * Find and return index of given number.
     * @param ar Array of integer values
     * @param n search Number
     * @return index value if it is find otherwise returns -1
     */
    public int findElementInSortedArray(int[] ar, int n) {
        if(ar == null || ar.length == 0) {
            return -1;
        }
        int start = 0, end = ar.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if(ar[mid] == n) {
                return mid;
            }
            if(n > ar[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        FindElementUsingBinarySearch search = new FindElementUsingBinarySearch();
        System.out.println(search.findElementInSortedArray(new int[] {-1, -2, -3, -4}, -1));
    }
}
