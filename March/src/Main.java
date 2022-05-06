import java.util.ArrayList;

public class Main {

  public void execute(){
    ArrayList<Animal> animalList = new ArrayList<Animal>();

    animalList.add(new Dog("Fido"));
    animalList.add(new Cat("Hamilton"));
    animalList.add(new Dog("Rufus"));
    animalList.add(new Dog("Plet"));

    for (int i = 0; i < animalList.toArray().length; i++){
      System.out.println(animalList.get(i));
      animalList.get(i).speak();
      if (animalList.get(i) instanceof Dog){
        ((Dog) animalList.get(i)).wagTail();
      }
    }
  }

  public static void main(String[] args) {
    new Main().execute();
  }
}