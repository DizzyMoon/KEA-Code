package com.company;

import java.util.Scanner;

import static java.lang.Math.random;

public class lineBattle {

  int highestNumber;
  int lowestNumber;
  boolean gameOver = false;
  boolean playerTurn = true;
  int playerLocation = 10;
  int playerSoldierCount = 25;
  int playerAmmunition = 2500;

  int enemyLocation = -10;
  int enemySoldierCount = 25;
  int enemyAmmunition = 2500;
  Scanner sc = new Scanner(System.in);


  public int throwDice() {
    int roll = (int) (random() * (7 - 1) + 1);
    return roll;
  }

  public void moveEnemyForward(int roll) {
    if (roll % 2 == 0) {
      enemyLocation = enemyLocation + 1;
    } else {
      enemyLocation = enemyLocation + 2;
    }
  }

  public void movePlayerForward(int roll) {
    if (roll % 2 == 0) {
      playerLocation = playerLocation - 1;
    } else {
      playerLocation = playerLocation - 2;
    }
  }

  public void findHighestNumber(int number1, int number2) {

    //CALCULATE
    if (number1 < number2) {
      highestNumber = number2;
      lowestNumber = number1;
    } else {
      highestNumber = number1;
      lowestNumber = number2;
    }
  }

  public void scoutStatus() {

    findHighestNumber(playerLocation, enemyLocation);

    if (highestNumber - lowestNumber == 2) {
      System.out.println("SCOUT MESSAGE: ENEMY FORCES ARE ONLY TWO SPACES AWAY!");
    } else if (highestNumber - lowestNumber == 1) {
      System.out.println("SCOUT MESSAGE: ENEMY FORCES ARE ONLY ONE SPACE AWAY!");
    }
  }

  public void upkeep() {
    if (playerTurn) {
      playerTurn = false;
    } else {
      playerTurn = true;
      scoutStatus(); //UPKEEP BB ;^)
    }
  }

  public void actionForward() {
    if (playerTurn) {
      movePlayerForward(throwDice());
    } else {
      moveEnemyForward(throwDice());
    }

    //END OF TURN
    upkeep();
  }

  public void playerTurn() {
    System.out.println("WHAT'S YOUR MOVE?");
    String action = sc.nextLine();

    if (action.equals("f") || action.equals("F")) {
      System.out.println("FULL MARCH!");
      actionForward();
    } else if (action.equals("r") || action.equals("R")){
      System.out.println("TACTICAL RETREAT!");
      actionRetreat();
    }
  }

  public void enemyTurn(){

  }

  public void actionAttack(){
    
  }

  public void actionRetreat(){
    int roll = throwDice();
    int move;
    if (roll < 3) {
      move = 1;
    } else if (roll < 5){
      move = 2;
    } else {
      move = 3;
    }

    if (playerTurn){
      System.out.println("YOU ROLLED : " + roll);
      playerLocation = playerLocation + move;
      playerAmmunition = playerAmmunition + 250;
    } else {
      System.out.println("ENEMY ROLLED: " + roll);
      enemyLocation = enemyLocation - move;
      enemyAmmunition = enemyAmmunition + 250;
    }
  }

  public void execute() {


    System.out.println("WELCOME TO LINE BATTLE SOLDIER");

    while (!gameOver) {
      if (playerTurn) {
        playerTurn();
      } else {
        enemyTurn();
      }
    }
  }

  public static void main(String[] args) {
    new lineBattle().execute();
  }
}

