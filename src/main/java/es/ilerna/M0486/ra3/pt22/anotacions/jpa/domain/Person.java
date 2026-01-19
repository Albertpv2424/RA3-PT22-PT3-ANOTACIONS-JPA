package es.ilerna.M0486.ra3.pt22.anotacions.jpa.domain;

public class Person {


	private String name;
	private String surname;
	private int phoneNumber;
	
	public Person(String name, String surname, int phoneNumber, int id) {
		super();
		this.name = name;
		this.surname = surname;
		this.phoneNumber = phoneNumber;
		this.id = id;
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

	public int getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	private int id;
	@Override
	public String toString() {	
		return "Person [name=" + name + ", surname=" + surname + ", phoneNumber=" + phoneNumber + ", id=" + id + "]";
	}
	
	public void addVehicle (Vehicle) {
		
	}
	
	public void removeVehicle (Vehicle) {
		
	}
}
