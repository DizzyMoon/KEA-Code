package com.company;

import java.util.Locale;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Skriv dit navn her: ");
        String text = sc.nextLine();

        String space = " ";
        StringBuilder sb = new StringBuilder();
        int start = 0;
        String capFirstLetter = text.substring(start, start + 1).toUpperCase();
        String restLetters = text.substring(start + 1).toLowerCase();


        sb.append(capFirstLetter);
        sb.append(restLetters);
        System.out.println("\n" + sb);
  }
}
