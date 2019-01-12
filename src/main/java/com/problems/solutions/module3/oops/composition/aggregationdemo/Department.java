package com.edureka.assignments.module3.oops.composition.aggregationdemo;

import java.util.List;

/**
 * Created by nandigama on 1/10/2019.
 */
public class Department {
    String name;
    private List<ClassStudent> students ;

    public Department(String name, List<ClassStudent> students) {
        this.name = name;
        this.students = students;
    }

    public List<ClassStudent> getStudentsList() {
        return students;
    }
}
