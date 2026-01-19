package es.ilerna.M0486.ra3.pt22.anotacions.jpa.domain;

public class Teacher {

	private String teacherCode;

	public Teacher(String teacherCode) {
		super();
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
