package example;

import java.util.Scanner;

public class Renraku {
    public static void main(String[] args) {
        String fileName = "contacts.dat";
        ContactSave contactManager = new ContactSave(fileName);
        Scanner scanner = new Scanner(System.in);

        // ロード
        contactManager.lContacts();

        while (true) {
            System.out.println("1. 連絡先追加");
            System.out.println("2. 連絡先削除");
            System.out.println("3. 連絡先表示");
            System.out.println("4. 連絡先保存");
            System.out.println("5. 終了");
            System.out.print("選択: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("名前: ");
                    String name = scanner.nextLine();
                    System.out.print("電話番号: ");
                    int number = scanner.nextInt();
                    System.out.print("メールアドレス: ");
                    String mail = scanner.nextLine();
                    contactManager.pContact(name, number, mail);
                    break;
                case 2:
                    System.out.print("削除する連絡先の番号: ");
                    int index = scanner.nextInt();
                    scanner.nextLine();
                    contactManager.iContact(index - 1);
                    break;
                case 3:
                    contactManager.miContacts();
                    break;
                case 4:
                    contactManager.sContacts();
                    break;
                case 5:
                    System.out.println("連絡先を保存してプログラムを終了します。");
                    contactManager.sContacts();
                    System.exit(0);
                default:
                    System.out.println("無効な選択です。もう一度選んでください。");
            }
            System.out.println();
        }
    }
}