package es.ilerna.M0486.ra3.pt22.anotacions.jpa.domain;

public class Plane {

	private int tailNumber;
	private boolean autopilot;
	
	public Plane(int tailNumber, boolean autopilot) {
		super();
		this.tailNumber = tailNumber;
		this.autopilot = autopilot;
	}

	public int getTailNumber() {
		return tailNumber;
	}

	public void setTailNumber(int tailNumber) {
		this.tailNumber = tailNumber;
	}

	public boolean isAutopilot() {
		return autopilot;
	}

	public void setAutopilot(boolean autopilot) {
		this.autopilot = autopilot;
	}

	@Override
	public String toString() {
		return "Plane [tailNumber=" + tailNumber + ", autopilot=" + autopilot + "]";
	}
}
