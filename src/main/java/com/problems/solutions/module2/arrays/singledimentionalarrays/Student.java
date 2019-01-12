package com.edureka.assignments.module2.arrays.singledimentionalarrays;

import java.util.Scanner;

/**
 * Created by nandigama on 1/6/2019.
 */
public class Student {
    private String name;
    private int noOfSubjects;
    private int[] marks;
    private double avg;

    public Student(String name, int noOfSubjects, int[] marks) {
        this.name = name;
        this.noOfSubjects = noOfSubjects;
        this.marks = marks;
        averageOfMarks();
    }

    private int totalNoOfMarks() {
        int totalMarks = 0;
        for (int i = 0; i < noOfSubjects; i++) {
            totalMarks += marks[i];
        }
        return totalMarks;
    }

    private void averageOfMarks() {
        this.avg = (double) totalNoOfMarks() / noOfSubjects;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter No of Students :");
        int noOfStudents = sc.nextInt();
        Student[] students = new Student[noOfStudents];
        for (int j = 0; j < students.length; j++) {
            System.out.println("Enter Name Here :");
            String name = sc.nextLine();
            sc.nextLine();
            System.out.println("Enter No Of Subjects :");
            int noOfSubjects = sc.nextInt();
            int[] marks = new int[noOfSubjects];
            for (int i = 0; i < marks.length; i++) {
                System.out.println("Enter marks for subject here :");
                marks[i] = sc.nextInt();
            }
            Student student = new Student(name,noOfSubjects, marks);
            System.out.println(student.name);
            System.out.println(student.noOfSubjects);
            System.out.println(student.avg);
            students[j] = student;
        }
        sc.close();
    }
}
