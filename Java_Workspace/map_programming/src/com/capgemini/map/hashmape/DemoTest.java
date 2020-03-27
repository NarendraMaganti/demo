package com.capgemini.map.hashmape;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class DemoTest {
	public static void main(String[] args) {
		ArrayList<Student> a1=new ArrayList<Student>();
		a1.add(new Student(9642997747l));
		a1.add(new Student(8542997747l));
		a1.add(new Student(7892997747l));
		a1.add(new Student(63077564895l));
		ArrayList<Student> a2=new ArrayList<Student>();
		a2.add(new Student(9642997747l));
		a2.add(new Student(8542997747l));
		a2.add(new Student(7892997747l));
		a2.add(new Student(63077564895l));
		HashMap<Integer, ArrayList<Student>> h1=new HashMap<Integer,ArrayList<Student>>();
		h1.put(1,a1 );
		h1.put(2, a2);
		Set<Entry<Integer,ArrayList<Student>>> ss=h1.entrySet();
		for(Entry<Integer,ArrayList<Student>> e:ss) {
			System.out.println(e);
		}
			Collection<ArrayList<Student>> al=h1.values();
			for(ArrayList<Student> as:al) {
				System.out.println(as);

		}
		
		System.out.println("---------------");
	
		
		
		
		
		
		
		
		
		
	}
	
	
	

}
