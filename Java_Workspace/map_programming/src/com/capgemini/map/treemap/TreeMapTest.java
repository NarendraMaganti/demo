package com.capgemini.map.treemap;

import java.util.ArrayList;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapTest {
	public static void main(String[] args) {
		ArrayList<Student> al=new ArrayList<Student>();
		al.add(new Student(20, "abhi"));
		al.add(new Student(20, "divya"));
		al.add(new Student(20, "pavan"));
		al.add(new Student(20, "hari"));
		TreeMap<Student, ArrayList<Student>> tm=new TreeMap<Student , ArrayList<Student>>();
		tm.put(new Student(10, "saikumar"), al);
		tm.put(new Student(20, "phani"), al);
		Set<Entry<Student , ArrayList<Student>>> se=tm.entrySet();
		for(Entry<Student , ArrayList<Student>> e:se) {
			System.out.println(e.getKey());
			System.out.println(e.getValue());
			System.out.println("-------------------");
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
