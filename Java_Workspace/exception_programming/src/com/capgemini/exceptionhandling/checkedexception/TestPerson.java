package com.capgemini.exceptionhandling.checkedexception;

public class TestPerson {
	public static void main(String[] args) {
		System.out.println("Main Started");
		Person p=new Person();
		try {
		p.clone();		
		System.out.println("Object cloned");
		}catch(CloneNotSupportedException e) {
			System.out.println("Clone not supported");
		}
		
		System.out.println("Main Ended");
		
		
		
		}
}
