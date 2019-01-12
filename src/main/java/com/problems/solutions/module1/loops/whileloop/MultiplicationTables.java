package com.problems.solutions.module1.loops.whileloop;

/**
 * Created by nandigama on 1/7/2019.
 */
public class MultiplicationTables {
    public static void printMultiplicationTable(int n) {
        int i = 1;
        while (i < 11) {
            System.out.println(n + "\t*" + "\t" + i + "\t=\t" + (n * i));
            i++;
        }
    }

    public static void main(String[] args) {
        printMultiplicationTable(10);
    }

    /**
     * Created by nandigama on 1/7/2019.
     */
    public static class SumOfDigits {
        public static int sumOfDigitsInNumber(int n) {
            int sum = 0;
            for ( ; n != 0; ) {
                sum += n % 10;
                n /= 10;
            }
            return sum;
        }

        public static void main(String[] args) {
            System.out.println(sumOfDigitsInNumber(432));
        }
    }
}
