package com.problems.solutions.module3.oops.polymorphism.carassignmentmodulethree;

import java.util.Scanner;

/**
 * Created by nandigama on 1/8/2019.
 */
public class MainForCar extends Car{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Type of Department :");
        String typeOfCar = sc.nextLine();
        if(typeOfCar.equals("merc")) {
            Car car = new Car();
            car.display();
            Car merc = new Merc();
            merc.display();
            Merc merc1 = new Merc();
            merc1.display();
        } else if(typeOfCar.equals("benz")) {
            Car car = new Car();
            car.display();
            Car benz = new Benz();
            benz.display();
            Benz benz1 = new Benz();
            benz1.display();
        }
    }
}
