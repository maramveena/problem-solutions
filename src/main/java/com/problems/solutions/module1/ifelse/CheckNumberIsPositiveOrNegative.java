package com.edureka.assignments.module1.ifelse;

/**
 * Created by nandigama on 1/7/2019.
 */
public class CheckNumberIsPositiveOrNegative {
    public static void isNumberPositiveOrNegative(int num) {
        if(num > 0) {
            System.out.println("Number is Positive");
        } else {
            System.out.println("Number is negative");
        }
    }
    public static void isNumberZero(int num){
        if(num > 0 || num < 0) {
            System.out.println("Number is not Zero");
        } else {
            System.out.println("Number is Zero");
        }
    }
    public static void main(String[] args) {
        isNumberPositiveOrNegative(0);
        isNumberZero(-1);
    }
}
