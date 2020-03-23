package com.globant.university;

public class Teacher extends Person {
	
	private double salary;
	
	private double basesalary=1000;
	
	public Teacher(String name, int id, String timet, int experience, int hours) {
		super(name, id);
		if (timet.contains("full"))
			this.setSalary(basesalary * ((110*experience)/100));
		else
			this.setSalary((basesalary/30) * hours);
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
}

