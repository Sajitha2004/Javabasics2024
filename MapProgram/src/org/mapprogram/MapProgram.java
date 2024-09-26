package org.mapprogram;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class MapProgram {

	public static void main(String[] args) {
		//HashMap
		      Map<String,Integer>  m1 = new HashMap();
		      m1.put("SAJI",12);
		      m1.put("SRI",13);
		      m1.put("OVIYA",14);
		      m1.put("HEMA",15);
		      m1.put("AISHU",16);
		      System.out.println(m1);
		
		//LinkedHashMap
				Map<String,Integer>  m2 = new LinkedHashMap();
				m2.put("SAJI",12);
				m2.put("SRI",13);
				m2.put("OVIYA",14);
				m2.put("HEMA",15);
				m2.put("AISHU",16);
				System.out.println(m2);
				
				
		//TreeMap
				Map<String,Integer>  m3 = new TreeMap();
				m3.put("SAJI",12);
				m3.put("SRI",13);
				m3.put("OVIYA",14);
				m3.put("HEMA",15);
				m3.put("AISHU",16);
				System.out.println(m3);
				
		//HashTable
				Map<String,Integer>  m4 = new HashMap();
				m4.put("SAJI",12);
				m4.put("SRI",13);
				m4.put("OVIYA",14);
				m4.put(null,null);
				m4.put(null,16);
				System.out.println(m4);
		
		System.out.println("=======");
		
		//Methods of Map
	        //size()
		    int size = m1.size();
		    System.out.println(size);
		    
		    //Containskey()
		    boolean containsKey = m1.containsKey("SAJI");
		    System.out.println(containsKey);
		    
		    //containsvalue()
		    boolean containsValue = m1.containsValue(14);
		    System.out.println(containsValue);
		    
		    //remove()
		    m1.remove("SAJI");
		    System.out.println(m1);
		    
		    //keyset()
		    Set<String> keySet = m1.keySet();
		    System.out.println(keySet);
		    
		    //values()
		    Collection<Integer> values = m1.values();
		    System.out.println(values);
		    
		    
		    System.out.println("========");
		    
		    
		    Set<Entry<String, Integer>> entrySet = m1.entrySet();
		    for(Entry<String, Integer> m:entrySet) {
		    	//entryset()
		    	System.out.println(m);
		    	//getkey()
		    	System.out.println(m.getKey());
		    	//getValue
		    	System.out.println(m.getValue());
		    }
		    System.out.println("=========");
		    
		    
		    
		    
		    
		    
		    
		
		
		

	}
}
