package com.company;

public class MyDate {
  private int day;
  private int month;
  private int year;

  public void setToNextDay(){

    int[] dayAmount = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    int[] leapYear = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    boolean isLeapYear = false;

    if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0){
      isLeapYear = true;
    }

    if (!isLeapYear) {
      leapYear(dayAmount);
    } else {
      leapYear(leapYear);
    }
  }

  private void leapYear(int[] leapYear) {
    if (day < leapYear[month - 1]) {
      day++;
    } else {
      if (month < 12) {
        day = 1;
        month++;
      } else {
        day = 1;
        month = 1;
        year++;
      }
    }
  }

  public MyDate(int day, int month, int year){
    this.day = day;
    this.month = month;
    this.year = year;
  }

  public String toString(){
    return day + "/" + month + "/" + year;
  }

  public void setDay(int day) {
    this.day = day;
  }

  public void setMonth(int month) {
    this.month = month;
  }

  public void setYear(int year) {
    this.year = year;
  }

  public int getDay() {
    return day;
  }

  public int getMonth() {
    return month;
  }

  public int getYear() {
    return year;
  }
}
