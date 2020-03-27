package com.capgemini.exceptionhandling.exceptionpropogation;

public class MainRunner {
public static void main(String[] args) {
	
	System.out.println("MAIN STARTED");
	try {
	A1.m();
	}catch(ArithmeticException e) {
		System.out.println("EXCEPTION WILL BE HANDLED IN MAIN METHOD");
	}
	System.out.println("MAIN ENDED");
	
	
	
	
	
	
	
	
	
	
}



}
