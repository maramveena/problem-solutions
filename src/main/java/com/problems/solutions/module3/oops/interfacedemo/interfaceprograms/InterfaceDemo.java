package com.problems.solutions.module3.oops.interfacedemo.interfaceprograms;

/**
 * Created by nandigama on 1/9/2019.
 */
interface Interface1 {

    // public, static and final
    final int a = 10;

    // public and abstract
    void display();
}

// A class that implements interface.
public class InterfaceDemo implements Interface1 {
    // Implementing the capabilities of interface.
    public void display() {
        System.out.println("Interface demo ");
        System.out.println(a - 5);
    }

    public static void main(String[] args) {
        InterfaceDemo demo = new InterfaceDemo();
        demo.display();
        System.out.println(a);
    }
}
