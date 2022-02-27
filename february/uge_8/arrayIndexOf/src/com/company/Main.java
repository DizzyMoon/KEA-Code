package com.company;

public class Main {

    public int arrayIndexOf(String[] arrayIn, String input){
        for(int i = 0; i < arrayIn.length; i++){
            if (arrayIn[i].equals(input)){
                return i;
            }
        }
        return -1;
    }

    public int arrayIndexOf(int[] arrayIn, int input){
        for(int i = 0; i < arrayIn.length; i++){
            if (arrayIn[i] == input){
                return i;
            }
        }
        return -1;
    }

    public int arrayIndexOf(double[] arrayIn, double input){
        for(int i = 0; i < arrayIn.length; i++){
            if (arrayIn[i] == input){
                return i;
            }
        }
        return -1;
    }

    public void execute(){

    }

    public static void main(String[] args) {
        new Main().execute();
    }
}
