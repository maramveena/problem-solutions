package com.problems.solutions.module1.loops.whileloop;

/**
 * Created by nandigama on 1/7/2019.
 */
public class SumOfDigits {
    public static int sumOfDigitsInNumber(int n) {
        int sum = 0;
        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sumOfDigitsInNumber(432));
    }
}
