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


  int i;
  public void coolCountDown(){
    for (i = 10; i > 0; i--){
      System.out.println("Count: " + i);
    }
    System.out.println("i = " + i);
  }

  public void execute(){
    System.out.println("Recursive countdown:");
    recursiveCountDown();
    System.out.println("The much cooler for-loop countdown");
    coolCountDown();
    System.out.println("The kinda cool While-loop countdown");
    loopWhile();
    System.out.println("The disgusting Do While-Loop countdown");
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
