package com.company;

import java.util.Scanner;

public class Main {

  String firstName;
  String middleName;
  String lastName;


  public void writeFullName(String lastName, String firstName, String middleName) {

    String fullName;

    if (middleName != "" && middleName != null) {
      fullName = firstName + " " + middleName + " " + lastName;
    } else {
      fullName = firstName + " " + lastName;
    }
    System.out.println(fullName);
  }

  public void writeNameParts(String fullName) {

    int indexOfSpace = fullName.indexOf(" ");
    int indexOfLastSpace = fullName.lastIndexOf(" ");
    int secondSpace = fullName.indexOf(" ", fullName.indexOf(" ")) + 1;

    firstName = fullName.substring(0, indexOfSpace);
    middleName = fullName.substring(secondSpace, indexOfLastSpace);
    lastName = fullName.substring(indexOfLastSpace + 1);

    //PRINT NAME
    System.out.println("\nFornavn: " + firstName);
    System.out.println("Mellemnavn: " + middleName);
    System.out.println("Efternavn: " + lastName);
  }


  public static void main(String[] args) {
    Main obj = new Main();
    Scanner sc = new Scanner(System.in);
    //obj.writeNameParts("Mikkel Aabo Simonsen");
    System.out.print("Fornavn: ");
    String firstName = sc.nextLine();
    System.out.print("Mellemnavn: ");
    String middleName = sc.nextLine();
    System.out.print("Last Name: ");
    String lastName = sc.nextLine();

    obj.writeFullName(lastName, firstName, middleName);
  }
}
