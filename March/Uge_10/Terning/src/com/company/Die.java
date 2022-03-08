package com.company;

public class Die {
  private int faceValue;

  public void setFaceValue(int faceValue) {
    this.faceValue = faceValue;
  }

  public int getFaceValue() {
    return faceValue;
  }

  public void roll(){
    faceValue = (int) (Math.random() * 6 + 1);
  }
}
