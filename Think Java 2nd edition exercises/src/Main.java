package com.company;

import java.util.Scanner;

public class Main {
  public static void main(String[] args){

    //DECLARE VARIABLES
    int hour = 0;
    int minute = 0;
    int second = 0;
    Scanner sc = new Scanner(System.in);

    System.out.print("Hour?: ");
    hour = sc.nextInt();
    System.out.print("Minute?: ");
    minute = sc.nextInt();
    System.out.print("Second?: ");
    second = sc.nextInt();

    System.out.println("It's been " + (second + minute * 60 + hour * Math.pow(60 , 2)) + "seconds since midnight");
    System.out.println ("\nThere is " + ((60 - second) + (Math.pow(60, 2) - minute * 60) + (Math.pow(60, 2) * 24 - hour * Math.pow(60, 2))) + " seconds remaining of today.");

  }
}
