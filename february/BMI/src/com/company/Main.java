package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //CREATE OBJECTS
        Scanner heightObj = new Scanner(System.in);
        Scanner weightObj = new Scanner(System.in);

        //ASK AND READ USER HEIGHT
        System.out.print("Skriv din højde i cm: ");
        float height = Float.parseFloat(heightObj.nextLine());

        //ASK AND READ USER WEIGHT
        System.out.print("Skriv din vægt i kilo: ");
        float weight = Float.parseFloat(weightObj.nextLine());

        //CREATE VARIABLE BMI
        float BMI = weight / (height * height)*10000;

        //PRINT BMI
        System.out.println("Din BMI er: "+BMI);

        //PRINT RESULT
        if (BMI<18.5){
            System.out.println("Du er undervægtig");
        }
        else if (BMI>=18.5 && BMI < 25){
            System.out.println("Du har en normal vægt");
        }

        else if (BMI > 25 && BMI < 30){
            System.out.println("Du er overvægtig");
        }

        else {
            System.out.println("Du er svært overvægtig");
        }
    }
}
