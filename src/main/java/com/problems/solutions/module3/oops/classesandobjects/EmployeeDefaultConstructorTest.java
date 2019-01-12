package com.edureka.assignments.module3.oops.classesandobjects;

/**
 * Created by nandigama on 1/8/2019.
 */
public class EmployeeDefaultConstructorTest {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.acceptDataFromUser();
        employee.displayEmployeeRecords();
        System.out.println(employee.calculateSalary());
    }
}
