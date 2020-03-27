package com.capgemini.map.treemap;
import java.util.*;
import java.util.Map.Entry;
public class TreeMap2 {
	public static void main(String[] args) {
		TreeMap<Person , Integer> t=new TreeMap<Person , Integer>(new SortPersonName());
		t.put(new Person(20,"abhi"), 1);
		t.put(new Person(25, "divya"), 2);
		t.put(new Person(25, "divya"), 3);
	Set<Entry<Person, Integer>> se=t.entrySet();
	for(Entry<Person, Integer> p:se) {
		System.out.println(p);
	}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
