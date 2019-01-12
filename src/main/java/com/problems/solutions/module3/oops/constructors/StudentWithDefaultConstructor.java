package com.problems.solutions.module3.oops.constructors;

/**
 * Created by nandigama on 1/9/2019.
 */
public class StudentWithDefaultConstructor {
    private int rollNo;
    private String name;
    private int rank;
    // Default constructor
    public StudentWithDefaultConstructor() {
        this.rollNo = 0;
        this.name = " ";
        this.rank = 0;
        System.out.println("in the constructor of student");
    }

    public static void main(String[] args) {
        StudentWithDefaultConstructor con = new StudentWithDefaultConstructor();
    }
}
