package com.edureka.assignments.module3.oops.constructors;

/**
 * Created by nandigama on 1/9/2019.
 */
public class StudentWithParameterisedConstructor {
    private int rollNo;
    private String name;
    private int rank;
    // parameterised constructor

    public StudentWithParameterisedConstructor(int rollNo, String name, int rank) {
        this.rollNo = rollNo;
        this.name = name;
        this.rank = rank;
        System.out.println("Student details : " + rollNo + " : " + name + " : " + rank);
    }

    public static void main(String[] args) {
        StudentWithParameterisedConstructor con = new StudentWithParameterisedConstructor(1,"veena", 1);
    }
}
