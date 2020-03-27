package com.capgemini.exceptionhandling.uncheckedexception;

public class TestA {
	public static void main(String[] args) {
		System.out.println("Main Started");
		System.out.println(10/2);
		try {
			System.out.println(10/0);
		}catch(ArithmeticException e) {
			System.err.println("MATH_ERROR");
		}
		System.out.println(10/5);
		System.out.println("Main Ended");






	}

}
