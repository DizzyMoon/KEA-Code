package com.company;

import java.util.Scanner;

public class Main {

  String firstName;
  String middleName;
  String lastName;


  public void writeFullName(String lastName, String firstName) {
    writeFullName(lastName, firstName, null);
  }

  public void writeFullName(String lastName, String firstName, String middleName) {

    String fullName;
    if (!middleName.equals("") && middleName != null) {
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
    System.out.print("\nFornavn: ");
    writeCapitalized(firstName);
    System.out.print("Mellemnavn: ");
    writeCapitalized(middleName);
    System.out.print("Efternavn: ");
    writeCapitalized(lastName);
  }

  public void writeCapitalized(String name) {
    StringBuilder sb = new StringBuilder();
    int start = 0;
    String capFirstLetter = name.substring(start, start + 1).toUpperCase();
    String restLetters = name.substring(start + 1).toLowerCase();

    sb.append(capFirstLetter);
    sb.append(restLetters);
    System.out.print(sb + "\n");
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

/*
    System.out.print("Skriv dit fulde navn: ");
    String fullName = sc.nextLine();
    obj.writeNameParts(fullName);

 */
  }
}
