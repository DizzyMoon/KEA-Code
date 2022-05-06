public class Dog extends Animal{

  private String name;

  public Dog(String name){
    this.name = name;
  }

  public void speak(){
    System.out.println("Woof");
  }

  public void wagTail(){
    System.out.println("So excited!");
  }

  public String toString(){
    return name;
  }

  public String getName(){
    return name;
  }
}
