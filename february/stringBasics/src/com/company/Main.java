package com.company;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    //DECLARE VARIABLES

    Scanner sc = new Scanner(System.in);

    System.out.print("Skriv dit navn her ");
    String mitNavn = sc.nextLine();

    System.out.print("Skriv noget herre sejt: ");
    String sejt = sc.nextLine();

    String tekst = sejt + mitNavn;

    int startIndex = tekst.indexOf(mitNavn);
    int slutIndex = startIndex + mitNavn.length();

    //PRINT NAME
    System.out.println("Start er: " + startIndex);
    System.out.println("Slut er: " + slutIndex);

    System.out.println("Dit navn er: " + tekst.substring(startIndex, slutIndex));
    System.out.println ("Den seje sætning er: " + tekst.substring(0, startIndex));
  }
}
