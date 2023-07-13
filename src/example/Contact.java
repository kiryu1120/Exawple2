package example;

import java.io.Serializable;

public class Contact implements Serializable{
	private String name;
	private int number;
	private String mail;
	
	public Contact(String name, int number, String mail) {
		this.name = name;
		this.number = 0;
		this.mail = mail;
	}
	public String getName() {
		return name;
	}
	public int getNumber() {
		return number;
	}
	public String getMail() {
		return mail;
	}
}