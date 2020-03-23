package com.globant.university;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class InsertTeachers implements University{
	static List<Teacher> teachers = new ArrayList<Teacher>();		
	@Override
	public void Insertar() {
		// TODO Auto-generated method stub
		
			Teacher teacher1 = new Teacher("Juan Perez",1, "full", 10, 0);
			Teacher teacher2 = new Teacher("Pepito Ortiz",2, "full", 5, 0);
			Teacher teacher3 = new Teacher("Luis Caro", 3, "", 0, 20);
			Teacher teacher4 = new Teacher("Oscar Muñoz", 4, "", 0, 10);

			teachers.add(teacher1);
			teachers.add(teacher2);
			teachers.add(teacher3);
			teachers.add(teacher4);
			
		}		

	@Override
	public void printPeople() {
		// TODO Auto-generated method stub
		for (int i=0; i<teachers.size(); i++) {
			Teacher temp=teachers.get(i);
			System.out.println("Teacher Name: "  + temp.getName() + "	Salary:  " + "  " + temp.getSalary());
		}
	}

	public static void find(int idTeacher) {
		// TODO Auto-generated method stub
		for (int i=0; i<teachers.size(); i++) {
			Teacher temp=teachers.get(i);
			if (temp.getId() == idTeacher) {
			System.out.println("Teacher Name: " + temp.getName() + "	Salary: " + "  " + temp.getSalary());
			}
		}
	}
	
	public static void createTeacher(String name, int id, String timet, int experience, int hours) {
		// TODO Auto-generated method stub
		
			Teacher teacherN = new Teacher(name,id, timet, experience, hours);
			
			teachers.add(teacherN);
			
		}		
	@Override
	public int Size(){
		int id=teachers.size();
		return id;
	}

	public static  void SubMenu(String nameT, int idTeacher) {
		// TODO Auto-generated method stub
		boolean sal = false;
    	String timet="";
    	int experience=0, hours=0;
    	Scanner in = new Scanner(System.in);
    	do{
    	System.out.println("1" + " Full Time");
    	System.out.println("2" + " Part time");
		System.out.println("Choose Option: ");

	    switch(in.next()){
        case "1":
            System.out.println("Experience years: ");
            experience=Read.ReadInt();
            timet="full";
            sal = true;
            break;
        case "2":
            System.out.println("Hours per week: ");
            hours=Read.ReadInt();
            timet="part";
            sal = true;
            break;
	    }	
	    }while(!sal);
    	createTeacher(nameT, idTeacher, timet, experience, hours);
	}   
	
}
