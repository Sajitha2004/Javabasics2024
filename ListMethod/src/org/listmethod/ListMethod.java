package org.listmethod;
import java.util.ArrayList;
import java.util.List;

public class ListMethod {
	public static void main(String[] args) {
		List li = new ArrayList();
		li.add("saji");
		li.add(12.22);
		li.add(true);
		System.out.println(li);
		
	        int size = li.size();
	        System.out.println(size);
	        
	        int indexOf = li.indexOf("sajitha");
	        System.out.println(indexOf);
	        
	        int lastIndexOf = li.lastIndexOf(7);
	        System.out.println(lastIndexOf);
	        
	        boolean contains = li.contains(true);
	        System.out.println(contains);
	        
	        Object object = li.get(2);
	        System.out.println(object);
	}

	
}
