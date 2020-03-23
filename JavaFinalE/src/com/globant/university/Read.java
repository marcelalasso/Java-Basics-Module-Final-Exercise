package com.globant.university;

import java.util.Scanner;

public class Read {
	public static String ReadString() {
		String cadenas="";
		try {
			Scanner in = new Scanner(System.in);
			cadenas = in.nextLine();
	   	} catch (Exception e1) {
		      System.out.println("Something went wrong. Go to Menu Again");
		}
		return cadenas;
	}
	public static int ReadInt() {
		int integers=0;
		try {
				Scanner in = new Scanner(System.in);
				integers = Integer.parseInt(in.nextLine());
   	   	} catch (Exception e1) {
   		      System.out.println("Something went wrong. Go to Menu Again");
   		}
		return integers;
	}

}
