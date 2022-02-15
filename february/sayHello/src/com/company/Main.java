package com.company;

import java.util.Scanner;

public class Main {

  public void presentPet(String firstName, String animalType, String animalName){
    System.out.printf("Mit navn er %s, jeg har en %s der hedder %s.", firstName, animalType, animalName);
  }


/*
  public void sayHello(String firstName){
    System.out.println("Hello, " + firstName);
  }

 */

  public static void main(String[] args) {
    Main obj = new Main();
    Scanner sc = new Scanner(System.in);

    System.out.println("Dit navn? ");
    String firstName = sc.nextLine();
    System.out.println("Type kæledyr? ");
    String animalType = sc.nextLine();
    System.out.println("Kæledyr navn? ");
    String animalName = sc.nextLine();

    obj.presentPet(firstName, animalType, animalName);
  }
}
