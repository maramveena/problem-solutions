package com.problems.solutions.module3.oops.interfacedemo.implementations.stackimplementation.usinganarraylist;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;
import java.util.Scanner;

/**
 * Created by nandigama on 1/10/2019.
 */
public class AListStack implements AListStackInterface {

    class AListNode {
        int data;
        AListNode next;
        AListNode(int x) {
            this.data = x;
        }
    }

    AListNode top;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Elements here");
        int x = sc.nextInt();

    }
    @Override
    public void push(int val) {
        AListNode temp = new AListNode(val);
        temp.next = top;
        top = temp;
    }

//    @Override
//    public int pop()  {
//        if(isEmpty()) {
//        }
//        return top.;
//        top = top.next;
//    }

    @Override
    public boolean isEmpty() {
        return top == null;
    }
}
