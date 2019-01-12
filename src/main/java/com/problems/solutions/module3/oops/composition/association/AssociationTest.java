package com.problems.solutions.module3.oops.composition.association;

/**
 * Created by nandigama on 1/10/2019.
 */
public class AssociationTest {
    public static void main(String[] args) {
        BankName bName = new BankName("CHASE");
        EmployeeName employeeName = new EmployeeName("Veena");
        System.out.println(employeeName.empName + " is an employee of " + bName.bankName + " Bank.");
    }
}
