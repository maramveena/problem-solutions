package com.edureka.assignments.module1.loops.whileloop;

/**
 * Created by nandigama on 1/11/2019.
 */
public class SumOfOddNumbers {
    public int sumOfOddNumbers(int n) {
        int result = 0;
        int sum = 0;
        while (n != 0) {
            result = n % 10;
            if(result % 2 != 0) {
                sum += result;
            }
            n /= 10;
        }
        return sum;
    }
}
