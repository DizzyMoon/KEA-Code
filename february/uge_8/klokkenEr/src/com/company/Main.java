package com.company;

import java.util.Scanner;

public class Main {

  public String talTilTekst(int num) {

    String temp = Integer.toString(num);
    String[] tal = new String[2];
    tal[0] = String.valueOf(temp.charAt(0));
    tal[1] = String.valueOf(temp.charAt(1));

    String[] etTilNitten = new String[]{"Et", "To", "Tre", "Fire", "Fem", "Seks", "Syv", "Otte", "Ni", "Ti", "Elve", "Tolv", "Tretten",
        "Fjorten", "Femten", "Seksten", "Sytten", "Atten", "Nitten"};
    String[] tiere = new String[]{"Tyve", "Tredive", "Fyrre", "Halvtreds", "Halvfjerds", "Firs", "Halvfems"};

    if (num < 20) {
      return etTilNitten[num - 1];
    } else {
      System.out.println("Første siffer: " + tal[0]);
      System.out.println("Andet siffer: " + tal[1]);
      return etTilNitten[Integer.parseInt(tal[1]) - 1] + "og" + tiere[Integer.parseInt(tal[0]) - 2];
    }
  }

  public void execute() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Indtast tal: ");
    int tal = sc.nextInt();
    System.out.println(talTilTekst(tal));
  }

  public static void main(String[] args) {
    new Main().execute();
  }
}
