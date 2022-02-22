package com.company;

import java.util.Scanner;

public class Main {

  //GLOBAS VARIABLES
  String input;
  StringBuilder sb = new StringBuilder();
  Scanner sc = new Scanner(System.in);

  //METHODS
  public void printOneCharAtATime() {
    sb.setLength(0);
    int i;
    for (i = 0; i < input.length() - 1; i++) {
      System.out.println(input.charAt(i));
    }
    System.out.println(input.charAt(i));
  }

  public void starBlock(int width, int height) {
    for (int i = 0; i < height; i++) {
      for (int j = 0; j < width; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }

  public void multiplicationTable() {
    int i;
    int j;

    for (i = 1; i <= 10; i++) {
      for (j = 1; j <= 10; j++) {
        System.out.printf("%-5d", i*j);
      }
      System.out.println();
    }
  }

  public void yxLoop() {
    for (int x = 0; x < 3; x++) {
      for (int y = 0; y < 3; y++) {
        System.out.printf("x: %d, y:%d,", x, y);
      }
      System.out.println();
    }
  }

  public void findIndexOf() {
    System.out.println("Write search-character");

    char charAt = sc.nextLine().charAt(0);
    boolean found = false;

    for (int i = 0; i < input.length(); i++) {
      if (input.charAt(i) == charAt) {
        System.out.println(i);
        found = true;
      }
    }
    if (!found) {
      System.out.println("-1");
    }
  }

  public void reverseString() {
    sb.setLength(0);
    int i;

    for (i = input.length(); i > 0; i--) {
      sb.append(input.charAt(i - 1));
    }
    System.out.println(sb);
  }

  public void toUpperCase(String input) {
    sb.setLength(0);
    int uniC;

    for (int i = 0; i < input.length(); i++) {
      uniC = input.codePointAt(i);
      String toUni = Character.toString((char) uniC);
      String toUniUpper = Character.toString((char) uniC - 32);

      if ((uniC >= 97 && uniC <= 122) || uniC >= 224 && uniC <= 255) {
        if (!(input.charAt(i) == ' ')) {
          sb.append(toUniUpper);
        } else {
          sb.append(' ');
        }
      } else {
        sb.append(toUni);
      }
    }
    System.out.println(sb);
  }

  public void mOcKiFy() {
    sb.setLength(0);
    for (int i = 0; i < input.length() - 1; i += 2) {

      sb.append(input.substring(i, i + 1).toUpperCase());
      sb.append(input.substring(i + 1, i + 2).toLowerCase());
    }
    System.out.println(sb);
  }

  //EXECUTION
  public void execute() {
    System.out.println("Get user input: ");
    input = sc.nextLine();
    System.out.println("Print one char at a time");
    printOneCharAtATime();
    System.out.println("Print Mockification");
    mOcKiFy();
    System.out.println("To upper case function");
    toUpperCase(input);
    System.out.println("Print reverse string");
    reverseString();
    System.out.println("Print indexes");
    findIndexOf();
    System.out.println("yxLoop");
    yxLoop();
    starBlock(5, 7);
    System.out.println("Multiplication Table");
    multiplicationTable();
  }

  //MAIN
  public static void main(String[] args) {
    new Main().execute();
  }
}
