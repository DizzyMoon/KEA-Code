package com.company;

public class Person {
  public String name;
  public int alder;

  public Person(String name, int alder){
    this.name = name;
    this.alder = alder;
  }

  public void hasBirthday(){
    alder++;
  }

  public String toString(){
    return name + ", " + alder;
  }

  public int getAlder() {
    return alder;
  }

  public String getName() {
    return name;
  }

  public void setAlder(int alder) {
    this.alder = alder;
  }

  public void setName(String name) {
    this.name = name;
  }
}
