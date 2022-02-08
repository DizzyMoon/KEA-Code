package com.company;

public class Main {
  public static void main(String[] args) {

    //DECLARE VARIABLES
    String tekst = "Mit navn er Mikkel";
    String ord = "er";

    
    int startIndex = tekst.indexOf(ord);
    int slutIndex = startIndex + ord.length();

    //PRINT NAME
    System.out.println("Start er: " + startIndex);
    System.out.println("Slut er: " + slutIndex);

    System.out.println("Ordet er: " + tekst.substring(startIndex, slutIndex));
  }
}
