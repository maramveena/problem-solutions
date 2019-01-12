package com.problems.solutions.module3.oops.constructors;

/**
 * Created by nandigama on 1/12/2019.
 */
public class ThisKeywordDemo {
    private int empNo;
    private String name;
    private float sal;

    public ThisKeywordDemo() {
        System.out.println("Default constructor");
    }
    public ThisKeywordDemo(int empNo, String name) {
        this.empNo = empNo;
        this.name = name;
    }

    public ThisKeywordDemo(int a, String b, float sal) {
        this(a, b);
        this.sal = sal;
    }
   public void getDetails() {
        System.out.println(this.empNo + " | " + this.name + " | " + this.sal);
    }
}
class ThisKeyWordTest {
    public static void main(String[] args) {
        ThisKeywordDemo demo1 = new ThisKeywordDemo();
        ThisKeywordDemo demo2 = new ThisKeywordDemo(1,"veena",1000);
        ThisKeywordDemo demo3 = new ThisKeywordDemo(2, "nari");
        demo1.getDetails();
        demo2.getDetails();
        demo3.getDetails();
    }
}
