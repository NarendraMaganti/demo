package com.capgemini.map.hashmap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class HashMap2 {
	public static void main(String[] args) {
		
		HashMap<Student,Integer> h2=new HashMap<Student , Integer>();
		h2.put(new Student(20,"abhi"),1);
		h2.put( new Student(25,"divya"),1);
		h2.put(new Student(15,"anu"),1);
		h2.put(new Student(15,"anu"),2);
		System.out.println(h2);
		Set<Entry<Student , Integer>> s=h2.entrySet();
		for(Entry<Student, Integer> entry:s) {
			System.out.println(entry);
			
		}
		System.out.println("----");
		Set<Student> s1=h2.keySet();
		for(Student ss:s1) {
			System.out.println(ss);
		}
		System.out.println("--------");
		Collection<Integer> col=h2.values();
		for(Integer ii:col) {
			System.out.println(ii);
		}
		System.out.println("----");
		
		System.out.println(h2.containsKey( new Student(25,"divya")));
		System.out.println(h2.containsValue(2));
		
		
		
	}

}
