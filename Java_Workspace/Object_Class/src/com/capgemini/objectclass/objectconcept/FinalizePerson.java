package com.capgemini.objectclass.objectconcept;

public class FinalizePerson {
	public static void main(String[] args) {
		System.out.println("main started");
		Person p=new Person("saikumar", 23);
		p=null;
		System.gc();
		System.out.println(p);
		System.out.println("main ended");





	}
}
