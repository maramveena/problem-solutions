package com.problems.solutions.module1.loops.forloop;

/**
 * Created by nandigama on 1/7/2019.
 */
public class ReverseNumber {

    public static int reverseDigitsOfNumber(int n) {
        int reverseNumber = 0;
        for (; n != 0; ) {
            reverseNumber = reverseNumber * 10 + n % 10;
            n /= 10;
        }
        return reverseNumber;
    }

    public static void main(String[] args) {
        System.out.println(reverseDigitsOfNumber(123));
    }
}
