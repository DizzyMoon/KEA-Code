package com.company;

public class Main {
  public static void main(String[] args) {
    Lampe lampe1 = new Lampe(true);
    Lampe lampe2 = new Lampe();

    System.out.println("--------TEST 1-----------");
    System.out.println("Lampe 1: " + lampe1.toString());
    lampe1.setOn(false);
    System.out.println("Lampe 1: " + lampe1.toString());
    System.out.println("Lampe 2: " + lampe2.toString());
    System.out.println("--------TEST 2-----------");

    System.out.println("Lampe 1 før tryk: " + lampe1.toString());
    lampe1.trykPåKontakt();
    System.out.println("Lampe 1 efter tryk: " + lampe1.toString());
  }
}
