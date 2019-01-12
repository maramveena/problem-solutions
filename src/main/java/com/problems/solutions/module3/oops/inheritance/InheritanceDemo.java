package com.edureka.assignments.module3.oops.inheritance;

/**
 * Created by nandigama on 1/9/2019.
 */
class BaseClass {
    int a = 200;
    public BaseClass() {
        System.out.println("in base classs");
    }
    void display() {
        System.out.println(a);
    }
}
public class InheritanceDemo extends BaseClass {
    public InheritanceDemo() {
        System.out.println("in derived class");
    }

    public static void main(String[] args) {
        InheritanceDemo demo = new InheritanceDemo();
        demo.display();
    }
}
