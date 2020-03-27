package com.capgemini.accessspecifier.pkg1;

public class Student {
	
	protected int age;
	protected String name;
	public Student(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}
	
	protected void details() {
		System.out.println(this.age);
	}

}
