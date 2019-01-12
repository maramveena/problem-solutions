package com.edureka.assignments.module3.oops.polymorphism.methodoverloading;

import java.util.Scanner;

/**
 * Created by nandigama on 1/7/2019.
 */
public class Employee {

    public static void display(int[] empId, String[] name, double[] salary) {
        System.out.println("ID" + "\t" + "NAME" + "\t" + "SALARY");
        System.out.println("---------------------------");
        for (int i = 0; i < empId.length; i++) {
            System.out.println(empId[i] + "\t" + name[i] + "\t" + salary[i]);
        }
    }

    public static void display(int[] empId, String[] name) {
        System.out.println("ID" + "\t" + "NAME");
        System.out.println("---------------------------");
        for (int i = 0; i < empId.length; i++) {
            System.out.println(empId[i] + "\t" + name[i]);
        }
    }

    public static void display(String searchName, int[] empId, String[] name, double[] salary) {
        boolean notFound = false;
        for (int i = 0; i < name.length; i++) {
            if (name[i].equalsIgnoreCase(searchName)) {
                notFound = true;
                System.out.println("ID" + "\t" + "NAME" + "\t" + "SALARY");
                System.out.println("---------------------------");
                System.out.println(empId[i] + "\t" + name[i] + "\t" + salary[i]);
            }
        }
        if (!notFound) {
            System.out.println("Record not found");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter No Of Employees: ");
        int noOfEmployees = sc.nextInt();
        int[] empId = new int[noOfEmployees];
        String[] empName = new String[noOfEmployees];
        double[] salary = new double[noOfEmployees];

        for (int i = 0; i < noOfEmployees; i++) {
            System.out.println("Enter Employee Id " + i);
            empId[i] = sc.nextInt();
            System.out.println("Enter Employee Name " + i);
            sc.nextLine();
            empName[i] = sc.nextLine();
            System.out.println("Enter Employee Salary " + i);
            salary[i] = sc.nextDouble();
            sc.nextLine();
        }
        System.out.println("Enter Name here to find record : ");
        String searchName = sc.nextLine();
        sc.close();
        display(empId, empName, salary);
        System.out.println("====================");
        display(empId, empName);
        System.out.println("====================");
        display(searchName, empId, empName, salary);
    }
}
