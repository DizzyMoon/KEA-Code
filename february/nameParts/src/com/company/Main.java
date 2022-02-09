package com.company;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.print("Skriv dit fulde navn her: ");


    //DECLARE VARIABLES

    String name = sc.nextLine();
    int indexOfSpace = name.indexOf(" ");
    int indexOfLastSpace = name.lastIndexOf(" ");
    int secondSpace = name.indexOf(" ", name.indexOf(" ")) + 1;

    String fornavn = name.substring(0, indexOfSpace);
    String mellemnavn = name.substring(secondSpace, indexOfLastSpace);
    String efternavn = name.substring(indexOfLastSpace + 1);

    //PRINT NAME
      System.out.println("\nFornavn: " + fornavn);
      System.out.println("Mellemnavn: " + mellemnavn);
      System.out.println("Efternavn: " + efternavn);
  }
}
