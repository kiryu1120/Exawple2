package example;

public class Keisann {
  private int money;
  
  public Keisann() {
	  this.money = 0;
  }
  public int getMoney() {
	  return money;
  }
  public void yokinn(int coin) {
	  money += coin;
  }
  public void hikidasi(int coin) {
	  if(coin <= money) {
		  money -= coin;
	  }else {
		  System.out.println("お金が不足しています。");
	  }
  }
}