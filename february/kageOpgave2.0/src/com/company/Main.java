package com.company;

import java.util.Scanner;

public class Main {

  //GLOBAL VARIABLES
  int eggs;
  int gramSugar;
  double dLMilk;
  int gramButter;
  int gramFlour;
  double tskBakingSoda;
  double tskVanillaSugar;
  int gramTButter;
  int gramCoconutFlour;
  int gramBrownFarin;
  double dLTMilk;
  double weightSum = 0;
  StringBuilder sb = new StringBuilder();
  String spacing;

  //CREATES SPACING FOR CORRECT RIGHT-ADJUST
  public void createSpacing(String initiate) {
    sb = new StringBuilder();
    for (int i = 15 - initiate.length(); i != 0; i--) {
      sb.append(".");
    }
    sb.append(":");
    spacing = String.valueOf(sb);
  }

  public void printIngredient(String ingredientName, double amount, String measuringType) {
    createSpacing(ingredientName);
    System.out.printf("\t" + ingredientName + spacing + "%15.2f " + " " + measuringType + "\n", amount);
  }

  public void printIngredient(String ingredientName, int amount, String measuringType) {
    createSpacing(ingredientName);
    System.out.printf("\t" + ingredientName + spacing + "%15d " + " " + measuringType + "\n", amount);
  }

  public void calculateIngredients(int numberOfPeople) {

    final int DEFAULT_PPL_NUM = 4; //DECLARE DEFAULT

    //MAIN INGREDIENTS
    eggs = numberOfPeople;
    gramSugar = 300 / DEFAULT_PPL_NUM * numberOfPeople;
    dLMilk = 2.0 / DEFAULT_PPL_NUM * numberOfPeople;
    gramButter = 50 / DEFAULT_PPL_NUM * numberOfPeople;
    gramFlour = 250 / DEFAULT_PPL_NUM * numberOfPeople;
    tskBakingSoda = 3.0 / DEFAULT_PPL_NUM * numberOfPeople;
    tskVanillaSugar = 1.0 / DEFAULT_PPL_NUM * numberOfPeople;

    //TOPPING INGREDIENTS
    gramTButter = 100 / DEFAULT_PPL_NUM * numberOfPeople;
    gramCoconutFlour = 150 / DEFAULT_PPL_NUM * numberOfPeople;
    gramBrownFarin = 225 / DEFAULT_PPL_NUM * numberOfPeople;
    dLTMilk = 0.5 / DEFAULT_PPL_NUM * numberOfPeople;
  }

  public void displayIngredients() {

    //PRINT INGREDIENTS
    System.out.println("\nIngredienser:\n");
    printIngredient("Æg", eggs, "stk");
    printIngredient("Sukker", gramSugar, "g");
    printIngredient("Mælk", dLMilk, "dL");
    printIngredient("Smør", gramButter, "g");
    printIngredient("Hvedemel", gramFlour, "g");
    printIngredient("Bagepulver", tskBakingSoda, "tsk");
    printIngredient("Vaniljesukker", tskVanillaSugar, "tsk");

    //PRINT TOPPINGS
    System.out.println("\nToppings:\n");
    printIngredient("Smør", gramTButter, "g");
    printIngredient("Kokosmel", gramCoconutFlour, "g");
    printIngredient("Brun Farin", gramBrownFarin, "g");
    printIngredient("Mælk", dLTMilk, "dL");
  }

  public void displayGuide() {

    //DECLARE VARIABLES
    int bakingTime = 20;
    int tempInt = 200;
    int bakingTimeMF = 5;
    int tempIntMF = 225;

    //DISPLAY GUIDE
    System.out.println("\nSådan gør du:");
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

    //BAKING TIME
    System.out.println("Bagetid:\n\n\tCa. " + bakingTime + " Minutter ved " + tempInt + "C - traditionel ovn.\n");

    //BAKING TIME WITH FILLING
    System.out.println("Bagetid med fyld:\n");
    System.out.println("\tCa. " + bakingTimeMF + " minutter ved " + tempIntMF + "C - traditionel ovn.\n");
  }

  public double calculateAndDisplayIngredientWeightGram(String ingredientName, double amount, double unitToGram) {
    double weight = amount * unitToGram;
    createSpacing(ingredientName);
    System.out.printf("\t" + ingredientName + spacing + "%15.2f g" + "\n", weight);
    return weight;
  }

  public double addToTotalWeight(String ingredientName, double amount, double weight) {

    weightSum = weightSum + calculateAndDisplayIngredientWeightGram(ingredientName, amount, weight);

    return weightSum;
  }

  public void calculateAndDisplayTotalWeight() {
    System.out.println("Praktiske informationer: ");

    addToTotalWeight("Æg", eggs, 50);
    addToTotalWeight("Sukker", gramSugar, 1);
    addToTotalWeight("Mælk", dLMilk + dLTMilk, 10);
    addToTotalWeight("Smør", gramButter + gramTButter, 1);
    addToTotalWeight("Hvedemel", gramFlour, 1);
    addToTotalWeight("Bagepulver", tskBakingSoda, 5);
    addToTotalWeight("Vaniljesukker", tskVanillaSugar, 5);
    addToTotalWeight("Kokosmel", gramCoconutFlour, 1);
    addToTotalWeight("Brun Farin", gramBrownFarin, 1);
    System.out.printf("\n\tTotal vægt af ingredienser: %.2f g", weightSum);
    System.out.printf("\n\tTotal vægt af kage: %.2f g", calculateCakeWeight(weightSum));
  }

  public double calculateCakeWeight(double ingredientsWeight) {
    double cakeWeight = ingredientsWeight - ingredientsWeight * 0.1; //CALCULATE CAKE-WEIGHT AFTER BAKING
    return cakeWeight;
  }

  //MAIN
  public static void main(String[] args) {

    // DECLARE VARIABLES
    Scanner sc = new Scanner(System.in);
    Main obj = new Main();

    //PRESENTATION
    System.out.println("\nVelkommen til Mikkel's Java version af Arla's drømmekage opskrift :)\n");

    //GET USER INPUT
    System.out.print("Hvor mange mennesker skal der laves til?: ");
    int numberOfPeople = sc.nextInt();

    //CALCULATION
    obj.calculateIngredients(numberOfPeople);

    //DISPLAY RESULTS
    obj.displayIngredients();
    obj.displayGuide();

    //DISPLAY WEIGHT DATA
    System.out.println("Praktiske informationer:");
    obj.calculateAndDisplayTotalWeight();

    System.out.println("\n\nVELBEKOMME!");
  }
}