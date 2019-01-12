package com.problems.solutions.module4.exceptionhandling;


/**
 * Created by nandigama on 1/9/2019.
 */
public class ArrayError {
    public void exceptionHandling(int[] ar) {
        try {
            for (int i = 0; i <= ar.length; i++) {
                System.out.println("array Element " + i + " is : " + ar[i]);
            }

        } catch (Exception e) {
            System.out.println("Exception is : " + e);
        }
    }

    public void exceptionHandling() throws ArrayIndexOutOfBoundsException {
        String[] s = {"a", "b" , "c"};
        for (int i = 0; i <= s.length; i++) {
            System.out.println("array Element " + i + " is : " + s[i]);
        }
    }

    public static void main(String[] args) {
        ArrayError error = new ArrayError();
        error.exceptionHandling(new int[]{1, 2, 3, 4, 5});

        try{
            error.exceptionHandling();
        }catch (Exception e) {
            System.out.println("Exception is " + e);
        }
    }
}
