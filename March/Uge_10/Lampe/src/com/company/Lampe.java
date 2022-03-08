package com.company;

public class Lampe {
  boolean isOn;

  public Lampe(boolean isOn){
    this.isOn = isOn;
  }

  public void pressSwitch(){
    isOn = !isOn;
  }

  public Lampe(){
    isOn = false;
  }

  public void setOn(boolean on) {
    isOn = on;
  }

  public String toString() {
    return "" + isOn;
  }
}
