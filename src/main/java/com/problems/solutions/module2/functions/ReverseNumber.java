package com.problems.solutions.module2.functions;

/**
 * Created by nandigama on 1/8/2019.
 */
public class ReverseNumber {
    /**
     * reverse a Number
     * @param n Number
     * @return returns reverse number
     */
    public static int reverseNumber(int n) {
        int reverse = 0;
        while (n != 0) {
            reverse = reverse * 10 ;
            reverse += n % 10;
            n /= 10;
        }
        return reverse;
    }

    /**
     * Reverse a Number using Recursion method (a function calling by it self -- recursion)
     * @param num Number
     * @return returns reversed number result of a number
     */
    static int result = 0;
    public static int reverseANumber(int num) {
        if(num == 0) {
            return 0;
        }
        result = result * 10 + num % 10;
        return reverseANumber(num / 10);
    }

    public static void main(String[] args) {
        System.out.println(reverseNumber(-123));
        reverseANumber(123);
        System.out.println(result);
    }
}
