package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //CREATE OBJECTS
        Scanner heightObj = new Scanner(System.in);
        Scanner weightObj = new Scanner(System.in);

        //ASK AND READ USER HEIGHT
        System.out.print("Skriv din højde i cm: ");
        float height = Integer.parseInt(heightObj.nextLine());

        //ASK AND READ USER WEIGHT
        System.out.print("Skriv din vægt i kilo: ");
        float weight = Integer.parseInt(weightObj.nextLine());

        //CREATE VARIABLE BMI
        float BMI = weight / (height * height)*10000;

        //PRINT BMI
        System.out.println("Din BMI er: "+BMI);
    }
}
