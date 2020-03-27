package com.capgemini.exceptionhandling.uncheckedexception;

public class TestC {
	public static void main(String[] args) {

		System.out.println("Main Started");
		String str=null;
		try {
			try {
				System.out.println(str.length());
			}catch(NullPointerException e) {
				System.out.println(e.getMessage());			
			}
			System.out.println(10/0);
		}catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}

		System.out.println("Main ended");


	}

}
