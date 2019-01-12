package com.problems.solutions.module2.functions;

/**
 * Created by nandigama on 1/8/2019.
 */
public class PrimeOrNot {
    /**
     * find prime number or not
     * @param n Number
     * @return returns true if it is a prime number or returns false.
     */
    boolean isPrimeOrNot(int n) {
        boolean isPrime = true;
        for (int i = 2; i <= n/2; ++i)
            if(n % i == 0)
                isPrime = false;
        return isPrime;
    }

    boolean prime(int x)
    {
        boolean prime_no = true;

        for (int i = 2; i <= x/2; ++i)
            if (x % i == 0)
                prime_no = false;

        return prime_no;

    }
    public static void main(String[] args) {
        PrimeOrNot primeOrNot = new PrimeOrNot();
        System.out.println(primeOrNot.isPrimeOrNot(17));
        System.out.println(primeOrNot.prime(4));
    }
}
