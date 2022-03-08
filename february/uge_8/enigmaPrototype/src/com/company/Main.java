package com.company;

public class Main {

  char[]  alfabet = {'0', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L',
      'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'Æ', 'Ø', 'Å'};


  // modtage en char (bogstav) og returnere en int
  public int bogstavTilNummer(char bogstaverChar) {

    int i;
    for (i = 0; i < alfabet.length; i++) {
      int[] resultatInt = new int[alfabet.length];
      i = resultatInt[i];
      return i;
    }
    return -1;
  }

  // modtage en int og returnere en char(bogstav)
  public char talTilBogstav(int talInt){

    int[] talværdier = new int [alfabet.length];
    char c;
    for (c = 'A' ; c < alfabet.length ; c++) {
      c = alfabet[c];
    }
    return c;
  }



  public static void main (String[]args){

    Main obj = new Main();

    char charLetter = 'A';

    System.out.println(obj.bogstavTilNummer('A'));
    System.out.println(obj.talTilBogstav(2));
  }
}