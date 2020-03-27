package com.capgemini.exceptionhandling.checkedexception;

public class TestEmployee {
	public static void main(String[] args) {
		
		System.out.println("Main Started");
		Employee e=new Employee();
		try {
		Class.forName("com.capgemini.exceptionhandling.checkedexception.Employee");
		e.clone();
		System.out.println("Object cloned");
		}catch(CloneNotSupportedException o) {
			System.out.println("Object cannot be cloned");
		}catch(ClassNotFoundException e1) {
			System.out.println("Class Not Found");
		}
		/*catch(CloneNotSupportedException | ClassNotFoundException o) {
			System.out.println(o.getMessage());
		}
		*/
		System.out.println("Main ended");
		
		
		
	}

}
