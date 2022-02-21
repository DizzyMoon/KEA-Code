package com.company;

public class Main {

  public int counter = 10;

  public void recursiveCountDown(){
    if (counter > 0) {
      counter--;
      System.out.println("Count: " + counter);
      recursiveCountDown();
    }
  }

  public void coolCountDown(){
    for (int i = 10; i > 0; i--){
      System.out.println("Count: " + i);
    }
  }

  public void execute(){
    System.out.println("Recursive countdown:");
    recursiveCountDown();
    System.out.println("The much cooler for loop countdown");
    coolCountDown();
    System.out.println("While loop");
    loopWhile();
    System.out.println("Do While Loop");
    loopDoWhile();
  }

  public void loopWhile(){
    counter = 10;
    while (counter > 0){
      counter--;
      System.out.println("Count: " + counter);
    }
  }

  public void loopDoWhile(){

    counter = 10;
    do {
      counter--;
      System.out.println("Count: " + counter);
    } while(counter > 0);
  }

  public static void main(String[] args) {
    new Main().execute();
  }
}
