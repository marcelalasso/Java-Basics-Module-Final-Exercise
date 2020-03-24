package com.globant.university;

import java.util.ArrayList;
import java.util.List;


public class InsertStudent implements University{
	static List<Student> students = new ArrayList<Student>();		
	
	@Override
	public void insertar() {
		// TODO Auto-generated method stub
		
			Student student1 = new Student("Ana Caro", 1, 20);
			Student student2 = new Student("Juan Arcos", 2, 21);
			Student student3 = new Student("Jhon Ruiz", 3, 20);
			Student student4 = new Student("Oscar Mayo", 4, 18);
			Student student5 = new Student("Lina Perez", 5, 20);
			Student student6 = new Student("Camila Castro", 6, 19);

			students.add(student1);
			students.add(student2);
			students.add(student3);
			students.add(student4);
			students.add(student5);
			students.add(student6);
			
		}		

	@Override
	public void printPeople() {
		// TODO Auto-generated method stub
		for (int i=0; i<students.size(); i++) {
			Student temp=students.get(i);
			System.out.println("Student Name: " + "  "+ temp.getName() + "  " + "Id" + "  " + temp.getId()+ "  " + "Age"  + "  "+ temp.getAge());
		}
	}

	public static void find(int idStudent) {
		// TODO Auto-generated method stub
		for (int i=0; i<students.size(); i++) {
			Student temp=students.get(i);
			if (temp.getId() == idStudent) {
				System.out.println("Student Name: " + "  "+ temp.getName() + "  " + "Id" + "  " + temp.getId()+ "  " + "Age"  + "  "+ temp.getAge());
			}
		}
	}
	public static void createStudent(String name, int id, int age) {
		// TODO Auto-generated method stub
			Student studentN = new Student(name, id , age);

			students.add(studentN);
			
		}		
	@Override
	public int sizes(){
		int id=students.size();
		return id;
	}
}
