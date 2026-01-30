package es.ilerna.M0486.ra3.pt22.anotacions.jpa.domain;

import javax.persistence.*;

@Entity
public class Teacher extends Person {

	private String teacherCode;

	public Teacher() {
	}
	
	public Teacher(String name, String surname, int phoneNumber, String teacherCode) {
		super(name, surname, phoneNumber);
		this.teacherCode = teacherCode;
	}

	public String getTeacherCode() {
		return teacherCode;
	}

	public void setTeacherCode(String teacherCode) {
		this.teacherCode = teacherCode;
	}

	@Override
	public String toString() {
		return "Teacher [teacherCode=" + teacherCode + "]";
	}
}
