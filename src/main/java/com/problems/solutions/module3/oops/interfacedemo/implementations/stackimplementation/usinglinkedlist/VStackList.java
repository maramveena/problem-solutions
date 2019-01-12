package com.edureka.assignments.module3.oops.interfacedemo.implementations.stackimplementation.usinglinkedlist;

/**
 * Created by nandigama on 1/9/2019.
 */
public class VStackList implements VStackListInterface{
    class VStackNode {
        int data;
        VStackNode next;

        /**
         * this is a Constructor to set next value
         * @param d Number
         */
        public VStackNode(int d) {
            this.data = d;
        }
    }

    @Override
    public void push(int n) {

    }

    @Override
    public int pop() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }
}
