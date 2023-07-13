package example;

import java.util.Scanner;

public class BankAccount {
	private int totalMoney;
	
	public int gettotalMoney() {
		return totalMoney;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int totalMoney = 0;
		int loan = 1000000;
		System.out.println("口座番号を入力してください。");
		String number = scanner.nextLine();
		if(number.equals("1234")) {
			System.out.println("口座番号を確認しました。");
		}else {
			System.out.println("口座番号が違います。");
			return;
		}
		do {
		System.out.println("1:預金 2:引き出し 3:残高表示 4:ローン返済");
		System.out.println("選んでください。");
		int choice = scanner.nextInt();
		if (choice == 1) {
		System.out.println("お金を入れてください。");
		int money = scanner.nextInt();
		totalMoney += money; 
		}
		else if(choice == 2) {
		System.out.println("何円引き出しますか？");
		int money = scanner.nextInt();
		totalMoney -= money;
		if (totalMoney <= 0) {
			System.out.println("引き出せません");
			continue;
		}
		}else if(choice == 3) {
		System.out.println("残高を表示します");
		if (totalMoney <= 0) {
			System.out.println("残高がありません");
			continue;
		}
		System.out.println("今の残高は" + totalMoney + "円です");
		}else if(choice == 4) {
		System.out.println("残高全て使いローンを返済します。");
		loan -= totalMoney;
		System.out.println("今のローンの残りは" + loan + "円です");
		if (loan <= 0) {
			System.out.println("ローン返済が終わりました。おめでとうございます。(^v^)b");
		}
		}else {
		System.out.println("無効な選択です");
		continue;
		}
		System.out.println("続けて操作しますか？(1:はい、0:いいえ)");
		int continueChoice = scanner.nextInt();
		if (continueChoice != 1) {
			break;
		}
	    }while(true);	
	}
}