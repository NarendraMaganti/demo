package com.capgemini.exceptionhandling.checkedexception;

public class TestEmployee1 {
	public static void main(String[] args) {
		System.out.println("Main Started");
		Employee e=new Employee();
		try {
		Class.forName("com.capgemini.exceptionhandling.checkedexception.Employee");
		e.clone();
		}catch(ClassNotFoundException | CloneNotSupportedException p) {
			System.out.println(p.getMessage());
		}
		System.out.println("Main Ended");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
