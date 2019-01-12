package com.problems.solutions.module3.oops.classesandobjects;

/**
 * Created by nandigama on 1/8/2019.
 */
public class Student {
    private String name;
    private int rollNo;
    private String branch;

    public Student(String name, int rollNo, String branch) {
        this.name = name;
        this.rollNo = rollNo;
        this.branch = branch;
    }

    public String getName() {
        return name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public String getBranch() {
        return branch;
    }

    /**
     * printing student records
     * @param name
     * @param rollNo
     * @param branch
     * @param noOfStudents
     */
    public static void printStudentRecords(String[] name, int[] rollNo, String[] branch, int noOfStudents) {
        System.out.println("-----------------------------");
        System.out.println("ROLL NO" + "\t\t" + "NAME" + "\t\t" + "BRANCH");
        System.out.println("-----------------------------");
        for (int i = 0; i < noOfStudents; i++) {
            System.out.println(rollNo[i] + "\t\t\t" + name[i] + "\t\t\t" + branch[i]);
            System.out.println("-----------------------------");
        }
    }

    public static void main(String[] args) {
        Student student1 = new Student("AAA" , 1, "CSE");
        Student student2 = new Student("BBB" , 2, "IT");
        Student student3 = new Student("CCC" , 3, "EEE");
        int[] rollNo = {student1.getRollNo(), student2.getRollNo(), student3.getRollNo()};
        String[] name = {student1.getName(), student2.getName(), student3.getName()};
        String[] branch = {student1.getBranch(), student2.getBranch(), student3.getBranch()};
        printStudentRecords(name, rollNo, branch, 3);
    }
}
