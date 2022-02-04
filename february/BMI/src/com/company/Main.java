package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        //PRESENTATION
        System.out.println("Velkommen til Mikkel's BMI Beregner :)");

        //CREATE VARIABLES
        boolean invalidData = true;
        float height = 0;
        Scanner sc = new Scanner(System.in);


        //CHECK IF INPUT IS CORRECT
        while(invalidData) {

            //ASK AND READ USER HEIGHT
            System.out.print("Skriv din højde i meter: ");
            height = Float.parseFloat(sc.nextLine());

            //IF USER WROTE IN CENTIMETERS, RECALCULATE TO METERS
            if (height > 100){
                System.out.println("Din højde skal skrives i meter, ikke centimeter");

                boolean jaNejInvalid = true;

                //CHECK IF USER WRITES A VALID INPUT (YES OR NO)
                    while(jaNejInvalid) {

                        System.out.println("Mente du "+height/100+" meter? (ja/ nej)");
                        String ja_nej = sc.nextLine();

                        if (ja_nej.equals("ja")) {
                            height = height / 100;
                            invalidData = false;
                            jaNejInvalid = false;
                        }
                        else if (ja_nej.equals("nej")) {
                            jaNejInvalid = false;
                        }
                        else {
                            System.out.println("Skriv venligst \"ja\" eller \"nej\" i skrivefeltet:");
                        }
                    }
            }
            else {
                invalidData = false;
            }
        }

        //ASK AND READ USER WEIGHT
        System.out.print("Skriv din vægt i kilogram: ");
        float weight = Float.parseFloat(sc.nextLine());

        //CREATE VARIABLE BMI
        float BMI = weight / (height * height);

        //PRINT BMI
        System.out.println("Din BMI er: "+BMI);

        //PRINT RESULT
        if (BMI<18.5){
            System.out.println("Du er undervægtig :(");
        }
        else if (BMI>=18.5 && BMI < 25){
            System.out.println("Du har en normal vægt :)");
        }

        else if (BMI > 25 && BMI < 30){
            System.out.println("Du er overvægtig :(");
        }

        else {
            System.out.println("Du er svært overvægtig :(");
        }
    }
}
