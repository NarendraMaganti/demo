package com.capgemini.map.linkedhashmap;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

public class LinkedHashMap1 {
	public static void main(String[] args) {
		LinkedHashMap<Integer, String> lh=new LinkedHashMap<Integer, String>();
		lh.put(1, "divya");
		lh.put(2, "anu");
		lh.put(3, "phani");
		Set<Entry<Integer, String>> se=lh.entrySet();
		for(Entry<Integer, String> e:se) {
			System.out.println(e.getKey());
			System.out.println(e.getValue());
			System.out.println("-----------");
		}
		System.out.println("-----------keys--------");
		Set<Integer> si=lh.keySet();
		for(Integer p:si ) {
			System.out.println(p);
		}
		System.out.println("-----------values-------");
		Collection<String> col1=lh.values();
		for(String st:col1) {
			System.out.println(st);
		}
		System.out.println(lh.containsKey(1));
		System.out.println(lh.containsValue("phani"));
		
		
		
		
		
		
		
		
		
		
		
	}

}
