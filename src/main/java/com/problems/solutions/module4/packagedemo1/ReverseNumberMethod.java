package com.problems.solutions.module4.packagedemo1;

/**
 * Created by nandigama on 1/9/2019.
 */
public class ReverseNumberMethod {
    public int reverseANumber(int n) {
        int result = 0;
        while (n != 0) {
            result = result * 10 + n % 10;
            n /= 10;
        }
        return result;
    }
}