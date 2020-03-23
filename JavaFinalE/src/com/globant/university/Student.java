package com.globant.university;

public class Student extends Person{
	
	private int age;
	
	
	public Student(String name,  int id, int age) {
		super(name, id);
		this.setAge(age);		
	}


	public double getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}

