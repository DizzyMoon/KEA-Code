package com.company;

import java.util.Scanner;

public class Main {

    char[] alphabet = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z','Æ','Ø','Å'};

    public int arrayIndexOf(char[] arrayIn, char input){
        for(int i = 0; i < arrayIn.length; i++){
            if (arrayIn[i] == input){
                return i;
            }
        }
        return -1;
    }

    public int charToNum(char input) {
        if (!(input == ' ')) {
            return arrayIndexOf(alphabet, input) + 1;
        } else return 0;
    }

    public char numToChar(int input) {
        if (!(input == 0)) {
            return alphabet[input - 1];
        } else return ' ';
    }

    public void execute(){
        boolean validInput = false;
        Scanner sc = new Scanner(System.in);

        System.out.println("Do you want to (e)ncrypt or (d)ecrypt?");
        userChoice = sc.nextLine();
        while (!validInput) {
            if (userChoice.equals("e" || "E")) {
                validInput = true;
            } else if (userChoice.equals("d" || "D")) {
                validInput = true;
            } else {
                System.out.println("Please type either "e" or "d");
            }
        }
    }

    public static void main(String[] args) {
        new com.company.Main().execute();
    }
}
