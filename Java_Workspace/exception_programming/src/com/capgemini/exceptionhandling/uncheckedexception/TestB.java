package com.capgemini.exceptionhandling.uncheckedexception;

public class TestB {
	public static void main(String[] args) {
		
		System.out.println(" Main Started");
		String s1=null;
		try {
			System.out.println(s1.length());
			System.out.println(10/0);
		}catch(NullPointerException e) {
			System.out.println("NullPointerException Handeled");
		}catch(ArithmeticException e) {
			System.out.println("Arithmetic Exception Handled");
		}
		System.out.println("main Ended");
		
		
		
		
		
		
		
		
		
	}
	
	
	

}
