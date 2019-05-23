package main;
import main.Person;

public class Employee extends Person {
	
	private String cuil;

	public Employee(int id, String name, String surname, int document, Address adress, String prepaidHealth,
			int affiliate, String cuil) {
		super(id, name, surname, document, adress, prepaidHealth, affiliate);
		this.cuil = cuil;
	}

	public String getCuil() {
		return cuil;
	}

	public void setCuil(String cuil) {
		this.cuil = cuil;
	}

}
