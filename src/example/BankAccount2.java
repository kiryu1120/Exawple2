package example;

import java.util.Scanner;

public class BankAccount2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Keisann account = new Keisann();
		Loan loan = new Loan();
		
		System.out.println("口座番号を入力してください。");
		String number = scanner.nextLine();//Stringした意味はほぼない
		if(number.equals("1234")) {
			System.out.println("口座番号を確認しました。");
		}else {
			System.out.println("口座番号が違います。");
			return;
		}
		do {//ここからループ
		System.out.println("1:預金 2:引き出し 3:残高表示 4:ローン返済");
		System.out.println("選んでください。");
		int choice = scanner.nextInt();
		switch (choice) {
		case 1:
		System.out.println("お金を入れてください。");
		int tasu = scanner.nextInt();
		account.yokinn(tasu);//他のクラスから呼び出している
		break;
		
		case 2:
		System.out.println("何円引き出しますか？");
		int hiki = scanner.nextInt();
		account.hikidasi(hiki);//他のクラスから呼び出している
		break;
		
		case 3:
		System.out.println("今の残高は" + account.getMoney() + "円です");
		break;
		
		case 4:
		System.out.println("ローンを返済する金額を入力してください。");
		int hennsaiLoan = scanner.nextInt();
		loan.hennsai(hennsaiLoan, account);//他のクラスから呼び出している
		System.out.println("今のローン残高は" + loan.getLoan() + "円です");
		break;
		
	    default:
	    System.out.println("無効な選択肢");
	    break;
		}
		System.out.println("続けて操作しますか？(1:はい、0:いいえ)");
		int continueChoice = scanner.nextInt();
		if (continueChoice != 1) {
		break;//1を入力したら終了
		}
		}while(true);
	}
}