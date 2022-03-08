package com.company;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Die die1 = new Die();
    StringBuilder sb = new StringBuilder();
    Scanner sc = new Scanner(System.in);

    int oneAmount = 0;
    int twoAmount = 0;
    int threeAmount = 0;
    int fourAmount = 0;
    int fiveAmount = 0;
    int sixAmount = 0;

    for(int i = 0; i <= 100; i++) {
      die1.roll();
      sb.append("Throw ").append(i).append(": ").append(die1.getFaceValue()).append("\n");
      switch (die1.getFaceValue()) {
        case 1 -> oneAmount++;
        case 2 -> twoAmount++;
        case 3 -> threeAmount++;
        case 4 -> fourAmount++;
        case 5 -> fiveAmount++;
        case 6 -> sixAmount++;
      }
    }
    System.out.printf("""
        ---------------------------
        RESULTS OF 100 DICE THROWS:
        ---------------------------
        Amount of 1's thrown: %d
        Amount of 2's thrown: %d
        Amount of 3's thrown: %d
        Amount of 4's thrown: %d
        Amount of 5's thrown: %d
        Amount of 6's thrown: %d
        ---------------------------
        """, oneAmount, twoAmount, threeAmount, fourAmount, fiveAmount, sixAmount);

    System.out.println("Display throws (y/n)?");
    String input = sc.nextLine();
    if (input.equals("y") || input.equals("Y")){
      System.out.println(sb);
    }
  }
}
