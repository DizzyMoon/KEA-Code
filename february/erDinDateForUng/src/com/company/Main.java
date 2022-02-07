package com.company;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    //DEFINE VARIABLES
    Scanner sc = new Scanner(System.in);
    boolean invalidAnswer = true;
    boolean writeNew = true;

    //PRESENTATION
    System.out.println("Velkommen til Mikkel's \"er din date for gammel?\" app <3");

    //GET USER INPUTS
    System.out.print("Skriv din alder her: ");
    int userAge = sc.nextInt();
    while (writeNew) { //REVERT POINT (IF USER WRITES JA WHEN PROMPTED)
      invalidAnswer = true; //RESET invalidAnswer
      System.out.print("Skriv din date's alder her: ");
      int dateAge = sc.nextInt();

      //CHECK IF DATE IS YOUNGER THAN USER
      if (dateAge < userAge) {
        int minimumAge = userAge / 2 + 7; //DEFINE MINIMUM AGE

        //CHECK IF DATE IS YOUNGER THAN MINIMUM AGE. PRINT RESULT
        while (invalidAnswer) { //REVERT POINT (IF USER INPUT IS INVALID)
          if (dateAge < minimumAge) {
            System.out.println("Din date er for ung :(");
            System.out.print("Skriv din date's alder igen? (ja/nej): ");
            String yesNo = sc.next();
            //CHECK IF USER WRITES YES OR NO
            if (yesNo.equals("nej")) {
              writeNew = false;
              invalidAnswer = false;
            } else if (yesNo.equals("ja")) {  //JUMP TO LINE 22
              invalidAnswer = false;
            } else {
              System.out.println("Skriv venligst \"ja\" eller \"nej\" i skrivefeltet");
            }
          } else {
            invalidAnswer = false;
            writeNew = false;
            System.out.println("Din date er ikke for ung ;)");
          }
        }
      } else {
        System.out.println("Din date er ikke for ung ;)");
      }
    }
  }
}
