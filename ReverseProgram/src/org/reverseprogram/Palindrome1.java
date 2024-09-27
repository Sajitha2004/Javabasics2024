package org.reverseprogram;

import java.util.Scanner;

public class Palindrome1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the first  name:");
		String name = scan.nextLine();
		System.out.println("Name:"+name);
		
		String name1 = "";
	
		int length = name.length();
		System.out.println("The Name Length is :"+length);
		
		
		for(int i=name.length()-1;i>=0;i--) {
			System.out.println(name.charAt(i));
			name1 = name1+name.charAt(i);
			
	}
		if(name1.equals(name)) {
			System.out.println("It is a Palindrome");
		}
		else {
			System.out.println("It is a Not Palindrome");
		}
		
		
   }
}