package com.problems.solutions.module1.ifelse;

/**
 * Created by nandigama on 1/7/2019.
 */
public class LargestOfTwoNumbers {
    public static int largestOfTwoNums(int n1, int n2) {
        if(n1 > n2) {
            return n1;
        }
        return n2;
    }
    public static void main(String[] args) {
        System.out.println(largestOfTwoNums(3,2));
    }
}
