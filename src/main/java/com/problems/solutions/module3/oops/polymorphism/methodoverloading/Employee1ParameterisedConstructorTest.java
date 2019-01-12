package com.edureka.assignments.module3.oops.polymorphism.methodoverloading;

import java.util.Scanner;

/**
 * Created by nandigama on 1/9/2019.
 */
public class Employee1ParameterisedConstructorTest {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter No Of Employees: ");
        int noOfEmployees = sc.nextInt();
        int empId1;
        String empName1;
        double salary1;
        Employee1[] employees = new Employee1[noOfEmployees];
        for (int i = 0; i < noOfEmployees; i++) {
            System.out.println("Enter Employee Id ");
            empId1 = sc.nextInt();
            System.out.println("Enter Employee Name ");
            sc.nextLine();
            empName1 = sc.nextLine();
            System.out.println("Enter Employee Salary ");
            salary1 = sc.nextDouble();
            sc.nextLine();
            employees[i] = new Employee1(empId1, empName1, salary1);
        }

        System.out.println("Enter Name here to find record : ");
        String searchName = sc.nextLine();
        sc.close();

        System.out.println("ID" + "\tNAME" + "\tSALARY");
        for (Employee1 employee : employees) {
            employee.display();
        }
        System.out.println("=============");
        System.out.println("ID" + "\tNAME");
        for (Employee1 employee : employees) {
            employee.display1();
        }
        System.out.println("=============");
        System.out.println("ID" + "\tNAME" + "\tSALARY");
        for (Employee1 employee : employees) {
            employee.searchRecord(searchName);
        }


    }
}
