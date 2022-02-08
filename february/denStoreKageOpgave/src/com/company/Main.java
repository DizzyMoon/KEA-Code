package com.company;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    //USER DEPENDANT VARIABLES
    final int DEFAULT_PPL_NUM = 4;
    int numberOfPeople;
    Scanner sc = new Scanner(System.in);

    //PRESENTATION
    System.out.println("\nVelkommen til Mikkel's Java version af Arla's drømmekage opskrift :)\n");
    System.out.print("Hvor mange mennesker skal der laves til?: ");
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
    int eggs = numberOfPeople;
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
    float weightSum = eggs * EGG_WEIGHT + sugar * GRAM_WEIGHT + milk * DEC_WEIGHT +
        butter * GRAM_WEIGHT + flour * GRAM_WEIGHT + bakingPowder * TS_WEIGHT +
        vanillaSugar * TS_WEIGHT + tButter * GRAM_WEIGHT + coconutFlour * GRAM_WEIGHT +
        brownFarin * GRAM_WEIGHT + tMilk * DEC_WEIGHT;
    float tenPercentWeight = weightSum * 0.1f; //CALCULATE INGREDIENTS WEIGHT

    //PRINT INGREDIENTS
    System.out.println("\nIngredienser:\n");

    System.out.printf(
        """
            \t%d Æg\s
            \t%d %s Sukker
            \t%.1f %s Mælk
            \t%d %s Smør
            \t%d %s Hvedemel
            \t%.1f %s Bagepulver
            \t%.1f %s Vaniljesukker

            """,
        eggs, sugar, gram, milk, deciLiter, butter, gram, flour, gram, bakingPowder, teaSpoon, vanillaSugar, teaSpoon);


    //PRINT TOPPINGS
    System.out.println("Toppings:\n");

    System.out.printf(
        """
            \t%d %s Smør
            \t%d %s Kokosmel
            \t%d %s Brun Farin
            \t%.1f %s Mælk

            """,
        tButter, gram, coconutFlour, gram, brownFarin, gram, tMilk, deciLiter);

    //BAKING TIME
    System.out.println("Bagetid:\n\n\tCa. " + bakingTime + " " + minutes + " ved " + tempInt + tempString
        + " - traditionel ovn.\n");

    //BAKING TIME WITH FILLING
    System.out.println("Bagetid med fyld:\n");
    System.out.println("\tCa. " + bakingTimeMF + " " + minutes + " ved " + tempIntMF + tempString
        + " - traditionel ovn.\n");

    //GUIDE
    System.out.println("Sådan gør du:\n");
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

    //WEGHT DATA
    System.out.println("\nPraktisk info:");
    System.out.println("\n\tSamlede vægt af ingredienser: " + weightSum + " " + gram);
    System.out.println("\n\tSamlede vægt af kage: " + (weightSum - tenPercentWeight) + " " + gram);

    System.out.println("\n\nVELBEKOMME!");
  }
}
