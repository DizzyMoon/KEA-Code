package com.company;

public class Main {

  public static void main(String[] args) {

    //DEFINE VARIABLES
    StringBuilder sb = new StringBuilder();
    String harry = "Harry";
    String ron = "Ron";
    String hermione = "Hermione";
    String tekst;

    //GET CODE POINTS FOR EACH STRING
    for (int i = 1; i <= 3; i++) {
      sb.setLength(0); //RESET STRINGBUILDER

      //CHECK WHICH STRING TO GET CODEPOINTS FROM
      if (i == 1) {
        tekst = harry;
      } else if (i == 2) {
        tekst = ron;
      } else {
        tekst = hermione;
      }

      //GET CODEPOINTS
      char haFirstLetter = tekst.charAt(0);
      char haSecondLetter = tekst.charAt(1);
      sb.append((int) haFirstLetter).append(" ");
      sb.append((int) haSecondLetter);

      //PRINT RESULT
      System.out.println(sb);
    }
  }
}
