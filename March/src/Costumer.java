public class Costumer {
  protected String username;
  protected String phone;

  public Costumer(String username, String phone){
    this.username = username;
    this.phone = phone;
  }
  
  public String toString(){
    return username + ", " + phone;
  }
}
