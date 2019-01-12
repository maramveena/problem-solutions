package com.problems.solutions.module3.oops.classesandobjects;

import java.util.Scanner;

/**
 * Created by nandigama on 1/8/2019.
 */
public class Employee {
    private int empId;
    private String name;
    private String dept;
    private double salary;
    private double HRA;
    private double DA;
    private double tax;

    /**
     * This is a default constructor, sets with default Values
     */
    public Employee() {
        this.empId = empId;
        this.name = " ";
        this.dept = " ";
        this.salary = 0;
        this.HRA = 0;
        this.DA = 0;
        this.tax = 0;
    }

    /**
     * this is a parameterised constructor
     *
     * @param empId
     * @param name
     * @param dept
     * @param salary
     * @param HRA
     * @param DA
     * @param tax
     */
    public Employee(int empId, String name, String dept, double salary, double HRA, double DA, double tax) {
        this.empId = empId;
        this.name = name;
        this.dept = dept;
        this.salary = salary;
        this.HRA = HRA;
        this.DA = DA;
        this.tax = tax;
    }

    /**
     * This method accepts Data from user
     */
    public void acceptDataFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter emp id ");
        this.empId = scanner.nextInt();
        System.out.println("Enter emp name ");
        this.name = scanner.nextLine();
        scanner.nextLine();
        System.out.println("Enter emp dept ");
        this.dept = scanner.nextLine();
        System.out.println("Enter emp salary ");
        this.salary = scanner.nextDouble();
        System.out.println("Enter emp HRA ");
        this.HRA = scanner.nextDouble();
        System.out.println("Enter emp DA ");
        this.DA = scanner.nextDouble();
        System.out.println("Enter emp tax percentage ");
        this.tax = scanner.nextDouble();
        scanner.close();
    }

    public double calculateSalary() {
        double totalSalary = this.salary + HRA + DA;
        tax = (totalSalary * tax) / 100;
        return totalSalary - tax;
    }

    public void displayEmployeeRecords() {
        System.out.println("empId" + "\t\t name" + "\t\t dept" + "\t\tsalary" + "\t\tHRA" + "\t\tDA" + "\t\ttax");
        System.out.println("------------------------------------------------------------------------------------");
        System.out.println(empId + "\t\t  " + name + "\t\t  " + dept + "\t\t  " + salary + "\t\t  " + HRA + "\t\t  " + DA + "\t\t  " + tax);
        System.out.println("---------------------------------------------------------------------------------");
    }
}

