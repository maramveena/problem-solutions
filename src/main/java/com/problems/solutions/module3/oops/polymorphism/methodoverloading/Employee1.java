package com.problems.solutions.module3.oops.polymorphism.methodoverloading;

/**
 * Created by nandigama on 1/9/2019.
 */

import java.util.Scanner;

public class Employee1 {
    private int empId;
    private String name;
    private double salary;
    private String searchName;

    public Employee1() {
        this.empId = empId;
        this.name = name;
        this.salary = salary;
    }

    public Employee1(int empId, String name, double salary) {
        this.empId = empId;
        this.name = name;
        this.salary = salary;
    }

    /**
     *
     */
    public void readUserFromInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Employee Id :");
        this.empId = scanner.nextInt();
        System.out.println("Enter Employee name :");
        this.name = scanner.next();
        scanner.nextLine();
        System.out.println("Enter Employee Salary :");
        this.salary = scanner.nextDouble();
        System.out.println("Enter name here to search :");
        this.searchName = scanner.nextLine();
        scanner.close();
    }

    /**
     *
     */

    public void display() {
        System.out.println("---------------------------");
        System.out.println(empId + " \t" + name + " \t" + salary);
    }

    /**
     * @param
     */
    public void searchRecord(String searchName) {
        // boolean notFound = false;
        if (this.name.equals(searchName)) {
            // notFound = true;
            display();
        }
//        if (!notFound) {
//            System.out.println("Record not found");
//        }
    }

    /**
     */
    public void display1() {
        System.out.println("---------------------------");
        System.out.println(empId + "\t" + name);
    }

    /**
     *
     * @param empId
     * @param name
     * @param salary
     */
    public void display(int empId, String name, double salary) {
        System.out.println("---------------------------");
        System.out.println(empId + "\t" + name + "\t" + salary);
    }

    /**
     *
     * @param empId
     * @param name
     */
    public void display(int empId, String name) {
        System.out.println("---------------------------");
        System.out.println(empId + "\t" + name);
    }

    /**
     *
     * @param searchName
     * @param empId
     * @param name
     * @param salary
     */
    public void display(String searchName, int empId, String name, double salary) {
        boolean notFound = false;
        if (name.equals(searchName)) {
            notFound = true;
            System.out.println("---------------------------");
            System.out.println(empId + "\t" + name + "\t" + salary);

        }
        if (!notFound) {
            System.out.println("Record not found");
        }

    }
}


