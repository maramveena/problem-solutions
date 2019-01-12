package com.problems.solutions.module4.packagedemo2;


import com.problems.solutions.module4.packagedemo1.FactorialMethod;
import com.problems.solutions.module4.packagedemo1.OperatorsMethods;
import com.problems.solutions.module4.packagedemo1.ReverseNumberMethod;

/**
 * Created by nandigama on 1/9/2019.
 */
public class ImportClassFromAnotherPackage {

    public static void main(String[] args) {
        /**
         * importing OperatorsMethods class from another package,
         * calling that methods in this class
         */
        OperatorsMethods operator = new OperatorsMethods();
        System.out.println(operator.addition(10, 10));
        System.out.println(operator.substraction(20, 10));
        System.out.println(operator.multiplication(10, 10));
        System.out.println(operator.division(10, 10));
        /**
         * importing ReverseNumberMethod class from another package,
         * calling that methods in this class
         */
        ReverseNumberMethod reverse = new ReverseNumberMethod();
        System.out.println(reverse.reverseANumber(123));
        /**
         * importing FactorialMethod class from another package,
         * calling that methods in this class
         */
        FactorialMethod fact = new FactorialMethod();
        System.out.println(fact.factorial(5));
    }
}
