package com.globant.university;

public class Classes {

	private String name,classroom, id;
	
	private int idStudent, idTeacher;
	
	
	public Classes(String name,  int idStudent, int idTeacher, String classroom, String id) {
		this.setName(name);
		this.setIdStudent(idStudent);
		this.setIdTeacher(idTeacher);		
		this.setClassroom(classroom);
		this.setId(id);
	}

	public void setClassroom(String classroom) {
		this.classroom = classroom;
	}

	public String getClassroom() {
		return classroom;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getIdStudent() {
		return idStudent;
	}

	public void setIdStudent(int idStudent) {
		this.idStudent = idStudent;
	}
	public int getIdTeacher() {
		return idTeacher;
	}

	public void setIdTeacher(int idTeacher) {
		this.idTeacher = idTeacher;
	}
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id= id;
	}

}

