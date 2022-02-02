package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //TILFØJ VARIABLER
        int correctNumber = 1 +(int)(Math.random() * 100);
        boolean numberIsCorrect = false;
        int attempts = 0;

        //MAIN
        while (!numberIsCorrect) {

            //SPØRG OM ET GÆT
            Scanner userNumberObj = new Scanner(System.in);
            System.out.println("Gæt på et tal mellem 1-100: ");
            int number = Integer.parseInt(userNumberObj.nextLine());

            //HVIS TAL ER MINDRE END DET KORREKTE TAL
            if (number < correctNumber) {
                System.out.println("Tallet er højere ");
            }

            //HVIS TAL ER STØRRE END DET KORREKTE TAL/home/irozage/KEA/Code/KEA-Code/february/Gæt tal1
            else if (number > correctNumber){
                System.out.println("Tallet er lavere ");
            }
            else {
            //HVIS TAL ER LIG DET KORREKTE TAL
                numberIsCorrect = true;
            }
            attempts++;
        }
        System.out.println("Korrekt! Du gættede tallet på " +attempts+ " forsøg!");
    }
}