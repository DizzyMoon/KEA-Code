package com.company;

public class Main {

  //GLOBAL VARIABLES
  int counter = 0;
  String[] cards = new String[52];
  StringBuilder sb = new StringBuilder();

  public void opretAlleKort() {

    //DECLARE SUITS AND RANKS
    String[] suit = new String[]{"Hjerter ", "Ruder ", "Spar ", "Klør "};
    String[] ranks = new String[]{"es", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Knægt", "Dame", "Konge"};

    //CREATE DECK
    for (int i = 0; i <= 3; i++) {
      sb.setLength(0);
      sb.append(suit[i]);
      int j;
      for (j = 0; j <= 12; j++) {
        sb.setLength(suit[i].indexOf(" "));
        sb.append(" ").append(ranks[j]);
        cards[counter] = sb.toString();
        counter = counter + 1;
      }
    }
  }

  public void udskrivKort() {
    for (int i = 0; i <= 51; i++) {
      System.out.println(i + 1 + " - " + cards[i]);
    }
  }

  public void ombytToKort(int card1, int card2) {
    String temp;
    temp = cards[card1];
    cards[card1] = cards[card2];
    cards[card2] = temp;
  }

  //RANDOM NUMBER GENERATOR
  public int randomNum() {
    return (int) (Math.random() * 52);
  }

  public void blandKort() {

    //DECLARE VARIABLES
    String temp;
    int random1;
    int random2;

    //SHUFFLE CARDS
    for (int i = 0; i <= 52 * 5; i++) {
      random1 = randomNum();
      random2 = randomNum();
      temp = cards[random1];
      cards[random1] = cards[random2];
      cards[random2] = temp;
    }
  }

  //EXECUTE TEST OF ALL FUNCTIONS
  public void execute() {
    opretAlleKort();
    udskrivKort();
    System.out.println("------------OMBYT INDEX 2 (3) OG INDEX 4 (5)-------------");
    ombytToKort(2, 4);
    udskrivKort();
    System.out.println("------------BLAND TEST-----------------------------------");
    blandKort();
    udskrivKort();
  }

  public static void main(String[] args) {
    new Main().execute();
  }
}
