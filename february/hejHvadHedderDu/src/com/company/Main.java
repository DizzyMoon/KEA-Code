package com.company;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    //DECLARE VARIABLES
    Scanner sc = new Scanner(System.in);
    String name;
    int age;
    String yesNo;
    boolean answerValid = false;

    //ASK FOR USER'S NAME
    System.out.print("Hejsa!\nHvad hedder du? ");
    name = sc.nextLine();

    //ASK FOR USER'S AGE
    System.out.print("Hej " + name + ", hvor gammel er du ? ");
    age = sc.nextInt();
    sc.nextLine();

    int birthYear = 2022 - age;

    //PRINT USER'S BIRTHYEAR AND ASK HOW THEY'RE DOING
    System.out.println("Hmm, så er du nok født i " + birthYear + ", eller måske i sidste halvdel af " + (birthYear - 1));
    System.out.print("Men går det ellers godt " + name + ", " + age + " år ? (j/n): ");

    //PRINT RESULT
    while (!answerValid) {
      yesNo = sc.nextLine();
      if (yesNo.equals("j") || yesNo.equals("ja")) {
        System.out.print("Det er godt at høre!");
        answerValid = true;
      } else if (yesNo.equals("n") || yesNo.equals("nej")) {
        System.out.print("Træls at høre");
        answerValid = true;
      } else {
        System.out.println("Svar venligst med \"j\" eller \"n\"");
      }
    }
  }
}
