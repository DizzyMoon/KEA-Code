public class PremiumCostumer extends Costumer {
  private int bonusPoints = 100;

  public PremiumCostumer(String username, String phone) {
    super(username, phone);
  }

  public String toString(){
    return super.toString() + ", Bonus Points: " + String.valueOf(bonusPoints);
  }
}
