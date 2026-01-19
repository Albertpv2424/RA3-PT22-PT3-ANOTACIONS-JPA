package es.ilerna.M0486.ra3.pt22.anotacions.jpa.domain;

public class Student {

	private String studentCode;

	public Student(String studentCode) {
		super();
		this.studentCode = studentCode;
	}

	public String getStudentCode() {
		return studentCode;
	}

	public void setStudentCode(String studentCode) {
		this.studentCode = studentCode;
	}

	@Override
	public String toString() {
		return "Student [studentCode=" + studentCode + "]";
	}
}
