package com.globant.test;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import com.globant.university.InsertClasses;
import com.globant.university.InsertStudent;
import com.globant.university.InsertTeachers;
import com.globant.university.Read;

	public class Menu2 extends JFrame implements ActionListener{
	    /**
		 * 
		 */
		//private static final long serialVersionUID = 1L;
		private JMenuBar mb;
	    private JMenu menu1,menu2,menu3, menu4, menu5;
	    private JMenuItem mi1,mi2,mi3,mi4, mi5, mi6, mi7, mi8;
	    InsertTeachers insertT;
	    InsertStudent insertS;
	    InsertClasses insertC;

	    public Menu2() {
	    	initialize();
	    	setLayout(null);
	        mb=new JMenuBar();
	        setJMenuBar(mb);
	        menu1=new JMenu("The University");
	        mb.add(menu1);
	        menu2=new JMenu("Teachers");
	        menu1.add(menu2);
	        menu3=new JMenu("Students");
	        menu1.add(menu3);
	        menu4=new JMenu("Classes");
	        menu1.add(menu4);
	        menu5=new JMenu("Salir");
	        menu1.add(menu5);
	        mi1=new JMenuItem("Print");
	        menu2.add(mi1);
	        mi1.addActionListener(this);
	        mi2=new JMenuItem("Print");
	        menu3.add(mi2);
	        mi2.addActionListener(this);
	        mi3=new JMenuItem("Insert Student");
	        menu3.add(mi3);
	        mi3.addActionListener(this);
	        mi4=new JMenuItem("Search Classes by Student");
	        menu3.add(mi4);
	        mi4.addActionListener(this);
	        mi5=new JMenuItem("Print");
	        menu4.add(mi5);
	        mi5.addActionListener(this);
	        mi6=new JMenuItem("Insert Class");
	        menu4.add(mi6);
	        mi6.addActionListener(this);
	        mi7=new JMenuItem("Find Class");
	        menu4.add(mi7);
	        mi7.addActionListener(this);
	        mi8=new JMenuItem("Exit");
	        menu5.add(mi8);
	        mi8.addActionListener(this);
		    }

	    public void actionPerformed(ActionEvent e) {
	    	if (e.getSource()==mi1) {
	    		insertT.printPeople();
	        }
	        if (e.getSource()==mi2) {
	        	insertS.printPeople();
	        }
	        if (e.getSource()==mi3) {
	        	int search=0;
	        	int id=insertS.sizes()+1;
	        	readStudent(id);
	        	insertC.SubMenu(search, id);
	        	
	        }
	        if (e.getSource()==mi4) {
	        	System.out.println("Id Student: ");
	        	int idStudent=Read.ReadInt();
	   	        InsertClasses.findClasses2(idStudent);
	        }
	        if (e.getSource()==mi5) {
	        	insertC.printPeople();
	        }
	        if (e.getSource()==mi6) {
	        	System.out.println("Name Class:");
	        	String name=Read.ReadString();
	        	int idStudent=insertS.sizes()+1;
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
	        }
	        if (e.getSource()==mi7) {
	        	int search=1;
	        	int id=0;
	        	insertC.SubMenu(search, id);
	        }
	        if (e.getSource()==mi8) {    	
	        	dispose();
	        }
	    }
	    
	    public void initialize() {
	    	insertT = new InsertTeachers();
	    	insertT.insertar();
	    	insertS = new InsertStudent();
			insertS.insertar();
			insertC = new InsertClasses();
	    	insertC.insertar();
	    }
	    
	    public void readStudent(int id) {
	    	System.out.println("Name Student:");
        	String name=Read.ReadString();
        	System.out.println("Age Student:");
        	int age=Read.ReadInt();
        	InsertStudent.createStudent(name,id, age);
	    }
	    
	    
		public static void main (String[] args) {
	        Menu2 menu2=new Menu2();
	        menu2.setBounds(0,0,300,200);
	        menu2.setVisible(true);
	    }     
	}	
