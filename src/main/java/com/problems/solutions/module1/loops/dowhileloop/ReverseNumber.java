package com.edureka.assignments.module1.loops.dowhileloop;

/**
 * Created by nandigama on 1/7/2019.
 */
public class ReverseNumber {

    public static int reverseDigitsOfNumber(int n) {
        int reverseNumber = 0;
        do {
            reverseNumber = reverseNumber * 10 + n % 10;
            n /= 10;
        } while (n != 0);

        return reverseNumber;
    }

    public static void main(String[] args) {
        System.out.println(reverseDigitsOfNumber(123));
    }
}
