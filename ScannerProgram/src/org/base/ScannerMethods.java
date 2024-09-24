package org.base;
import java.util.Scanner;

public class ScannerMethods {

	public static void main (String[] args) {
		
		Scanner name = new Scanner(System.in);
		System.out.println("enter the name: ");
		String a = name.next();
		System.out.println("My name is "+a);
		
	}

}