package com.globant.university;

import java.util.Comparator;

public class Order implements Comparator<Object>{
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		Classes classes1 = (Classes)o1;
        Classes classes2 = (Classes)o2;
        return classes1.getId().
                compareTo(classes2.getId());          
	}

}
