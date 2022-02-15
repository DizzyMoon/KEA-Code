package com.company;

import java.util.Scanner;

public class Main {

  public void writeCapitalized(String name) {
    StringBuilder sb = new StringBuilder();
    int start = 0;
    String capFirstLetter = name.substring(start, start + 1).toUpperCase();
    String restLetters = name.substring(start + 1).toLowerCase();

    sb.append(capFirstLetter);
    sb.append(restLetters);
    System.out.println("\n" + sb);
  }


  public static void main(String[] args) {
    Main obj = new Main();
    Scanner sc = new Scanner(System.in);

    System.out.print("Skriv dit navn her: ");
    String name = sc.nextLine();

    obj.writeCapitalized(name);

  }
}
