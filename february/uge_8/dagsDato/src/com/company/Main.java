package com.company;

import java.time.LocalDate;

public class Main {

  public String dagsDato(int weekDay, int date, int month, int year) {
    String[] months = new String[]{"Januar", "Februar", "Marts", "April", "Maj", "Juni", "Juli", "August", "September", "Oktober", "November", "December"};
    String[] days = new String[]{"Mandag", "Tirsdag", "Onsdag", "Torsdag", "Fredag", "Lørdag", "Søndag"};

    return "Det er i dag " + days[weekDay - 1] + " den " + date + ". " + months[month - 1] + " " + year;
  }

  public void execute() {
    LocalDate today = LocalDate.now();
    int day = today.getDayOfWeek().getValue();
    int month = today.getMonth().getValue();
    int dayOfMonth = today.getDayOfMonth();
    int year = today.getYear();

    System.out.println(dagsDato(day, dayOfMonth, month, year));
  }

  public static void main(String[] args) {
    new Main().execute();

  }
}
