package com.company;

import java.util.Scanner;

public class Main {

  public void voidMethodTest(){
    System.out.println("\nThis was printed by a method\n");
  }

  public double doubleMethodTest(){
    Scanner sc = new Scanner(System.in);
    double x = sc.nextDouble();
    double y = sc.nextDouble();
    return x * y;
  }

  public static void main(String[] args) {
    Main obj = new Main();
    obj.voidMethodTest();
    System.out.println(obj.doubleMethodTest());
  }
}
