package com.problems.solutions.module2.functions;

/**
 * Created by nandigama on 1/8/2019.
 */
public class SwapTwoNumbers {
    public static void swapTwoNumbers(int x, int y) {
        System.out.println("Before Swapping : " + x + " " + y);
        int temp = x;
        x = y;
        y = temp;
        System.out.println("After Swapping : " + x + " " + y
        );
    }
    public static void main(String[] args) {
        swapTwoNumbers(2, 3);
    }
}
