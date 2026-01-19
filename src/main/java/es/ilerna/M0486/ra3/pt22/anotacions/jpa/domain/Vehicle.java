package es.ilerna.M0486.ra3.pt22.anotacions.jpa.domain;

public class Vehicle {

	private int id;
	private String brand;
	private int year;
	private float price;
	
	public Vehicle(int id, String brand, int year, float price) {
		super();
		this.id = id;
		this.brand = brand;
		this.year = year;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Vehicle [id=" + id + ", brand=" + brand + ", year=" + year + ", price=" + price + "]";
	}
}
