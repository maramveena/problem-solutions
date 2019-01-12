package com.problems.solutions.module3.oops.finalkeyworddemo;

/**
 * Created by nandigama on 1/9/2019.
 */
public class FinalDemo {
    final int a = 20;
    final void finalDemo() {
        System.out.println("In the final Method, you can't override me");
    }
    public void finalDemo(int x) {
        System.out.println("overloading final- finalDemo method, now you can override me." + x);
    }

    public static void main(String[] args) {
        FinalDemo demo = new FinalDemo();
        demo.finalDemo();
        demo.finalDemo(10);
    }
}
