package es.ilerna.M0486.ra3.pt22.anotacions.jpa.domain;

public class Motorcycle {

	private boolean hasSidecar;

	public Motorcycle(boolean hasSidecar) {
		super();
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
