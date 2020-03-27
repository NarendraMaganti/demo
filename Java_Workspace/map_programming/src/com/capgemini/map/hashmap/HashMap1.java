package com.capgemini.map.hashmap;

import java.util.*;
import java.util.Map.Entry;

public class HashMap1 {
	public static void main(String[] args) {
		HashMap<String , Integer> h1=new HashMap<String , Integer>();
		h1.put("divya", 1234);
		h1.put("abhi", 2345);
		h1.put("anu", 4567);
		h1.put(null, null);
		h1.put(null, null);//duplicate keys wont allow but but dulpicate values allowed
		System.out.println(h1);
		 Set<Entry<String,Integer>> s1= h1.entrySet();
		 for(Entry<String, Integer> entry:s1) {
			 //System.out.println(entry);
			 System.out.println(entry.getKey());
			 System.out.println(entry.getValue());
			 System.out.println("--------------------");
		 }
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	

}
