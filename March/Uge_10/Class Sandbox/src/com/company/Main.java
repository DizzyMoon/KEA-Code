package com.company;

public class Main {


  public static void main(String[] args) {
    /*Kunde kunde1 = new Kunde("Rasmus", "Alleen 14");
    Kunde kunde2 = new Kunde ("Tine", "Alleen 24");

    System.out.println(kunde1.getNavn() + ", " + kunde1.getAdresse());
    kunde1.setAdresse("Lets gooo");
    System.out.println(kunde1.getNavn() + ", " + kunde1.getAdresse());
     */

    Student student1 = new Student("Mikkel", 91239123, 30481742, false, 7);
    Student student2 = new Student("Simon", 99898968, 40216036, true, 12);

    System.out.println(student1);
    System.out.println(student2);
  }
}
