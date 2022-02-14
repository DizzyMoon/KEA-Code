package com.company;

import java.util.Scanner;

public class Main {

  double num1;
  double num2;
  double largestNumber;

  public void getUserInput() {
    Scanner sc = new Scanner(System.in);

    System.out.print("Skriv første tal: ");
    num1 = sc.nextDouble();
    System.out.print("Skriv andet tal: ");
    num1 = sc.nextDouble();
  }

  public void findLargestNumber() {
    largestNumber = Math.max(num1, num2);
  }

  public void displayLargestNumber() {
    System.out.printf("Det største tal er %f.2", largestNumber);
  }

  public static void main(String[] args) {
    Main obj = new Main();
    obj.getUserInput();
    obj.findLargestNumber();
    obj.displayLargestNumber();
  }
}
