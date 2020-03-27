package com.capgemini.javaBasics;

public class Person {

	static int age;
	String name;

	void details() {
		System.out.println("name= " + this.name + "age is = " + Person.age);
	}

	static void detailsInfo() {
		System.out.println("name= ");

	}

	void add() {
		details();
	}

	public static void main(String[] args) {
		Person p = new Person();
		System.out.println(p.name = "abc");
		System.out.println(Person.age);
		
	}
}
