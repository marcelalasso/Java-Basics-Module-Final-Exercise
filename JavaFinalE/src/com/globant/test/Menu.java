package com.globant.test;

import java.util.Scanner;

import com.globant.university.InsertClasses;
import com.globant.university.InsertStudent;
import com.globant.university.InsertTeachers;
import com.globant.university.Read;

public class Menu {
	
    static InsertTeachers insertT;
    static InsertStudent insertS;
    static InsertClasses insertC;

	
	public static void main(String[] args) {
	    boolean sal = false;
	    int idStudent, search;
    	initialize();
	    Scanner in = new Scanner(System.in);
	    do{
	    	System.out.println("1. Print Teachers");
	        System.out.println("2. Print Students");
	        System.out.println("3. Insert Student");
	        System.out.println("4. Search Classes by Student");
	        System.out.println("5. Print Classes");
	        System.out.println("6. Insert Class");
	        System.out.println("7. Find Class");
	        System.out.println("8. Exit");    
	        System.out.println("Escribe una de las opciones");
	    	switch(in.next()){
	            case "1":
	                System.out.println("Print Teachers");
	                insertT.printPeople();
	                break;
	            case "2":
	                System.out.println("Print Students");
	                insertS.printPeople();	                
	                break;
	            case "3":
	                System.out.println("Insert Student");
	            	search=0;
	            	idStudent=insertS.sizes()+1;
	            	readStudent(idStudent);
	            	insertC.SubMenu(search, idStudent);
	                break;
	            case "4":
	                System.out.println("Search Classes by Student");
	            	System.out.println("Id Student: ");
	            	idStudent=Read.ReadInt();
	                   InsertClasses.findClasses2(idStudent);              
	                break;
	            case "5":
	                System.out.println("Print Classes");
	                insertC.printPeople();
	                break;
	            case "6":
	                System.out.println("Insert Class");
	            	System.out.println("Name Class:");
	            	String name=Read.ReadString();
	            	idStudent=insertS.sizes()+1;
	            	int idTeacher=insertT.sizes()+1;
	            	System.out.println("Classroom:");
	            	String classroom=Read.ReadString();
	            	String id=Integer.toString(insertC.sizes()+1);
	            	System.out.println("Name Teacher:");
	            	String nameT=Read.ReadString();
	            	InsertTeachers.SubMenu(nameT, idTeacher);
	            	System.out.println("Number of Students in the Class: ");
	            	int number=Read.ReadInt();
	            	for (int i=0; i<number; i++) {
	            		readStudent(idStudent);
	            		InsertClasses.createClass(name, idStudent, idTeacher, classroom, id);
	            		idStudent=insertS.sizes()+1;
	            	}
	                break;
	            case "7":
	                System.out.println("Find Class");
	            	search=1;
	            	int idc=0;
	            	insertC.SubMenu(search, idc);
	                break;
	            case "8":
	            	System.out.println("Thanks!!!!");
	            	sal=true;
	                break;
	        }
	    
	    }while(!sal);
	}
	
	public static void initialize() {
		insertT = new InsertTeachers();
		insertT.insertar();
		insertS = new InsertStudent();
		insertS.insertar();
		insertC = new InsertClasses();
		insertC.insertar();
	}

	public static void readStudent(int id) {
		System.out.println("Name Student:");
		String name=Read.ReadString();
		System.out.println("Age Student:");
		int age=Read.ReadInt();
		InsertStudent.createStudent(name,id, age);
	}
	
}

