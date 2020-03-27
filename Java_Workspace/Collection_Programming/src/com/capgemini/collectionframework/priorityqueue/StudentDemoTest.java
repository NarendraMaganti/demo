package com.capgemini.collectionframework.priorityqueue;

import java.util.*;

public class StudentDemoTest {
	public static 
	void main(String[] args) {
		PriorityQueue<Student> p=new PriorityQueue<Student>();
		System.out.println("-----add-----");
		p.add(new Student(1, "adusumalli"));
		p.add(new Student(2,"abhisir"));
		p.add(new Student(3,"krish"));
		p.add(new Student(1, "adusumalli"));
		System.out.println(p);
		System.out.println("------remove----");
		p.remove();
		System.out.println(p);
		System.out.println("-----iterator way");
		Iterator<Student> itr=p.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("-----fore each loop");
		for(Student s:p) {
			System.out.println(s);
		}
		
		
		
		
		
		
		
		
		
	}

}
