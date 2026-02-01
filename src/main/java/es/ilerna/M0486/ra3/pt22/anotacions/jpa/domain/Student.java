package es.ilerna.M0486.ra3.pt22.anotacions.jpa.domain;

import javax.persistence.*;

@Entity
public class Student extends Person{

	private String studentCode;

	public Student() { 
		
	}

	public Student(String name, String surname, int phoneNumber, String studentCode) {
		super(name, surname, phoneNumber);
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
