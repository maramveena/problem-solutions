package com.edureka.assignments.module3.oops.interfacedemo.implementations.stackimplementation.usinganarray;

import java.util.Scanner;

/**
 * Created by nandigama on 1/9/2019.
 */
public class ArrayStack implements ArrayStackInterface {
    int[] stack_arr = new int[10];
    int front = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 Elements : ");
        int x = sc.nextInt();
        ArrayStack stack = new ArrayStack();
        stack.push(x);
        x = sc.nextInt();
        stack.push(x);
        x = sc.nextInt();
        stack.push(x);
        System.out.println("Stack contains :");
        stack.display();
        System.out.println("Deleted element is : " + stack.pop());
        System.out.println("Deleted element is : " + stack.pop());
        System.out.println("Stack contains :");
        stack.display();
        sc.close();
    }

    /**
     * this method add an element to Stack
     * @param n Number
     */
    @Override
    public void push(int n) {
        stack_arr[front++] = n;
    }

    /**
     * this method remove an element from stack
     * @return returns removed element value
     */
    @Override
    public int pop() {
        return stack_arr[--front];
    }
    public void display() {
        for (int i = 0; i < front; i++) {
            System.out.print(stack_arr[i] + " ");
        }
        System.out.println();
    }
}
