package com.problems.solutions.module3.oops.classesandobjects;

import java.util.Scanner;

/**
 * Created by nandigama on 1/8/2019.
 */
public class EmployeeTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter No of employees:");
        int noOfEmployees = scanner.nextInt();
        int empId1;
        String name1;
        String dept1;
        double salary1;
        double HRA1;
        double DA1;
        double tax1;

        Employee [] employees = new Employee[noOfEmployees];
        for (int i = 0; i < noOfEmployees; i++) {
            System.out.println("Enter emp id " + i);
            empId1 = scanner.nextInt();
            System.out.println("Enter emp name " + i);
            name1 = scanner.next();
            scanner.nextLine();
            System.out.println("Enter emp dept " + i);
            dept1 = scanner.nextLine();
            System.out.println("Enter emp salary " + i);
            salary1 = scanner.nextDouble();
            System.out.println("Enter emp HRA " + i);
            HRA1 = scanner.nextDouble();
            System.out.println("Enter emp DA " + i);
            DA1 = scanner.nextDouble();
            System.out.println("Enter emp tax percentage " + i);
            tax1= scanner.nextDouble();
            employees[i] = new Employee(empId1, name1, dept1, salary1, HRA1, DA1, tax1);
        }

        for (Employee employee : employees) {
            employee.displayEmployeeRecords();
            System.out.println(employee.calculateSalary());
        }
    }
}
