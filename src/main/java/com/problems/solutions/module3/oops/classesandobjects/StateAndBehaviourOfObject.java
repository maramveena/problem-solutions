package com.edureka.assignments.module3.oops.classesandobjects;

/**
 * Created by nandigama on 1/8/2019.
 */
public class StateAndBehaviourOfObject {
    private String name;
    private String email;
    private int phNo;

    public StateAndBehaviourOfObject(String name, String email, int phNo) {
        this.name = name;
        this.email = email;
        this.phNo = phNo;
    }

    public static boolean isValidNumber(String s) {
        if(s.length() != 10) {
            return false;
        }
        return true;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public int getPhNo() {
        return phNo;
    }

    public static void main(String[] args) {
        StateAndBehaviourOfObject obj = new StateAndBehaviourOfObject("veena", "mar.vv@gmail", 1233);
        System.out.println(obj.getEmail());
        System.out.println(obj.getName());
        System.out.println(obj.getPhNo());
        System.out.println(obj.email);
    }
}
