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

    boolean playerBombIsPlanted = false;
    boolean enemyBombIsPlanted = false;
    int turnsPassedSincePLant = 0;
    Scanner sc = new Scanner(System.in);

    public void pressAnyEnter() {
        System.out.println("PRESS ENTER TO CONTINUE");
        try {
            System.in.read();
        } catch (Exception e) {
        }
    }

    public void initiateGame() {
        System.out.println("BOTH PLAYERS MOVE FORWARD!");
        moveEnemyForward(throwDice());
        movePlayerForward(throwDice());
        pressAnyEnter();
    }

    public int throwDice() {
        int roll = (int) (random() * (7 - 1) + 1);
        return roll;
    }

    public void moveEnemyForward(int roll) {
        int move;
        if (roll % 2 == 0) {
            move = 1;
        } else {
            move = 2;
        }
        enemyLocation = enemyLocation + move;
        if (enemyLocation > 10) {
            enemyLocation = 10;
        }
    }

    public void movePlayerForward(int roll) {
        int move;

        if (roll % 2 == 0) {
            move = 1;
        } else {
            move = 2;
        }
        playerLocation = playerLocation - move;
        if (playerLocation < -10) {
            playerLocation = -10;
        }
        System.out.println("YOU MOVE " + move + " SPACES");
        System.out.println("YOUR LOCATION IS NOW: " + playerLocation);
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

        if (findDistance() == 2) {
            System.out.println("SCOUT MESSAGE: ENEMY FORCES ARE ONLY TWO SPACES AWAY!");
        } else if (findDistance() == 1) {
            System.out.println("SCOUT MESSAGE: ENEMY FORCES ARE ONLY ONE SPACE AWAY!");
        }
    }

    public void tickEnemyBombDown() {

        turnsPassedSincePLant = turnsPassedSincePLant + 1;
        System.out.println(10 - turnsPassedSincePLant + " TURNS REMAIN UNTIL BOMB EXPLODES!");

        if (turnsPassedSincePLant == 10) {
            System.out.println("KABOOM!");
            System.out.println("ENEMY BOMB HAS EXPLODED!");
            System.out.println("ENEMY WINS!");
            gameOver = true;
        }
    }

    public void tickPlayerBombDown() {
        turnsPassedSincePLant = turnsPassedSincePLant + 1;
        System.out.println(10 - turnsPassedSincePLant + " TURNS REMAIN UNTIL BOMB EXPLODES!");
        if (turnsPassedSincePLant == 10) {
            System.out.println("KABOOM!");
            System.out.println("YOUR BOMB HAS EXPLODED!");
            System.out.println("YOU WIN!");
            gameOver = true;
        }
    }

    public void upkeep() {

        //CHECK IF GAME HAS ENDED
        if (playerSoldierCount <= 0) {
            System.out.println("GAME OVER. ENEMY WINS!");
            gameOver = true;
        }

        if (enemySoldierCount <= 0) {
            System.out.println("GAME OVER. YOU WIN!");
            gameOver = true;
        }

        //CHECK BOMB STATUS
        if (enemyLocation == 10 && !enemyBombIsPlanted) {
            enemyBombIsPlanted = true;
            System.out.println("ENEMY BOMB HAS BEEN PLANTED!");
        }

        if (playerLocation == -10 && !playerBombIsPlanted) {
            playerBombIsPlanted = true;
            System.out.println("YOUR DEMOLITION SPECIALIST HAS PLANTED THE BOMB!");
        }

        if (enemyBombIsPlanted) {
            tickEnemyBombDown();
        }

        if (playerBombIsPlanted) {
            tickPlayerBombDown();
        }


        //END TURN
        if (playerTurn) {
            scoutStatus();
            playerTurn = false;
        } else {
            playerTurn = true;
        }
        pressAnyEnter();
    }

    public void actionForward() {
        if (playerTurn) {
            movePlayerForward(throwDice());
        } else {
            moveEnemyForward(throwDice());
        }
    }

    public void playerTurn() {
        System.out.println("WHAT'S YOUR MOVE? | (f)orward, (a)ttack, (r)etreat");
        String action = sc.nextLine();

        switch (action) {
            case "f", "F" -> {
                System.out.println("FULL MARCH!");
                actionForward();
            }
            case "r", "R" -> {
                System.out.println("TACTICAL RETREAT!");
                actionRetreat();
            }
            case "a", "A" -> {
                System.out.println("FIRE AT WILL!");
                actionAttack();
            }
        }
        upkeep();
    }

    public void enemyTurn() {
        int roll = throwDice();
        if (roll < 3) {
            System.out.println("ENEMY MOVES FORWARD!");
            actionForward();
        } else if (roll < 5) {
            System.out.println("ENEMY ATTACKS!");
            actionAttack();
        } else {
            System.out.println("ENEMY RETREATS!");
            actionRetreat();
        }
        upkeep();
    }

    public int findDistance() {
        findHighestNumber(playerLocation, enemyLocation);
        int distance = highestNumber - lowestNumber;
        return distance;
    }

    public void actionAttack() {
        findHighestNumber(playerLocation, enemyLocation);
        int roll = throwDice();
        int ammoCost = roll * 100;

        if (playerTurn) {

            if (playerAmmunition > 0) {
                playerAmmunition = playerAmmunition - ammoCost;
                System.out.println("YOU ROLLED A " + roll);
                System.out.println("YOU PAY " + ammoCost + " AMMUNITION");
                System.out.println("AMMO RESERVES ARE NOW AT: " + playerAmmunition);

                switch (findDistance()) {
                    case 0 -> {
                        enemySoldierCount = enemySoldierCount - 6;
                        System.out.println("POINT BLANK HIT! ");
                        System.out.println("YOU ELIMINATED 6 ENEMY SOLDIERS!");
                    }
                    case 1 -> {
                        enemySoldierCount = enemySoldierCount - 5;
                        System.out.println("HELLFIRE DECIMATES THE OPPONENT!");
                        System.out.println("YOU ELIMINATED 5 ENEMY SOLDIERS!");
                    }
                    case 2 -> {
                        enemySoldierCount = enemySoldierCount - 4;
                        System.out.println("YOU ELIMINATED 4 ENEMY SOLDIERS!");
                    }
                    case 3 -> {
                        enemySoldierCount = enemySoldierCount - 3;
                        System.out.println("YOU ELIMINATED 3 ENEMY SOLDIERS!");
                    }
                    case 4 -> {
                        enemySoldierCount = enemySoldierCount - 2;
                        System.out.println("YOU ELIMINATED 2 ENEMY SOLDIERS!");
                    }
                    case 5 -> {
                        enemySoldierCount = enemySoldierCount - 1;
                        System.out.println("YOUR MARKSMAN TAKES ONE WELL PLACED SHOT. A SMALL BUT NOT INSIGNIFICANT VICTORY.");
                        System.out.println("YOU ELIMINATED 1 ENEMY SOLDIER!");
                    }
                }
                System.out.println("ENEMY HAS " + enemySoldierCount + " SOLDIERS LEFT");
            } else {
                System.out.println("YOU ARE OUT OF AMMO!");
            }
        } else {
            if (enemyAmmunition > 0) {
                enemyAmmunition = enemyAmmunition - ammoCost;
                System.out.println("ENEMY ROLLED A " + roll);
                System.out.println("ENEMY PAYS " + ammoCost + " AMMUNITION");
                System.out.println("ENEMY AMMO RESERVE IS NOW AT " + enemyAmmunition);
                switch (findDistance()) {
                    case 0 -> {
                        playerSoldierCount = playerSoldierCount - 6;
                        System.out.println("ENEMY ELIMINATED 6 OF YOUR SOLDIERS!");
                    }
                    case 1 -> {
                        playerSoldierCount = playerSoldierCount - 5;
                        System.out.println("ENEMY ELIMINATED 5 OF YOUR SOLDIERS!");
                    }
                    case 2 -> {
                        playerSoldierCount = playerSoldierCount - 4;
                        System.out.println("ENEMY ELIMINATED 4 OF YOUR SOLDIERS!");
                    }
                    case 3 -> {
                        playerSoldierCount = playerSoldierCount - 3;
                        System.out.println("ENEMY ELIMINATED 3 OF YOUR SOLDIERS!");
                    }
                    case 4 -> {
                        playerSoldierCount = playerSoldierCount - 2;
                        System.out.println("ENEMY ELIMINATED 2 OF YOUR SOLDIERS!");
                    }
                    case 5 -> {
                        playerSoldierCount = playerSoldierCount - 1;
                        System.out.println("ENEMY ELIMINATED 1 OF YOUR SOLDIERS!");
                    }
                }
                System.out.println("YOU HAVE " + playerSoldierCount + " SOLDIERS LEFT");
            } else {
                System.out.println("YOU HEAR THE CLICKS OF RIFLES, BUT SEE NO MUZZLE FLARES");
                System.out.println("THE ENEMY MUST BE OUT OF AMMUNITION!");
            }
        }
    }

    public void actionRetreat() {
        int roll = throwDice();
        int move;
        if (roll < 3) {
            move = 1;
        } else if (roll < 5) {
            move = 2;
        } else {
            move = 3;
        }

        if (playerTurn) {
            System.out.println("YOU ROLLED A: " + roll);
            playerLocation = playerLocation + move;

            if (playerLocation > 10) {
                playerLocation = 10;
            }

            playerAmmunition = playerAmmunition + 250;
            System.out.println("YOUR LOCATION IS NOW " + playerLocation);
            System.out.println("YOU GAIN 250 AMMUNITION");
            System.out.println("AMMO RESERVES ARE NOW AT: " + playerAmmunition);
        } else {
            enemyLocation = enemyLocation - move;

            if (enemyLocation < -10) {
                enemyLocation = -10;
            }

            enemyAmmunition = enemyAmmunition + 250;
            System.out.println("ENEMY GAINS 250 AMMUNITION");
            System.out.println("ENEMY AMMO RESERVES ARE NOW AT: " + enemyAmmunition);
        }
    }

    public void execute() {
        System.out.println("WELCOME TO LINE BATTLE SOLDIER");
        pressAnyEnter();
        initiateGame();

        while (!gameOver) {
            if (playerTurn) {
                playerTurn();
            } else {
                enemyTurn();
            }
        }
        System.out.println("GAME OVER!");
    }

    public static void main(String[] args) {
        new lineBattle().execute();
    }
}