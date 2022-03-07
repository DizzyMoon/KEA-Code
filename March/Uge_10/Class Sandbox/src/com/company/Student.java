package com.company;

public class Student {
  String navn;
  int studieNummer;
  int mobilnummer;
  boolean tutor;
  int karakter;

  public Student(String navn, int studieNummer, int mobilnummer, boolean tutor, int karakter) {
    this.navn = navn;
    this.studieNummer = studieNummer;
    this.mobilnummer = mobilnummer;
    this.tutor = tutor;
    this.karakter = karakter;
  }

  public int getKarakter() {
    return karakter;
  }

  public void setKarakter(int karakter) {
    this.karakter = karakter;
  }

  public boolean getTutor() {
    return tutor;
  }

  public void setTutor(boolean tutor) {
    this.tutor = tutor;
  }

  public String getNavn() {
    return navn;
  }

  public int getStudieNummer() {
    return studieNummer;
  }

  public int getMobilnummer() {
    return mobilnummer;
  }

  public void setNavn(String navn) {
    navn = navn;
  }

  public void setStudieNummer(int studieNummer) {
    studieNummer = studieNummer;
  }

  public void setMobilnummer(int mobilnummer) {
    mobilnummer = mobilnummer;
  }

  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("-------------------------\n");
    sb.append("         ").append(navn.toUpperCase()).append("         \n");
    sb.append("-------------------------\n");
    sb.append("Student number: ").append(studieNummer).append("\n");
    sb.append("Phone: ").append(mobilnummer).append("\n");
    sb.append("Tutor: ").append(tutor).append("\n");
    sb.append("Karakter: ").append(karakter).append("\n");
    sb.append("-------------------------\n");
    return String.valueOf(sb);
  }
}