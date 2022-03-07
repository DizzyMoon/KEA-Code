package com.company;


public class Kunde {

  public String getAdresse(){
    return adresse;
  }
  public String getNavn(){
    return navn;
  }

  public void setAdresse(String address){
    adresse = address;
  }

  public void setNavn(){
    navn = navn;
  }


  String navn;
  String adresse;

  public Kunde (String navn, String adresse) {
    this.navn = navn;
    this.adresse = adresse;
  }
}
