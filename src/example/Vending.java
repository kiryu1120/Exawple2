package example;

import java.util.Scanner;

public class Vending {
	public static void main(String[] args) { 
		int coral1 = 100;
		int ocha1 = 100;
		int coral2 = 110;
		int ocha2 = 110;
		int coral3 = 120;
		int ocha3 = 120;
		int coral4 = 130;
		int ocha4= 130;
		int coral5 = 140;
		int ocha5 = 140;
		
		Scanner scanner = new Scanner(System.in);
		int money;
		int choice;
		System.out.println("コインを投入して下さい。");
		money = scanner.nextInt();
		int totalMoney = money;
		int totalStock = 2;
		int shouhistock = 1;
		do {
		System.out.println("1:コーラ 2:お茶 3:コーラ 4:お茶 5:コーラ 6:お茶 7:コーラ 8:お茶 9:コーラ 10:お茶");
		System.out.println("商品を選んでください");
		choice = scanner.nextInt();
		int price = 0;
		switch(choice) {
		case 1:
			price = coral1;
			break;
		case 2:
			price = ocha1;
			break;
		case 3:
			price = coral2;
			break;
		case 4:
			price = ocha2;
			break;
		case 5:
			price = coral3;
			break;
		case 6:
			price = ocha3;
			break;
		case 7:
			price = coral4;
			break;
		case 8:
			price = ocha4;
			break;
		case 9:
			price = coral5;
			break;
		case 10:
			price = ocha5;
			break;
	    default:
	    	 System.out.println("無効な選択肢");
	    	 continue;
		}
		if(totalMoney >= price) {
			int oturi = totalMoney - price;
			System.out.println("お釣りは" + oturi + "円です");
			System.out.println("商品を購入しました。");
			totalMoney = oturi;
		}else {
			boolean continueBuying = false;
			System.out.println("お金が足りません。または、在庫がありません。");
			continue;
		}
		if(totalStock >= 2 || totalStock >= 1) {
			int drinksstock = totalStock - shouhistock;
			System.out.println("在庫は" + drinksstock +"です");
			totalStock = drinksstock;
		}else {
	
			System.out.println("在庫が切れました。");
			continue;
		}
		System.out.println("続けて商品を購入しますか？(1:はい、0:いいえ)");
		int continueChoice = scanner.nextInt();
		if (continueChoice != 1) {
			break;
		}
		}while(true);	
	}
}