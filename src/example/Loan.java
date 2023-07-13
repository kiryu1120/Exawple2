package example;

public class Loan extends Keisann{
   private int loan;
   
   public Loan() {
	   super();
	   this.loan = 50000;
   }
   public int getLoan() {
	   return loan;
   }
   public void hennsai(int coin, Keisann keisann) {
	   if (coin <= keisann.getMoney()) {
		   keisann.hikidasi(coin);
		   loan -= coin;
	   if (loan <= 0) {
		   System.out.println("ローン返済が終わりました。おめでとうございます。(^v^)b");
	   }
	   }else {
		   System.out.println("返済できません");
	   }
   }
}