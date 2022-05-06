public class Cat extends Animal{

  private String name;

  public Cat(String name){
    this.name = name;
  }

  public String getName(){
    return name;
  }

  public String toString(){
    return name;
  }

  public void speak(){
    System.out.println("Meow");
  }
}
