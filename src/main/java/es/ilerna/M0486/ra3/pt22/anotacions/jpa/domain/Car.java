package es.ilerna.M0486.ra3.pt22.anotacions.jpa.domain;

public class Car {

	private int doors;
	private int seats;
	
	
	public Car(int doors, int seats) {
		super();
		this.doors = doors;
		this.seats = seats;
	}


	public int getDoors() {
		return doors;
	}


	public void setDoors(int doors) {
		this.doors = doors;
	}


	public int getSeats() {
		return seats;
	}


	public void setSeats(int seats) {
		this.seats = seats;
	}


	@Override
	public String toString() {
		return "Car [doors=" + doors + ", seats=" + seats + "]";
	}
}
