package com.company;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    public void methodTest(){
      System.out.println("Metode test");
    }

    //MISC VARIABLES
    final int DEFAULT_PPL_NUM = 4;
    int numberOfPeople;
    Scanner sc = new Scanner(System.in);

    //PRESENTATION
    System.out.println("\nVelkommen til Mikkel's Java version af Arla's drømmekage opskrift :)\n");
    System.out.print("Hvor mange mennesker skal der laves til?: ");
    numberOfPeople = sc.nextInt();

    //WEIGHT VARIABLES
    final int EGG_GRAM = 50;
    final int MILK_GRAM_PER_DECILITER = 100;
    final int SUGAR_GRAM = 1;
    final int BUTTER_GRAM = 1;
    final int FLOUR_GRAM = 1;
    final int COCONUT_FLOUR_GRAM = 1;
    final int BROWN_FARIN_GRAM = 1;
    final int BAKING_SODA_GRAM = 5;
    final int VANILLA_SUGAR_GRAM = 5;


    //MAIN INGREDIENTS
    int eggs = numberOfPeople;
    int gramSugar = 300 / DEFAULT_PPL_NUM * numberOfPeople;
    double dLMilk = 2.0 / DEFAULT_PPL_NUM * numberOfPeople;
    int gramButter = 50 / DEFAULT_PPL_NUM * numberOfPeople;
    int gramFlour = 250 / DEFAULT_PPL_NUM * numberOfPeople;
    double tskBakingSoda = 3.0 / DEFAULT_PPL_NUM * numberOfPeople;
    double tskVanillaSugar = 1.0 / DEFAULT_PPL_NUM * numberOfPeople;

    //TOPPING INGREDIENTS
    int gramTButter = 100 / DEFAULT_PPL_NUM * numberOfPeople;
    int gramCoconutFlour = 150 / DEFAULT_PPL_NUM * numberOfPeople;
    int gramBrownFarin = 225 / DEFAULT_PPL_NUM * numberOfPeople;
    double dLTMilk = 0.5 / DEFAULT_PPL_NUM * numberOfPeople;

    //PROCEDURE VARIABLES
    int bakingTime = 20;
    int tempInt = 200;
    int bakingTimeMF = 5;
    int tempIntMF = 225;

    //CALCULATE WEIGHT-SUM
    double weightSum = eggs * EGG_GRAM + gramSugar * SUGAR_GRAM + dLMilk * MILK_GRAM_PER_DECILITER +
        gramButter * BUTTER_GRAM + gramFlour * FLOUR_GRAM + tskBakingSoda * BAKING_SODA_GRAM +
        tskVanillaSugar * VANILLA_SUGAR_GRAM + gramTButter * BUTTER_GRAM + gramCoconutFlour * COCONUT_FLOUR_GRAM +
        gramBrownFarin * BROWN_FARIN_GRAM + dLTMilk * MILK_GRAM_PER_DECILITER;
    double tenPercentWeight = weightSum * 0.1; //CALCULATE CAKE-WEIGHT AFTER BAKING

    //PRINT INGREDIENTS
    System.out.println("\nIngredienser:\n");

    System.out.printf(
        """
            \tÆg................: %5d stk
            \tSukker............: %5d g
            \tMælk..............: %5.1f dL
            \tSmør..............: %5d g
            \tHvedemel..........: %5d g
            \tBagepulver........: %5.1f tsk
            \tVaniljesukker.....: %5.1f tsk

            """,
        eggs, gramSugar, dLMilk, gramButter, gramFlour, tskBakingSoda, tskVanillaSugar);


    //PRINT TOPPINGS
    System.out.println("Toppings:\n");

    System.out.printf(
        """
            \tSmør..............: %5d g
            \tKokosmel..........: %5d g
            \tBrun Farin........: %5d g
            \tMælk..............: %5.1f dL

            """,
        gramTButter, gramCoconutFlour, gramBrownFarin, dLTMilk);

    //BAKING TIME
    System.out.println("Bagetid:\n\n\tCa. " + bakingTime + " Minutter ved " + tempInt + "C - traditionel ovn.\n");

    //BAKING TIME WITH FILLING
    System.out.println("Bagetid med fyld:\n");
    System.out.println("\tCa. " + bakingTimeMF + " minutter ved " + tempIntMF + "C - traditionel ovn.\n");

    //GUIDE
    System.out.println("Sådan gør du:\n");
    System.out.println("""
        \t1. Pisk æg og sukker lyst og luftigt.
                
        \t2. Varm imens mælk og smør (lillefingervarmt).
                
        \t3. Bland mel, bage pulver og vaniljesukker sammen. Vend det forsigtigt, drysset gennem
        \t   en sigte, i dejen skiftevis med mælkeblandingen.
                
        \t4. Hæld dejen i en lille bradepande beklædt med bagepapir (ca. 5 x 22 x 30 cm) og bag
        \t   kagen midt i ovnen.
             
        \t5. Kom smør, kokosmel, farin og mælk i en tykbundet gryde og bring det i kog under
        \t   omrøring.
             
        \t6. Tag kagen ud (den skal være næsten færdigbagt) og skru op for ovnen. Fordel fyldet på
        \t   kagen og bag den færdig, stadig midt i ovnen.
        """);

    //WEIGHT DATA
    System.out.println("\nPraktisk info:");
    System.out.println("\n\tSamlede vægt af ingredienser: " + weightSum + " g");
    System.out.println("\n\tSamlede vægt af kage: " + (weightSum - tenPercentWeight) + " g");
    System.out.println("\n\nVELBEKOMME!");
  }
}