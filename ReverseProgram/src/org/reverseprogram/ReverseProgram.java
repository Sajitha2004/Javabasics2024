package org.reverseprogram;

public class ReverseProgram {

	public static void main(String[] args) {
		String a = "hsenkciv";
		 String s = "";
		int length = a.length();
		System.out.println(length);
		
		for(int i=a.length()-1;i>=0;i--) {
		System.out.println(a.charAt(i));
		s = s+a.charAt(i);
		}
		if(a.equals(s)) {
			System.out.println("Correct");
		}
		else {
			System.out.println("Incorrect");
		}
		
	}
	

}
