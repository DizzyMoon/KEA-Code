package com.company;

public class Main {



  public int charToNum(char input){
    char[] alphabet = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W', 'X', 'Y', 'Z'};
    return alphabet[input];
  }

  public char numToChar(int input){

    return 'A';
  }

  public void execute(){
    System.out.println(charToNum('D'));
  }

  public static void main(String[] args) {
    new Main().execute();
  }
}
