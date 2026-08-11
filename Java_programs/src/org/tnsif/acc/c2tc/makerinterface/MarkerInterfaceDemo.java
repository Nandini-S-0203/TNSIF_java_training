package org.tnsif.acc.c2tc.makerinterface;

public class MarkerInterfaceDemo {

	public static void main(String[] args) {
		Registration s=new Student(12,"Nani",3000.00,"Java programming");
		Registration s0=new Student(13,"sushma",3000.00,"Java programming");
		if(s instanceof Registration) {
			System.out.println("student is registered for the course");
		}
		else {
			System.out.println("student is not registered for the course");
		}
	}

}
