package demo;

import java.util.ArrayList;

public class Controller {
  private ArrayList<String> nameList = new ArrayList<String>();
  public void run(){
    for (int i = 0; i < 10; i++) {
      System.out.println(throwDice());
    }
  }

  public void addToNameList(String in){
    nameList.add(in);
  }

  public int throwDice(){
    return (int) (Math.random() * 6 + 1);
  }

  public ArrayList<String> getNameList(){
    return nameList;
  }
}
