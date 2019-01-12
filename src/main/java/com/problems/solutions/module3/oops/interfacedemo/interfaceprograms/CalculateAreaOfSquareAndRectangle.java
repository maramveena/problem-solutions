package com.problems.solutions.module3.oops.interfacedemo.interfaceprograms;

/**
 * Created by nandigama on 1/9/2019.
 */
public class CalculateAreaOfSquareAndRectangle implements CalculateArea {
//    public CalculateAreaOfSquareAndRectangle(double length, double width) {
//        length =
//    }

    @Override
    public double area(double length, double width) {
        return  length * width;
    }
}
