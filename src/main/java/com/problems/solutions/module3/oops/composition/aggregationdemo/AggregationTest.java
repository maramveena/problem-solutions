package com.edureka.assignments.module3.oops.composition.aggregationdemo;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by nandigama on 1/10/2019.
 */
public class AggregationTest {
    public static void main(String[] args) {
        ClassStudent s1 = new ClassStudent("aaa", 1, "Ece");
        ClassStudent s2 = new ClassStudent("bbb", 2, "Ece");
        ClassStudent s3 = new ClassStudent("ccc", 1, "EEE");
        ClassStudent s4 = new ClassStudent("aaa", 2, "EEE");
        List<ClassStudent> ece_students = new ArrayList<>();
        ece_students.add(s1);
        ece_students.add(s2);
        List<ClassStudent> eee_students = new ArrayList<>();
        eee_students.add(s3);
        eee_students.add(s4);

        Department department1 = new Department("ECE", ece_students);
        Department department2 = new Department("EEE", eee_students);

        List <Department> departments = new ArrayList<Department>();
        departments.add(department1);
        departments.add(department2);
        // creating an instance of Institute.
        InstituteName instituteName = new InstituteName("UW", departments);
        System.out.println("Total Students in institute :");
        System.out.println(instituteName.getTotalStudentsInInstitute());

    }
}
