package com.capgemini.exceptionhandling.uncheckedexception;

public class TestB1 {
	public static void main(String[] args) {
		
		System.out.println("Main Started");
		String str=null;
		try {
			System.out.println(10/0);
			System.out.println(str.length());
		}catch(ArithmeticException | NullPointerException e) {
			e.getMessage();
		}
		System.out.println("Main ended");
		
		
		
		
		
	}

}
