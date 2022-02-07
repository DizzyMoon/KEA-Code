package com.company;

import java.util.Scanner;

import java.util.Formatter;

public class Main {
  public static void main(String[] args) {

    final int DEFAULT_PPL_NUM = 4;
    int numberOfPeople;
    Scanner sc = new Scanner(System.in);

    System.out.println("\nVelkommen til Mikkel's Java version af Arla's drømmekage opskrift :)\n");
    System.out.print("Til hvor mange mennesker? (normal størrelse er til 4 personer): ");
    numberOfPeople = sc.nextInt();

    //MEASURING UNITS
    String gram = "g";
    String deciLiter = "dl";
    String teaSpoon = "tsk";
    String minutes = "min.";
    String tempString = "C";

    //WEIGHT VARIABLES
    final int EGG_WEIGHT = 50;
    final int GRAM_WEIGHT = 1;
    final int DEC_WEIGHT = 100;
    final int TS_WEIGHT = 5;

    //MAIN INGREDIENTS
    int eggs = 4 / DEFAULT_PPL_NUM * numberOfPeople;
    int sugar = 300 / DEFAULT_PPL_NUM * numberOfPeople;
    float milk = 2f / DEFAULT_PPL_NUM * numberOfPeople;
    int butter = 50 / DEFAULT_PPL_NUM * numberOfPeople;
    int flour = 250 / DEFAULT_PPL_NUM * numberOfPeople;
    float bakingPowder = 3f / DEFAULT_PPL_NUM * numberOfPeople;
    float vanillaSugar = 1f / DEFAULT_PPL_NUM * numberOfPeople;

    //TOPPING INGREDIENTS
    int tButter = 100 / DEFAULT_PPL_NUM * numberOfPeople;
    int coconutFlour = 150 / DEFAULT_PPL_NUM * numberOfPeople;
    int brownFarin = 225 / DEFAULT_PPL_NUM * numberOfPeople;
    float tMilk = 0.5f / DEFAULT_PPL_NUM * numberOfPeople;

    //PROCEDURE VARIABLES
    int bakingTime = 20;
    int tempInt = 200;
    int bakingTimeMF = 5;
    int tempIntMF = 225;



    //CALCULATE WEIGHT-SUM
    float weightSum = eggs * EGG_WEIGHT + sugar * GRAM_WEIGHT + milk * DEC_WEIGHT + butter * GRAM_WEIGHT + flour * GRAM_WEIGHT + bakingPowder * TS_WEIGHT + vanillaSugar * TS_WEIGHT +
        tButter * GRAM_WEIGHT + coconutFlour * GRAM_WEIGHT + brownFarin * GRAM_WEIGHT + tMilk * DEC_WEIGHT;

    float tenPercent = weightSum * 0.1f;




    //PRINT INGREDIENTS
    System.out.println("\nIngredienser:\n");
    System.out.println(
        "\t" + eggs + " Æg \n" +
            "\t" + sugar + " " + gram + " Sukker\n" +
            "\t" + milk + " " + deciLiter + " Mælk\n" +
            "\t" + butter + " " + gram + " Smør\n" +
            "\t" + flour + " " + gram + " Hvedemel\n" +
            "\t" + bakingPowder + " " + teaSpoon + " Bagepulver\n" +
            "\t" + vanillaSugar + " " + teaSpoon + " Vaniljesukker\n");

    //PRINT TOPPINGS
    System.out.println("Toppings:\n");
    System.out.println(
        "\t" + tButter + " " + gram + " Smør\n" +
            "\t" + coconutFlour + " " + gram + " Kokosmel\n" +
            "\t" + brownFarin + " " + gram + " Brun farin \n" +
            "\t" + tMilk + " " + deciLiter + " Mælk\n");

    //BAKING TIME
    System.out.println("Bagetid:\n\n\tCa. " + bakingTime + " " + minutes + " ved " + tempInt + tempString
        + " - traditionel ovn.\n");

    //BAKING TIME MF
    System.out.println("Bagetid med fyld:\n");
    System.out.println("\tCa. " + bakingTimeMF + " " + minutes + " ved " + tempIntMF + tempString
        + " - traditionel ovn.\n");

    //PROCEDURE
    System.out.println("Sådan gør du:\n");

    //STEPS
    System.out.println("""
        \t1. Pisk æg og sukker lyst og luftigt.
                
        \t2. Varm imens mælk og smør (lillefingervarmt).
                
        \t3. Bland mel, bage pulver og vaniljesukker sammen. Vend det forsigtigt, drysset gennem
                
        \t4. Hæld dejen i en lille bradepande beklædt med bagepapir (ca. 5 x 22 x 30 cm) og bag
        \t   kagen midt i ovnen.en sigte, i dejen skiftevis med mælkeblandingen.
             
        \t5. Kom smør, kokosmel, farin og mælk i en tykbundet gryde og bring det i kog under
        \t   omrøring.
             
        \t6. Tag kagen ud (den skal være næsten færdigbagt) og skru op for ovnen. Fordel fyldet på
        \t   kagen og bag den færdig, stadig midt i ovnen.
        """);

    System.out.println("\nPraktisk info:");
    System.out.println("\n\tSamlede vægt af ingredienser: " + weightSum + " " + gram);
    System.out.println("\n\tSamlede vægt af kage: " + (weightSum - tenPercent) + " " + gram);

    //VELBEKOMME!
    System.out.println("\nVelbekomme!");
  }
}
