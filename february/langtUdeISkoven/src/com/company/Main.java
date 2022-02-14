package com.company;

public class Main {

  public void sang(){
    vers1();
    vers2();
    vers3();
    vers4();
    vers5();
    vers6();
    vers7();
    vers8();
    vers9();
    vers10();
    vers11();
  }

  public void vers1(){
    System.out.println("Langt ud' i soven lå et lille bjerg");
    System.out.println("Aldrig så jeg så dejligt et bjerg\n");
    omkvæd();
  }

  public void vers2(){
    System.out.println("På det lille bjerg der stod et lille træ");
    System.out.println("Aldrig så jeg så dejligt et træ\n");
    vers2Hook();
    omkvæd();
  }

  public void vers2Hook(){
    System.out.println("Træet på bjerget");
  }

  public void vers3(){
    System.out.println("På det lille træ der sad en lille gren");
    System.out.println("Aldrig så jeg så dejlig en gren\n");
    vers3Hook();
    omkvæd();
  }

  public void vers3Hook(){
    System.out.println("Grenen på træet");
    vers2Hook();
  }

  public void vers4(){
    System.out.println("På den lille gren der sad en lille kvist");
    System.out.println("Aldrig så jeg så dejlig en kvist\n");
    vers4hook();
    omkvæd();
  }

  public void vers4hook(){
    System.out.println("Kvisten på grenen");
    vers3Hook();
  }

  public void vers5(){
    System.out.println("På den lille kvist der sad et lille blad");
    System.out.println("Aldrig så jeg så dejligt et blad\n");
    vers5Hook();
    omkvæd();
  }

  public void vers5Hook(){
    System.out.println("Bladet på kvisten");
    vers4hook();
  }

  public void vers6(){
    System.out.println("På det lille blad der var en lille rede");
    System.out.println("Aldrig så jeg så dejlig en rede\n");
    vers6Hook();
    omkvæd();
  }

  public void vers6Hook(){
    System.out.println("Reden på bladet");
    vers5Hook();
  }

  public void vers7(){
    System.out.println("I den lille rede der var et lille æg");
    System.out.println("Aldrig så jeg så dejlig et æg\n");
    vers7Hook();
    omkvæd();
  }

  public void vers7Hook(){
    System.out.println("Æg'et i reden");
    vers6Hook();
  }

  public void vers8(){
    System.out.println("Af det lille æg der kom en lille fugl");
    System.out.println("Aldrig så jeg så dejlig en fugl\n");
    vers8Hook();
    omkvæd();
  }

  public void vers8Hook(){
    System.out.println("Fuglen af æg'et");
    vers7Hook();
  }

  public void vers9(){
    System.out.println("På den lille fugl der sad en lille fjer");
    System.out.println("Aldrig så jeg så dejlig en fjer\n");
    vers9Hook();
    omkvæd();
  }

  public void vers9Hook(){
    System.out.println("Fjeren på fuglen");
    vers8Hook();
  }

  public void vers10(){
    System.out.println("Af den lille fjer der blev en lille pude");
    System.out.println("Aldrig så jeg så dejlig en pude\n");
    vers10Hook();
    omkvæd();
  }

  public void vers10Hook(){
    System.out.println("Puden af fjeren");
    vers9Hook();
  }

  public void vers11(){
    System.out.println("På den lille pude der lå en lille dreng");
    System.out.println("Aldrig så jeg så dejlig en dreng\n");
    vers11Hook();

    omkvæd();
  }

  public void vers11Hook(){
    System.out.println("Drenge på puden");
    vers10Hook();
  }

  public void omkvæd(){
    System.out.println("Bjerget ligger langt ud' i skoven\n");
  }

  public static void main(String[] args) {

    Main obj = new Main();
    obj.sang();
  }
}
