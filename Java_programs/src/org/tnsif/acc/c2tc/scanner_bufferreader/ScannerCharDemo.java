package org.tnsif.acc.c2tc.scanner_bufferreader;
import java.util.Scanner;
public class ScannerCharDemo {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
	 Scanner test = new Scanner(System.in);
			System.out.println("Enter a String ");
			  char ch= test.next().charAt(3);
			  System.out.println("Fourth charater is "+ch);
		

	}

}