package com.company;

public class Lampe {
  boolean isOn;

  public Lampe(boolean isOn){
    this.isOn = isOn;
  }

  public void trykPåKontakt(){
    if (isOn){
      isOn = false;
    } else {
      isOn = true;
    }
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
