package com.capgemini.objectclass.objectconcept;

public class Person {
	String name;
	int age;
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	@Override
	public void finalize() throws Throwable {
		super.finalize();
		System.out.println("Finalize  method called");
	}

	
	
	

}
