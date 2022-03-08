package com.company;

public class Main {
  public static void main(String[] args) {
    Person person1 = new Person("Mikkel", 22);

    System.out.println(person1);
    person1.hasBirthday();
    System.out.println(person1);
  }
}
