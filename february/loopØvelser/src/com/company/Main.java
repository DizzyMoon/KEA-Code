package com.company;

public class Main {

  public void printZeroToNine(){
   for (int i = 0; i < 10; i++){
     System.out.println(i);
   }
  }

  public void printOneToTen(){
    for (int i = 1; i < 10 + 1; i++){
      System.out.println(i);
    }
  }

  public void printZeroToEleven(){
    for (int i = 0; i < 11 + 1; i++){
      System.out.println(i);
    }
  }

  public void printTenToZero(){
    for (int i = 10; i > 0 - 1; i--) {
      System.out.println(i);
    }
    System.out.println("LIFTOFF!");
  }

  public void printUnevenNumbers(){
    for (int i = 1; i < 20; i+=2){
      System.out.println(i);
    }
  }

  public void ohGodWhy() {
    for (int i = 1; i < 16777216 + 1; i*=2){
      System.out.println(i);
    }
  }

  public void printInThreeSteps(){
    for (int i = 111; i < 138 + 1; i += 3){
      System.out.println(i);
    }
  }

  public void printInTenSteps(){
    for (int i = 100; i > -1; i -= 10){
      System.out.println(i);
    }
  }

  public void printInElevenSteps(){
    for (int i = 999; i > 0; i -= 11){
      System.out.println(i);
    }
  }

  public void execute(){
    System.out.println("PRINT 0 TO 9");
    printZeroToNine();
    System.out.println("PRINT 1 TO 10");
    printOneToTen();
    System.out.println("PRINT 0 TO 11");
    printZeroToEleven();
    System.out.println("PRINT 10 TO 0");
    printTenToZero();
    System.out.println("PRINT UNEVEN NUMBERS FROM 1 TO 19");
    printUnevenNumbers();
    System.out.println("OH GOD WHY");
    ohGodWhy();
    System.out.println("PRINT IN 3 STEPS FROM 111 TO 138");
    printInThreeSteps();
    System.out.println("PRINT IN STEPS OF 10 FROM 100 TO 0");
    printInTenSteps();
    System.out.println("PRINT IN STEPS OF 11 FROM 999 TO 0");
    printInElevenSteps();
  }

  public static void main(String[] args) {
    new Main().execute();
  }
}
