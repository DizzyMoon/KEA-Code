package com.company;

public class Main {
  public static void main(String[] args) {
    MyDate date = new MyDate(1, 2, 2024);
    System.out.println(date);
    for (int i = 0; i < 31; i++) {
      date.setToNextDay();
      System.out.println(date);
    }
  }
}
