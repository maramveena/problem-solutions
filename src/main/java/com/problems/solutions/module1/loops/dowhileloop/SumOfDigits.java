package com.problems.solutions.module1.loops.dowhileloop;

/**
 * Created by nandigama on 1/7/2019.
 */
public class SumOfDigits {
    public static int sumOfDigitsInNumber(int n) {
        int sum = 0;
        do {
            sum += n % 10;
            n /= 10;
        } while (n != 0);

        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sumOfDigitsInNumber(123));
    }
}
