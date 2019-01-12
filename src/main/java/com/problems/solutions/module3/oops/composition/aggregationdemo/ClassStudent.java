package com.problems.solutions.module3.oops.composition.aggregationdemo;

/**
 * Created by nandigama on 1/10/2019.
 */
public class ClassStudent {
    /**
     * It is a special form of Association where:
     * It represents Has-A relationship.
     * It is a unidirectional association i.e. a one way relationship.
     * For example, department can have students but vice versa is not possible and thus unidirectional in nature.
     * In Aggregation, both the entries can survive individually which means ending one entity will not effect the other entity
     */
    String name;
    int id;
    String branch;

    public ClassStudent(String name, int id, String branch) {
        this.name = name;
        this.id = id;
        this.branch = branch;
    }
}
