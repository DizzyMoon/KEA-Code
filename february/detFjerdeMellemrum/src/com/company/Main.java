package com.company;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.print("Skriv en sætning med minimum 4 mellemrum: ");
    String text = sc.nextLine();
    String space = " ";
    int fourthSpace = text.indexOf(" ");

    for (int i = 0; i < 4-1; i++){
      fourthSpace = text.indexOf(space, fourthSpace + 1);
    }
    System.out.println("Det fjerde mellemrum er index " + fourthSpace);
    System.out.println("Ordet efter det fjerde mellemrum er: " + text.substring(fourthSpace + 1, text.indexOf()));
  }
}
