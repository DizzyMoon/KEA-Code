package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //CREATE SCANNER OBJECT
        Scanner sc = new Scanner(System.in);

        //PRESENTATION
        System.out.println("Velkommen til Mikkel\'s tomme-beregner :)");
        System.out.print("Skriv et mål i tommer, som skal omregnes til centimeter: ");

        //DEFINE VARIABLE AND ASK FOR USER-INPUT
        float tommer = sc.nextFloat();

        //PRINT RESULT
        System.out.print("Mål i centimeter: "+ tommer * 2.54f);
    }
}
