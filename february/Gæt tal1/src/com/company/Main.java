package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        int correctNumber = 1 +(int)(Math.random() * 100);

        boolean numberIsCorrect = false;

        while (!numberIsCorrect) {

            Scanner userNumberObj = new Scanner(System.in);
            System.out.println("Gæt på et tal mellem 1-100: ");
            int number = Integer.parseInt(userNumberObj.nextLine());

            if (number < correctNumber) {
                System.out.println("Tallet er højere ");
            }
            else if (number > correctNumber){
                System.out.println("Tallet er lavere ");
            }
            else {
                numberIsCorrect = true;
            }
        }
        System.out.println("Korrekt!");
    }
}