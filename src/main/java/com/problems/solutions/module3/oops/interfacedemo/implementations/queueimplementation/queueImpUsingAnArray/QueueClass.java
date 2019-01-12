package com.edureka.assignments.module3.oops.interfacedemo.implementations.queueimplementation.queueImpUsingAnArray;

import java.util.Scanner;

/**
 * Created by nandigama on 1/9/2019.
 */
public class QueueClass implements QueueInterface {
    int[] queue_arr = new int[10];
    int front = 0;
    int rear = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 elements here : ");
        int x = sc.nextInt();
        QueueClass q1 = new QueueClass();
        q1.add(x);
        x = sc.nextInt();
        q1.add(x);
        x = sc.nextInt();
        q1.add(x);
        System.out.println("Queue contains :");
        q1.display();
        System.out.println("Deleting 2 elments from Queue :");
        System.out.println("Deleted Element is : " + q1.remove());
        System.out.println("Deleted Element is : " + q1.remove());
        System.out.println("Queue contains :");
        q1.display();
    }

    /**
     * this method add an element to queue
     * @param n Number
     */
    @Override
    public void add(int n) {
        queue_arr[rear++] = n;
    }

    /**
     * this method removes an element from queue
     * @return returns removed element value
     */
    @Override
    public int remove() {
        return queue_arr[front++];
    }

    /**
     * this method prints values in queue
     */
    public void display() {
        for (int i = front; i < rear; i++) {
            System.out.print(queue_arr[i] + " ");
        }
        System.out.println();
    }
}
