package demo;

import java.util.List;
import java.util.Scanner;

public class SwitchDemo {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter food item: ");
    String food = scanner.next();

    switch (food) {
      case "pineapple", "banana", "pear", "strawberry" -> System.out.println("fruit");
      case "potato", "carrot", "broccoli" -> System.out.println("vegetable");
      default -> System.out.println("Don't know that food");
    }
  }
}

