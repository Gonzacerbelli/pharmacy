package main;
import main.Address;

public class Person {
	
	private int id;
	private String name;
	private String surname;
	private int document;
	private Address adress;
	private String prepaidHealth;
	private int affiliate;
	
	public Person(int id, String name, String surname, int document, Address adress, String prepaidHealth,
			int affiliate) {
		super();
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.document = document;
		this.adress = adress;
		this.prepaidHealth = prepaidHealth;
		this.affiliate = affiliate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public int getDocument() {
		return document;
	}

	public void setDocument(int document) {
		this.document = document;
	}

	public Address getAdress() {
		return adress;
	}

	public void setAdress(Address adress) {
		this.adress = adress;
	}

	public String getPrepaidHealth() {
		return prepaidHealth;
	}

	public void setPrepaidHealth(String prepaidHealth) {
		this.prepaidHealth = prepaidHealth;
	}

	public int getAffiliate() {
		return affiliate;
	}

	public void setAffiliate(int affiliate) {
		this.affiliate = affiliate;
	}

}
