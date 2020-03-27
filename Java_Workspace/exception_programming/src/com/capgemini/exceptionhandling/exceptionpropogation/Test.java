package com.capgemini.exceptionhandling.exceptionpropogation;

public class Test {
	public static void main(String[] args) {
		
		System.out.println("Main Started");
		try {
			A.m();
		} catch (ClassNotFoundException e) {
			System.out.println("Class NOT Found !!!!!!!!!!!OOPS!!!!!!!!!");
		}
		System.out.println("Main ended");
		
		
	}

}
