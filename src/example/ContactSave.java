package example;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ContactSave {
	private List<Contact> contacts;
	private String fileName;
	
	public ContactSave(String fileName) {
		contacts = new ArrayList<>();
		this.fileName = fileName;
	}
	public void pContact(String name, int number, String mail) {
		Contact contact = new Contact(name, number, mail);
		contacts.add(contact);
		System.out.println("連絡先が追加されましました。");
	}
	public void iContact(int index) {
		if(index >= 0 && index < contacts.size()) {
			contacts.remove(index);
			System.out.println("連絡先が削除されました。");
		}else {
			System.out.println("指定された連絡先は存在しません。");
		}
	}
	public void miContacts() {
		if(contacts.isEmpty()) {
			System.out.println("連絡先はありません。");
		}else {
			System.out.println("連絡先リスト:");
			for (int i = 0; i < contacts.size(); i++) {
				Contact contact = contacts.get(i);
				System.out.println((i + 1) + "." + contact.getName() + System.lineSeparator() +"電話番号" + contact.getNumber() + System.lineSeparator() + "メールアドレス" + contact.getMail());
			}
		}
	}
	public void sContacts() {
		try(FileOutputStream fileOut = new FileOutputStream(fileName);
			 ObjectOutputStream objectOut = new ObjectOutputStream(fileOut)){
			objectOut.writeObject(contacts);
			System.out.println("連絡先が保存されました。");
		}catch(IOException e) {
			System.out.println("保存中にエラーが発生しました。");
			e.printStackTrace();
		}
	}
	public void lContacts() {
		try(FileInputStream fileIn = new FileInputStream(fileName);
				 ObjectInputStream objectIn = new ObjectInputStream(fileIn)){
			contacts = (ArrayList<Contact>) objectIn.readObject();
			System.out.println("連絡先がロードされました。");
		}catch(IOException | ClassNotFoundException e) {
			System.out.println("ロード中にエラーが発生しました。");
			e.printStackTrace();
		}
	}
}
