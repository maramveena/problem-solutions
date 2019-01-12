package com.edureka.assignments.module3.oops.interfacedemo.interfaceprograms;

/**
 * Created by nandigama on 1/9/2019.
 */
public class AreaOfTriangle implements Area1{
    public AreaOfTriangle() {
    }

    @Override
    public double area(double length, double width) {
        return (length * width) / 2;
    }

    @Override
    public double area(double radius) {
        return Math.PI * (radius * radius);
    }

    public static void main(String[] args) {
        CalculateAreaOfSquareAndRectangle areaOfSquareAndRectangle = new CalculateAreaOfSquareAndRectangle();
        AreaOfTriangle areaOfTriangle = new AreaOfTriangle();
        System.out.println(areaOfTriangle.area(5, 5));
        System.out.println(areaOfTriangle.area(2));
        System.out.println(areaOfSquareAndRectangle.area(6, 6));
    }
}
