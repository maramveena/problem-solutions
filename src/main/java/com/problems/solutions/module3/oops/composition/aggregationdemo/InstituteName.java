package com.problems.solutions.module3.oops.composition.aggregationdemo;

import java.util.List;

/**
 * Created by nandigama on 1/10/2019.
 */
public class InstituteName {
    String instituteName;
    private List<Department> departments;

    InstituteName(String instituteName, List<Department> departments)
    {
        this.instituteName = instituteName;
        this.departments = departments;
    }

    // count total students of all departments
    // in a given institute
    public int getTotalStudentsInInstitute()
    {
        int noOfStudents = 0;
        List<ClassStudent> students;
        for(Department dept : departments)
        {
            students = dept.getStudentsList();
            for(ClassStudent s : students)
            {
                noOfStudents++;
            }
        }
        return noOfStudents;
    }
}
