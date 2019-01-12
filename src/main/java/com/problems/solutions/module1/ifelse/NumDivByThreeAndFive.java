package com.edureka.assignments.module1.ifelse;

/**
 * Created by nandigama on 1/10/2019.
 */
public class NumDivByThreeAndFive {

    /**
     * this method checks given number is divided by  3 0r 5 or both
     * @param n Given Number
     * @return returns fooboo if it is divided by both or
     * returns foo if it is divided by 3
     * or returns boo if it is divided  by 5
     * or returns Invalid.
     */
    public String numDivByThreeAndFive(int n) {
        if (n % 3 == 0 && n % 5 == 0) {
            return "fooboo";
        } else if (n % 3 == 0) {
            return "foo";
        } else if (n % 5 == 0) {
            return "boo";
        }
        return "Invalid";
    }
}
