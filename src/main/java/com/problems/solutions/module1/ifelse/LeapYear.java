package com.problems.solutions.module1.ifelse;

/**
 * Created by nandigama on 1/10/2019.
 */
public class LeapYear {
    public boolean isLeapYear(int year) {
        if(year <= 0) {
            return false;
        }
        if((year % 400 == 0 || year % 100 != 0) && (year % 4 == 0)) {
            return true;
        }
        return false;
    }
}
