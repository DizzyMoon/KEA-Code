package demo;

public class Calculator {

  public int sum(int input1, int input2){
    if (input1 > 100 || input2 > 100){
      throw new IllegalArgumentException("Inputs must be smaller than 100");
    }
    return input1 + input2;
  }
}
