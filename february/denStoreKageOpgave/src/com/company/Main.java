package com.company;

public class Main {
  public static void main(String[] args) {

    //MEASURING UNITS
    String gram = "g";
    String deciLiter = "dl";
    String teaSpoon = "tsk";
    String minutes = "min.";
    String tempString = "C";

    //MAIN INGREDIENTS
    int eggs = 4;
    int sugar = 300;
    int milk = 2;
    int butter = 50;
    int flour = 250;
    int bakingPowder = 3;
    int vanillaSugar = 1;

    //TOPPING INGREDIENTS
    int tButter = 100;
    int coconutFlour = 150;
    int brownFarin = 225;
    float tMilk = 0.5f;

    //PROCEDURE VARIABLES
    int bakingTime = 20;
    int tempInt = 200;
    int bakingTimeMF = 5;
    int tempIntMF = 225;

    int numberOfPeople = 4;

    System.out.println("\nArla's drømmekage opskrift\n");

    //PRINT INGREDIENTS
    System.out.println("Ingredienser:\n");
    System.out.println("\t" + eggs + " Æg \n\t" + sugar + " " + gram + " Sukker\n\t" + milk + " " + deciLiter + " Mælk\n\t" +
        butter + " " + gram + " Smør\n\t" + flour + " " + gram + " Hvedemel\n\t" + bakingPowder + " " + teaSpoon + " Bagepulver\n\t"
        + vanillaSugar + " " + teaSpoon + " Vaniljesukker\n");

    //PRINT TOPPINGS
    System.out.println("Toppings:\n");
    System.out.println("\t" + tButter + " " + gram + " Smør\n\t" + coconutFlour + " " + gram +
        " Kokosmel (ca. 3¾ " + deciLiter + ")\n\t" + brownFarin + " " + gram + " Brun farin (ca. 4¼ " + deciLiter + ")\n\t"
          + tMilk + " " + deciLiter + " Mælk\n");

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
    System.out.println("\t1. Pisk æg og sukker lyst og luftigt.\n");
    System.out.println("\t2. Varm imens mælk og smør (lillefingervarmt).\n");
    System.out.println("\t3. Bland mel, bage pulver og vaniljesukker sammen. Vend det forsigtigt, " +
        "drysset gennem\n\ten sigte, i dejen skiftevis med mælkeblandingen.\n");
    System.out.println("\t4. Hæld dejen i en lille bradepande beklædt med bagepapir (ca. 5 x 22 x 30 cm)"
    + " og bag\n\tkagen midt i ovnen.\n");
    System.out.println("\t5. Kom smør, kokosmel, farin og mælk i en tykbundet gryde og bring det"
    + " i kog under\n\tomrøring.\n");
    System.out.println("\t6. Tag kagen ud (den skal være næsten færdigbagt) og skru op for ovnen."
    + " Fordel fyldet på\n\tkagen og bag den færdig, stadig midt i ovnen.\n");

    //VELBEKOMME!
    System.out.println("\nVelbekomme!");


  }
}
