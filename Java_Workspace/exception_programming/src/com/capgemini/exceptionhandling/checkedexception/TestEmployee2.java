package com.capgemini.exceptionhandling.checkedexception;

public class TestEmployee2 {

	public static void main(String[] args) {

		System.out.println("Main started");
		Employee e=new Employee();
		try {
			try {
				e.clone();
				System.out.println("Object cloning is possible");
			}catch(CloneNotSupportedException p) {
				System.out.println("Object cannot be cloned");
			}
			Class.forName("com.capgemini.exceptionhandling.checkedexception.Employee");
			System.out.println("Class Found");
		} catch (ClassNotFoundException e1) {
			System.out.println("Class not found");
		}


		System.out.println("Main ended");
	}

}
