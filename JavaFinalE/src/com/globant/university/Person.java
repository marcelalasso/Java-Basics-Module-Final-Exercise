package com.globant.university;

public class Person {
	protected String name;
	protected int id;
	protected static int nextId;

	public Person(String name, int id) {
		this.name = name;
		this.id=id;
	}
	
	public String getName() {
		return name;
	}
	public int getId() {
		return id;
	}
}
