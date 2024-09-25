package org.setconcept;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetConcept {

	public static void main(String[] args) {
		//HashSet
		Set s = new HashSet();
		s.add("saji");
		s.add(12);
		s.add(true);
		s.add(null);
		s.add(99.9);
		System.out.println(s);
		
		//LinkedHash
		Set s1 = new LinkedHashSet();
		s1.add("saji");
		s1.add(12);
		s1.add(true);
		s1.add(null);
		s1.add(99.9);
		System.out.println(s1);
		
		
		//TreeSet
		Set s2 = new TreeSet();
		s2.add(13);
		s2.add(12);
		s2.add(22);
		s2.add(1);
		s2.add(99);
		System.out.println(s2);
	}

}
