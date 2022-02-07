package com.company;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    //DECLARE VARIABLES
    int age = 12;
    String name = "Mandu";
    double weight = 9.45;
    boolean isCat = true;
    Scanner sc = new Scanner(System.in);
    StringBuilder sb = new StringBuilder();

    //CONCATENATE VARIABLES WITH STRING BUILDER
    sb.append(name);
    sb.append(" er ");
    sb.append(age);
    sb.append(" år gammel, og vejer ");
    sb.append(weight);
    sb.append("kg.\nHans kattetilstand er: ");
    sb.append(isCat);
    System.out.println(sb);

    //CONCATENATE VARIABLES WITH + OPERATOR
    System.out.println(name + " er " + age + " år gammel, og vejer " + weight + "kg.");
    System.out.println("Hans kattetilstand er: " + isCat);
  }
}
