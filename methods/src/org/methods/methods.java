package org.methods;

public class methods {

	public static void main (String[]args) {

		String name = "sajitha";
		
		char charAt = name.charAt(0);
		System.out.println(charAt);
				
		int indexOf = name.indexOf("a");
		System.out.println(indexOf);
		
		int lastIndexOf = name.lastIndexOf("i");
		System.out.println(lastIndexOf);
		 
		int length = name.length();
		System.out.println(length);
		
		boolean empty = name.isEmpty();
		System.out.println(empty);
		
		boolean contains = name.contains("saji");
		System.out.println(contains);
		
		String trim = name.trim();
		System.out.println(trim);
		
		boolean startsWith = name.startsWith("saj");
		System.out.println(startsWith);
		
		boolean endsWith = name.endsWith("tha");
		System.out.println(endsWith);
		
		String upperCase = name.toUpperCase();
		System.out.println(upperCase);
		
		String lowerCase = name.toLowerCase();
		System.out.println(lowerCase);
		
		String a="Saji";
		String b="saji";
		
		boolean equals = a.equals(b);
		System.out.println(equals);
		
		boolean equalsIgnoreCase = a.equalsIgnoreCase(b);	
		System.out.println(equalsIgnoreCase);
		
		String replace = name.replace("s","S");
		System.out.println(replace);
		
		String replaceAll = name.replaceAll("sajitha","Padipss");
		System.out.println(replaceAll);
		
		String word = "iyndhupanai";
		String substring = word.substring(4);
		System.out.println(substring);
		
		String substring2 = word.substring(4,7);
		System.out.println(substring2);
		
		String c = "SAJI";
		String d = "saji";
		
		int compareTo = d.compareTo(c);
		System.out.println(compareTo);
		
		
 }
}