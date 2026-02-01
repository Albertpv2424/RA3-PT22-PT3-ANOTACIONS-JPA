package es.ilerna.M0486.ra3.pt22.anotacions.jpa.domain;

import javax.persistence.*;

@Entity
public class Motorcycle extends Vehicle {

	private boolean hasSidecar;
	
	public Motorcycle() { }

	public Motorcycle(String brand, int year, float price, boolean hasSidecar) {
		super(brand, year, price);
		this.hasSidecar = hasSidecar;
	}

	public boolean isHasSidecar() {
		return hasSidecar;
	}

	public void setHasSidecar(boolean hasSidecar) {
		this.hasSidecar = hasSidecar;
	}

	@Override
	public String toString() {
		return "Motorcycle [hasSidecar=" + hasSidecar + "]";
	}
}
