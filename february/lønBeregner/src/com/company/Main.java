package com.company;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    //DECLARE VARIABLES
    Scanner sc = new Scanner(System.in);
    final double SALARY_PER_HOUR = 118.5;
    final double SALARY_BONUS = 1.5;
    final double AM_BIDRAG = 0.08;
    final int weeksPerYear = 52;
    final double A_SKAT = 0.37;
    int workHoursPerWeek;
    int extraHours;
    double weekSalaryPostTax;
    final double PERSON_FRADRAG = 46600.0 / weeksPerYear;

    //PRESENTATION
    System.out.println("Velkommen til Mikkel's lønberegner :)");

    //USER INPUT
    System.out.print("Antal timer arbejdet? ");
    workHoursPerWeek = Integer.parseInt(sc.nextLine());

    System.out.print("Extra timer? ");
    extraHours = Integer.parseInt(sc.next());

    //CALCULATE SALARY
    double extraSalary = extraHours * SALARY_PER_HOUR * SALARY_BONUS;
    double weekSalaryPreTax = workHoursPerWeek * SALARY_PER_HOUR + extraSalary;

    //CALCULATE TAX
    if (weekSalaryPreTax < PERSON_FRADRAG){
      weekSalaryPostTax = weekSalaryPreTax - weekSalaryPreTax * AM_BIDRAG;
    }
    else {
      weekSalaryPostTax = PERSON_FRADRAG + ((weekSalaryPreTax - weekSalaryPreTax * AM_BIDRAG) - PERSON_FRADRAG - ((weekSalaryPreTax - weekSalaryPreTax * AM_BIDRAG) - PERSON_FRADRAG) * A_SKAT);
    }

    //PRINT RESULT
    System.out.printf("Antal timer: %d\n", workHoursPerWeek);
    System.out.printf("Extra timer: %d\n\n", extraHours);

    System.out.printf("Bruttoløn: %.2f\n\n", weekSalaryPreTax);
    System.out.printf("Nettoløn: %.2f", weekSalaryPostTax);
  }
}
