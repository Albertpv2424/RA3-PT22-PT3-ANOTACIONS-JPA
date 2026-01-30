package es.ilerna.M0486.ra3.pt22.anotacions.jpa.domain;

import java.util.*;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Person {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String name;
	private String surname;
	private int phoneNumber;
	
	@OneToMany(mappedBy = "owner", cascade = CascadeType.ALL)
	private List<Vehicle> vehicles = new ArrayList<>();
	
	// 🔴 OBLIGATORIO para JPA
	public Person() {
	}
	
	public Person(String name, String surname, int phoneNumber) {
		this.name = name;
		this.surname = surname;
		this.phoneNumber = phoneNumber;
	}
	
	public int getId() {
		return id;
	}
	
	// Setter opcional (se puede eliminar)
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
	
	public List<Vehicle> getVehicles() {
		return vehicles;
	}
	
	public void addVehicle(Vehicle v) {
		vehicles.add(v);
		v.setOwner(this);
	}
	
	public void removeVehicle(Vehicle v) {
		vehicles.remove(v);
		v.setOwner(null);
	}
	
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name +
				", surname=" + surname + ", phoneNumber=" + phoneNumber + "]";
	}
}
