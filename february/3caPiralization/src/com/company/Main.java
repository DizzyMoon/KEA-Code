package com.company;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {


    Scanner sc = new Scanner(System.in);

    System.out.print("Skriv en tekst her: ");
    String text = sc.nextLine();

    StringBuilder sb = new StringBuilder();
    int start = 0;
    int thirdChar = 3-1;
    String threeUpper = text.substring(thirdChar, thirdChar + 1).toUpperCase();

    sb.append(text.substring(start, thirdChar));
    sb.append(threeUpper);
    sb.append(text.substring(3));
    System.out.println("\n" + sb);
  }
}
