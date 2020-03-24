package com.globant.university;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

import javax.swing.text.html.HTMLDocument.Iterator;


public class InsertClasses implements University{
	static List<Classes> classes = new ArrayList<Classes>();	

	@Override
	public void insertar() {
		// TODO Auto-generated method stub

			Classes clase1 = new Classes("Mat", 1, 1, "005","1");
			Classes clase11 = new Classes("Mat", 2, 1, "005","1");
			Classes clase12 = new Classes("Mat", 3, 1, "005","1");
			Classes clase2 = new Classes("Quimestry", 1, 2, "023","2");
			Classes clase21 = new Classes("Quimestry", 2, 2, "023","2");
			Classes clase22 = new Classes("Quimestry", 3, 2, "023","2");
			Classes clase23 = new Classes("Quimestry", 4, 2, "023","2");
			Classes clase3 = new Classes("Programing", 1, 3, "108","3");
			Classes clase31 = new Classes("Programing", 2, 3, "108","3");
			Classes clase32 = new Classes("Programing", 3, 3, "108","3");
			Classes clase4 = new Classes("Languaje", 2, 4, "C15","4");
			Classes clase41 = new Classes("Languaje", 3, 4, "C15","4");
			Classes clase42 = new Classes("Languaje", 4, 4, "C15","4");
			Classes clase43 = new Classes("Languaje", 5, 4, "C15","4");
			Classes clase44 = new Classes("Languaje", 6, 4, "C15","4");
			

			classes.add(clase1);
			classes.add(clase11);
			classes.add(clase12);
			classes.add(clase2);
			classes.add(clase21);
			classes.add(clase22);
			classes.add(clase23);
			classes.add(clase3);
			classes.add(clase31);
			classes.add(clase32);
			classes.add(clase4);
			classes.add(clase41);
			classes.add(clase42);
			classes.add(clase43);
			classes.add(clase44);
			
		}		

	@Override
	public void printPeople() {
		// TODO Auto-generated method stub
		Collections.sort(classes, new Order());
		for (int i=0; i<classes.size(); i++) {
			Classes temp=classes.get(i);
			System.out.println("Class Name: " + temp.getName() + "  " + "Id Student:  "  + temp.getIdStudent()+ "  " + "Id Teacher:  "  + temp.getIdTeacher()+ "  " + "Classroom:  "+ temp.getClassroom());
		}
	}

	public  void SubMenu(int search, int id) {
		// TODO Auto-generated method stub
		boolean sal = false;
    	String Class="";
    	String option;
    	Scanner in = new Scanner(System.in);
	    do{
	    	for (int i=0; i<classes.size(); i++) {
				Classes temp=classes.get(i);
				if (temp.getName() != Class) {
					System.out.println(temp.getId() + "." + "Class Name: " + temp.getName() );
					Class=temp.getName();
				}
			}    
	        if (search==1) {
	        	 System.out.println("0" + " Exit");
	         }
		System.out.println("Choose Option: ");
	    option=in.nextLine();
	    //return option;
	    if ((option.contains("0") ) && (search==1))	{
	    	System.out.println("Thanks!! Go to Menu");
        	sal=true;
            break;
	    }    
            else {
	         if (search==1) {
	        	 findClasses(option);
	        	 sal=true;
	         }
	         else
	         {
	        	 for (int i=0; i<classes.size(); i++) {
	 				Classes temp=classes.get(i);
	 				if (temp.getId().contentEquals(option) ) {
	 					System.out.println("Thanks Student Inserted!! Go to Menu");
	 					addPerson(option, id);
	 					sal=true;
	 					break;
	 				}
	        	 }	
	         }
           }
	    }while(!sal);
	}   

	public void findClasses(String option) {
		// TODO Auto-generated method stub
		int find=0;
		for (int i=0; i<classes.size(); i++) {
			Classes temp=classes.get(i);
			if (temp.getId().contentEquals(option)) {
				if (find==0) {
					int idTeacher=temp.getIdTeacher();
					System.out.println("Class Selected: " + temp.getName() );
					System.out.println("Teachers in this class:");
					InsertTeachers.find(idTeacher);
					find=1;
					System.out.println("Students in this class:");
				}
				int idStudent=temp.getIdStudent();
				InsertStudent.find(idStudent);
			}
		}
	}

	public static void createClass(String name,  int idStudent, int idTeacher, String classroom, String id) {
		// TODO Auto-generated method stub
		
			Classes claseN = new Classes(name, idStudent, idTeacher, classroom,id);
			
			classes.add(claseN);
	}		

	public void addPerson(String option, int id) {
		int find=0;
		for (int i=0; i<classes.size(); i++) {
			Classes temp=classes.get(i);
			if ((temp.getId().contentEquals(option)) && (find==0) ) {
				createClass(temp.getName(), id, temp.getIdTeacher(), temp.getClassroom(), temp.getId());
				find=1;
			}
		}
	}
	
	@Override
	public int sizes(){
		String classe="";
		int id=0;
		Collections.sort(classes, new Order());
		for (int i=0; i<classes.size(); i++) {
			Classes temp=classes.get(i);
			if (temp.getName() != classe) {
				classe=temp.getName();
				id=id+1;
			}
		}
		return id;
	}
	
	public static void findClasses2(int idStudent) {
		// TODO Auto-generated method stub
		int find=0;
		System.out.println("The Student is in the class: ");
		for (int i=0; i<classes.size(); i++) {
			Classes temp=classes.get(i);
			if (temp.getIdStudent() == idStudent) {
				System.out.println(temp.getName());
				find=1;
			}
		}
		if (find==0)	{
			System.out.println("The student does not exist ");
		}
	}
}
