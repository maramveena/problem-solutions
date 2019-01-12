package com.problems.solutions.module1.arthmeticoperators;

/**
 * Created by nandigama on 1/7/2019.
 */
public class PrimitiveDataTypes {
    public static void main(String[] args) {
        byte b = 10;
        short s = 12;
        int i = 100;
        long l = 120l;
        double d = 10;
        float f = 15f;
        char c = '\u0061';
        boolean isBoolean = true;

        System.out.println(b + s);
        System.out.println(s / b);
        System.out.println(l - i);
        System.out.println(d * f);
        System.out.println(c);

        if(isBoolean){
            isBoolean = false;
            System.out.println("isBoolean is True");
        }
        if(!isBoolean) {
            System.out.println("isBoolean is false");
        }

    }
}
