package com.company;

import java.util.Scanner;

public class RefactoringCodeExercise {
  public static void main(String[] args) {

    // Exercise: Refactor code to avoid redundancy
    // If you have extra time: Add a while loop (when should it stop?)

    System.out.println("How much money do you have left? ");
    Scanner scanner = new Scanner(System.in);
    int money = scanner.nextInt();
    int bet;

    while(money > 0) {
      if (money < 500) {
        System.out.println("You have $" + money + " left.");
        System.out.println("Cash is dangerously low. Bet carefully.");
        System.out.println("How much do you want to bet? ");
        //bet = scanner.nextInt();
      } else if (money < 1000) {
        System.out.println("You have $" + money + " left.");
        System.out.println("Cash is somewhat low. Bet moderately.");
        System.out.println("How much do you want to bet? ");
        //bet = scanner.nextInt();
      } else {
        System.out.println("You have $" + money + " left.");
        System.out.println("Cash is in good shape. Bet liberally.");
        System.out.println("How much do you want to bet? ");
        //bet = scanner.nextInt();
      }
      bet = scanner.nextInt();
      money = money - bet;
    }
  }
}


