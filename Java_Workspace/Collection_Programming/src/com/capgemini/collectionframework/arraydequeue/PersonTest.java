package com.capgemini.collectionframework.arraydequeue;

import java.util.*;

public class PersonTest {
	public static void main(String[] args) {
		ArrayDeque<Person> a1=new ArrayDeque<Person>();
		a1.add(new Person(20, "sai"));
		a1.add(new Person(25, "kamal"));
		a1.add(new Person(30, "narpath"));
		System.out.println(a1);
		System.out.println("--iterator");
		Iterator i=a1.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
		System.out.println("------for each");
		for(Person p:a1) {
			System.out.println(p);
		}
	System.out.println("---remove");
	a1.remove();
	System.out.println(a1);
		
		
	}

}
