package com.company;

import javax.swing.*;

public class Main {
  public static void main(String[] args) {

    int uniqueNumber = 3387;
    int day = 7;
    String month = "february";
    int year = 2022;
    String name = "Jørgen Pind";
    float amount = 434.95f;
    String payMethod = "Visa";
    String seller = "M. Anager";
    String blank = "";

    name.

    System.out.printf("\n%24sUnique Number: %d\n", blank, uniqueNumber);
    System.out.printf("%24sDate: %s %d, %d\n", blank, month, day, year);

    System.out.printf("""
        
    Name:%19s%s
    Amount:%17s%.2f
    Method of Payment:      %s
                        
                            %s
                               
        """,blank, name, blank, amount, payMethod, seller);

  }
}
